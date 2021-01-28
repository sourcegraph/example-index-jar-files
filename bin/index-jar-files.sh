#!/usr/bin/env bash
set -eu

WORKING_DIRECTORY="$PWD"
SOURCES_OUTPUT_DIRECTORY="$PWD/generated/sources"
JAR_OUTPUT_DIRECTORY="$PWD/generated/jars"

mkdir -p "$JAR_OUTPUT_DIRECTORY"
mkdir -p "$SOURCES_OUTPUT_DIRECTORY"

function extract-sources-jar() {
  FILE="$1"
  # Change the working directory to extract the files to the right output
  # directory.  The jar command supports a -C flag that should support this
  # use-case and avoid the need to change the working directory, but I
  # couldn't get it to work.
  echo "$FILE"
  cd "$SOURCES_OUTPUT_DIRECTORY"
  jar xf "$FILE"
  cd "$WORKING_DIRECTORY"
}

function decompile-jar() {
  FILE="$1"
  printf "$FILE "
  for C in $(jar tf "$FILE"); do
    if [[ "$C" == *.class ]]; then
      CLASS_NAME="$(echo ${C%.class} | tr / .)"
      OUTPUT_FILE_NAME="$JAR_OUTPUT_DIRECTORY/$(echo ${C%.class}.java)"
      mkdir -p "$(dirname "$OUTPUT_FILE_NAME")"
      javap -cp "$FILE" "$CLASS_NAME" | tail -n +2 > "$OUTPUT_FILE_NAME" || true
      printf .
    fi
  done
  echo
}

for RELATIVE_FILE_NAME in $(git ls-files); do
  FILE="$WORKING_DIRECTORY/$RELATIVE_FILE_NAME"
  if [[ "$FILE" == *-sources.jar ]]; then
    extract-sources-jar "$FILE"
  elif [[ "$FILE" == *.jar ]]; then
    decompile-jar "$FILE"
    echo
  fi
done
echo "=========="
date

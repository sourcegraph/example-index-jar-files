#!/usr/bin/env bash
set -eu

WORKING_DIRECTORY="$PWD"
JAR_OUTPUT_DIRECTORY="$PWD/generated/jars"

mkdir -p "$JAR_OUTPUT_DIRECTORY"

for RELATIVE_FILE_NAME in $(git ls-files); do
  FILE="$WORKING_DIRECTORY/$RELATIVE_FILE_NAME"
  if [[ "$FILE" == *.jar ]]; then
    OUTPUT_FILE_NAME="$FILE.java"
    javap -classpath "$FILE" $(jar -tf "$FILE" | grep "class$" | sed s/\.class$//) >"$OUTPUT_FILE_NAME"
    echo "$OUTPUT_FILE_NAME"
  fi
done
echo "=========="
date

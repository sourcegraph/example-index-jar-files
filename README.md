# Example how to index source code from `*.jar` files

This repository contains a script [`index-jar-files.sh`](bin/index-jar-files.sh)
that walks through `*.jar` files that are tracked by the git repository and
makes them searchable by Sourcegraph.

> NOTE: The generated sources can't be navigated on Sourcegraph using
> search-based code intelligence.

## Getting started

To use this script, first open the git repository that contains checked in jar
files.

```
cd MY_GIT_REPOSITORY
```

Confirm that you have jar files checked into the git repository.

```
git ls-files | grep jar$
# lib/example.jar
```

Make sure that the output lists the jars that you would like to index in
Sourcesgraph. If the output is empty, then this script won't do anything. Make
sure that

Next, install the `index-jar-files.sh` script

```sh
mkdir -p bin && \
  curl -L -o bin/index-jar-files.sh https://raw.githubusercontent.com/sourcegraph/example-index-jar-files/olafurpg/opengrok/bin/index-jar-files.sh && \
  chmod +x bin/index-jar-files.sh
```

Next, run the script to generate source code from the jars that are checked into
your git repository.

```
./bin/index-jar-files.sh
```

The script may take a while to run if you have a large number of jar files.

Finally, check in the generated source code and push it to a remote branch.

```sh
git checkout -b main-generated
git add -f generated
git commit -m "Run ./bin/index-jar-files.sh"
git push origin main-generated
```

You should be able to navigate the `main-generated` branch on Sourcegraph now.

## Known limitations

- **Inner classes**: The script currently decompiles inner classes as separate
  source files instead of being nested inside the toplevel class. This
  limitation can be fixed by re-implementing the script as a Java program that
  does more advanced analysis of the bytecode. Don't hesitate to open an issue
  to discuss your use-case.
- **Anonymous classes**: The script currently decompiles all classes in the
  `*.jar` files, including anonymous classes that have filenames like
  `Rule$3.java`. You're most likely not interested in viewing these files so
  they may produce a lot of noise.

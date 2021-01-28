# Example how to index source code from `*.jar` files

This repository contains a script [`index-jar-files.sh`](bin/index-jar-files.sh)
that walks through `*.jar` files that are tracked by the git repository and
generates source code in the `generated/` directory.

- extracts raw source code from `*-sources.jar` files
- extracts de-compiled source code from `*.jar` files

The generated sources can be navigated on Sourcegraph using search-based code
intelligence. For example:

- Find references:
  https://sourcegraph.com/github.com/sourcegraph/example-index-jar-files@6e46b65301114c5da78f99ad46a53c0537434ec5/-/blob/generated/sources/org/junit/runners/MethodSorters.java#L14:13&tab=references
- Go to definition:
  https://sourcegraph.com/github.com/sourcegraph/example-index-jar-files@6e46b65301114c5da78f99ad46a53c0537434ec5/-/blob/generated/sources/org/junit/runner/OrderWithValidator.java#L32:37

# EclipseDebugPlugins
Eclipse debug launch configuration plug-ins for JLink and QEMU

This is a fork of the [GNU ARM Eclipse](http://gnuarmeclipse.github.io) debug launch configuration plug-ins.

## How to build

### Prerequisites

- JavaSE-1.8
- Maven 3

### Command line

```
$ git clone --branch=master https://github.com/Ivenix/EclipseDebugPlugins.git
$ cd EclipseDebugPlugins
$ mvn -Dtycho.localArtifacts=ignore clean install
```

The result is a p2 repository, in `com.ivenix-repository/target/repository`.


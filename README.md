# executable-jar-with-maven-example
[![Java CI with Maven](https://github.com/jinahya/executable-jar-with-maven-example/actions/workflows/maven.yml/badge.svg)](https://github.com/jinahya/executable-jar-with-maven-example/actions/workflows/maven.yml)
[![StackOverflow Answer](https://img.shields.io/badge/stackoverflow-answer-blue)](https://stackoverflow.com/a/23986765/330457)

Generates executable jar files with dependencies.

## JDK

Building requires JDK 17+ and Maven 3.6.3+ (enforced by `maven-enforcer-plugin`).
The classes are compiled for Java 8.

```xml
<!-- $ cat pom.xml | egrep '<maven.compiler.' -->
    <maven.compiler.source>1.8</maven.compiler.source>
    <maven.compiler.target>${maven.compiler.source}</maven.compiler.target>
    <maven.compiler.testSource>${maven.compiler.source}</maven.compiler.testSource>
    <maven.compiler.testTarget>${maven.compiler.testSource}</maven.compiler.testTarget>
```

## Just build it!
```
$ mvn clean package
```

All profiles are active by default. Use `-P` to build only some of them, e.g.

```
$ mvn clean package -P shade,spring-boot
```

## And see what you got!
```
$ ls -1 target
```

| Profile                 | Plugin                                                                         | Output                                                         |
|-------------------------|--------------------------------------------------------------------------------|----------------------------------------------------------------|
| `jar-with-dependencies` | `maven-assembly-plugin`                                                        | `${finalName}-jar-with-dependencies.jar`                       |
| `onejar`                | `onejar-maven-plugin`                                                          | `${finalName}-onejar.jar`                                      |
| `shade`                 | `maven-shade-plugin`                                                           | `${finalName}-shaded.jar`                                      |
| `spring-boot`           | `spring-boot-maven-plugin`                                                     | `${finalName}-spring-boot.jar`                                 |
| `quarkus`               | `quarkus-maven-plugin`                                                         | `${finalName}-quarkus.jar`                                     |
| `manual`                | `maven-dependency-plugin`, `maven-jar-plugin`, `maven-antrun-plugin`           | `${finalName}-manual.jar` with `${finalName}-manual.lib/`      |
|                         |                                                                                | `${finalName}-manual.{zip,tar,tar.gz,tar.bz2}`                 |

`${finalName}` is `executable-jar-with-maven-example-<version>`, e.g. `executable-jar-with-maven-example-1.0.2-SNAPSHOT`.

## Run it!

Each executable jar runs on its own.

```
$ java -jar target/executable-jar-with-maven-example-1.0.2-SNAPSHOT-shaded.jar
class com.google.common.io.BaseEncoding
interface com.google.inject.Injector
```

The `-manual.jar` needs its `-manual.lib/` directory next to it, which is what the `-manual.{zip,tar,...}` archives contain.

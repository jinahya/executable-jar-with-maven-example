# executable-jar-with-maven-example
[![Java CI with Maven](https://github.com/jinahya/executable-jar-with-maven-example/actions/workflows/maven.yml/badge.svg)](https://github.com/jinahya/executable-jar-with-maven-example/actions/workflows/maven.yml)
[![StackOverflow Answer](https://img.shields.io/badge/stackoverflow-answer-blue)](https://stackoverflow.com/a/23986765/330457)

Generates executable jar files with dependencies.

## JDK

```commandline
$ cat pom.xml | egrep '<maven.compiler.' 
    <maven.compiler.source>17</maven.compiler.source>
    <maven.compiler.target>${maven.compiler.source}</maven.compiler.target>
    <maven.compiler.release>${maven.compiler.target}</maven.compiler.release>
    <maven.compiler.testSource>${maven.compiler.source}</maven.compiler.testSource>
    <maven.compiler.testTarget>${maven.compiler.testSource}</maven.compiler.testTarget>
    <maven.compiler.testRelease>${maven.compiler.testTarget}</maven.compiler.testRelease>
```

## Just build it!
```
$ mvn clean package
```

## And see what you got!
```
$ ls -1 target
```

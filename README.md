This section contains tutorial notes for building Java packages with Maven.

## Directory Structure

Maven creates a directory tree that looks like the following:
```
root
|--src
|   |--main
|   |   |--java
|   |       |--<package_name>
|   |             |--App.java
|   |
|   |--test
|       |--java
|           |--<package_name>
|                 |--AppTest.java
|
|--target
|   |--<package_jar_name>.jar
|   |--...{bunch of extra output folders}
|
|--pom.xml
```

All source codes goes in `root/src/main/java/<package_name>` with the package hierachy beginning at `<package_name>`

All unit tests goes into `root/src/test/java/<package_name>` with packages importable from `<package_name>`

The `.jar` file in the `target` folder contains the output that the maven `package` command generates (in Visual Studio Code).

`pom.xml` controls the way the maven compiles the output and how it runs etc.

## Jar entry point

To set the entry point of the output jar, you need to find the `maven-jar-plugin` plugin in `pom.xml` and adding the following:

```
<configuration>
  <archive>
    <manifest>
      <mainClass>{package_name}.App</mainClass>
    </manifest>
  </archive>
</configuration>
```
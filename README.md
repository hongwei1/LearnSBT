# LearnSBT
Learn the basic of SBT with the https://www.scala-sbt.org/1.x/docs/Hello.html

## 1 most common sbt commands: 
https://www.scala-sbt.org/1.x/docs/Running.html#Common+commands <br>
clean ---- Deletes all generated files (in the target directory). <br>
compile ---- Compiles the main sources (in src/main/scala and src/main/java directories).<br>
test ---- Compiles and runs all tests.<br>
console ---- Starts the Scala interpreter with a classpath including the compiled sources and all dependencies. To return to sbt, type :quit, Ctrl+D (Unix), or Ctrl+Z (Windows).<br>
run <argument>* ---- Runs the main class for the project in the same virtual machine as sbt.<br>
package ---- Creates a jar file containing the files in src/main/resources and the classes compiled from src/main/scala and src/main/java.<br>
help <command> ---- Displays detailed help for the specified command. If no command is provided, displays brief descriptions of all commands.<br>
reload ---- Reloads the build definition (build.sbt, project/*.scala, project/*.sbt files). Needed if you change the build definition.<br>

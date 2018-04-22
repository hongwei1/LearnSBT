import Dependencies._

// https://www.scala-sbt.org/1.x/docs/Directories.html#Build+support+files
// Build support files
//In addition to build.sbt, project directory can contain .scala files that defines helper objects and one-off plugins. 
// See organizing the build for more.
//
//  build.sbt
//project/
//  Dependencies.scala

//build.sbt defines subprojects, which holds a sequence of key-value pairs 
// called setting expressions using build.sbt DSL

//My first task key. here just define the key.
lazy val hello = taskKey[Unit]("An example task")
//
val derby = "org.apache.derby" % "derby" % "10.4.1.3"

lazy val root = (project in file(".")).
  settings(
    inThisBuild(
      List(
        organization := "com.example",
        scalaVersion := "2.12.5",
        version      := "0.1.0-SNAPSHOT"
        // key     opertator  (setting/task)body
        // A key is an instance of SettingKey[T], TaskKey[T], or InputKey[T] 
        
      )
    ),
    //This a a settingKey, show
    name := "Hello",
    
    //Here, we set the value to the key and call some methods, sbt can use!!
    hello := { println("Hellow Hongwei ,this is the sbt for you  !")},
    
    libraryDependencies += scalaTest % Test,
    libraryDependencies += derby
  )


//build.sbt may also be interspersed with vals, lazy vals, and defs. 
// Top-level objects and classes are not allowed in build.sbt. 
// Those should go in the project/ directory as Scala source files.


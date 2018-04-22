import Dependencies._

// https://www.scala-sbt.org/1.x/docs/Directories.html#Build+support+files
// Build support files
//In addition to build.sbt, project directory can contain .scala files that defines helper objects and one-off plugins. 
// See organizing the build for more.
//
//  build.sbt
//project/
//  Dependencies.scala

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
    name := "Hello",
    
    
    libraryDependencies += scalaTest % Test
  )


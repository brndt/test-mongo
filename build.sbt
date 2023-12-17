ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.3.1"

libraryDependencies += "io.github.kirill5k" %% "mongo4cats-zio" % "0.6.17"
libraryDependencies += "dev.zio" %% "zio" % "2.0.20"
libraryDependencies += "io.github.kirill5k" %% "mongo4cats-zio-embedded" % "0.6.17" % Test

lazy val root = (project in file("."))
  .settings(
    name := "test-mongo"
  )

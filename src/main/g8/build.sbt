import Dependencies._

ThisBuild / scalaVersion     := "2.12.4"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"

lazy val root = (project in file("."))
  .settings(
    name := "$name$",
    libraryDependencies += asta4e
  )
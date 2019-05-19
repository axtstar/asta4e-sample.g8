import Dependencies._

ThisBuild / scalaVersion     := "2.12.4"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "$organization$"
ThisBuild / organizationName := "sample"

lazy val root = (project in file("."))
  .settings(
    name := "$name$",
    libraryDependencies += asta4e
  )
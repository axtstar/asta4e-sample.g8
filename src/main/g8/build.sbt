import Dependencies._

name :="$name$"

ThisBuild / scalaVersion     := "$scalaVersion$"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "$organization$"
ThisBuild / organizationName := "sample"

lazy val root = (project in file("."))
  .settings(
    name := "$name$",
    libraryDependencies += asta4e
  )
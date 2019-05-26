import Dependencies._

name :="$name$"

lazy val commonSettings = Seq(
  version := "0.1-SNAPSHOT",
  organization := "$organization$",
  scalaVersion := "$scalaVersion$",
  test in assembly := {}
)

mainClass in assembly := Some("$organization$.HelloAsta4e")

lazy val root = (project in file("."))
  .settings(
    name := "$name$",
    libraryDependencies += asta4e
  )

resolvers +=
  "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"

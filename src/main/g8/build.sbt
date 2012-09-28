// -*- scala -*-
import AssemblyKeys._

name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "2.9.2"

libraryDependencies := Seq(
  "net.mtgto" %% "scala-irc-bot" % "0.1.0-SNAPSHOT" % "provided",
  "org.specs2" %% "specs2" % "1.12.1" % "test",
  "org.mockito" % "mockito-all" % "1.9.0" % "test"
)

scalacOptions ++= Seq("-deprecation", "-unchecked", "-encoding", "UTF8")

assemblySettings

assembleArtifact in packageScala := false

jarName in assembly := "$name;format="norm"$-assembly-$version$.jar"

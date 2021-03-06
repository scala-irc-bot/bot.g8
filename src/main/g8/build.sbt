// -*- scala -*-
import AssemblyKeys._

name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "2.10.4"

resolvers += "mtgto repos" at "http://scala-irc-bot.github.com/scala-irc-bot/maven/"

libraryDependencies := Seq(
  "net.mtgto" %% "scala-irc-bot" % "0.2.1" % "provided",
  "org.specs2" %% "specs2" % "2.3.11" % "test",
  "org.mockito" % "mockito-all" % "1.9.0" % "test"
)

scalacOptions ++= Seq("-deprecation", "-unchecked", "-feature", "-encoding", "UTF8")

assemblySettings

assembleArtifact in packageScala := false

jarName in assembly := "$name;format="norm"$-assembly-$version$.jar"

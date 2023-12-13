ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.12"
val alchemistClass = "it"
lazy val root = (project in file("."))
  .settings(
    name := "macro-swarm-demo",
    libraryDependencies += "it.unibo.scafi" %% "macro-swarm-alchemist" % "1.4.1"
  )
Compile / mainClass := Some("it.unibo.alchemist.Alchemist")
run / mainClass := Some("it.unibo.alchemist.Alchemist")
addCommandAlias("runAlchemist", "run run src/main/yaml/main.yml")
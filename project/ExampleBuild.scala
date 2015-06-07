
import play.sbt.PlayLayoutPlugin
import sbt.Keys._
import sbt._
import scrupal.sbt.ScrupalPlugin
import scrupal.sbt.ScrupalPlugin.autoImport._
import scala.language.postfixOps

object ExampleBuild extends Build {

  lazy val ExampleProject = Project("scrupal-example", file(".")).
    settings(
      version := "0.1.0-SNAPSHOT",
      organization := "Reactific Software LLC",
      scrupalTitle := "Example Scrupal Module",
      scrupalCopyrightHolder := "Reactific Software LLC",
      scrupalCopyrightYears  := Seq(2015),
      scrupalDeveloperUrl    := new URL("https://github.com/reid-spencer"),
      libraryDependencies    ++= Dependencies.example
    ).
    enablePlugins(ScrupalPlugin).disablePlugins(PlayLayoutPlugin)
}

object Dependencies {

  val scrupal_core = "org.scrupal"         %% "scrupal-core"       % "0.2.0-SNAPSHOT"

  val example = Seq(scrupal_core)
}

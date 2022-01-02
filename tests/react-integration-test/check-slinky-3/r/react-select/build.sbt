organization := "org.scalablytyped"
name := "react-select"
version := "0.0-unknown-aa8af7"
scalaVersion := "3.1.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "me.shadaj" %%% "slinky-web" % "0.7.0",
  "org.scalablytyped" %%% "react" % "16.9.2-f7bd95",
  "org.scalablytyped" %%% "std" % "0.0-unknown-e5c8fc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))

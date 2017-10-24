name := "$name$"

version := "1.0"

scalaVersion := "2.12.3"

lazy val twitter4s = "5.1"

resolvers += Resolver.sonatypeRepo("releases")

libraryDependencies ++= Seq(
  "com.danielasfregola" %% "twitter4s" % "5.1",
  "ch.qos.logback" % "logback-classic" % "1.1.9"
)

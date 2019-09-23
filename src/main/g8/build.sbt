name := "$name$"

version := "1.0"

scalaVersion := "2.12.10"

resolvers += Resolver.sonatypeRepo("releases")

libraryDependencies ++= Seq(
  "com.danielasfregola" %% "twitter4s" % "5.4",
  "ch.qos.logback" % "logback-classic" % "1.1.9"
)

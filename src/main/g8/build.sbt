name := "$name$"

version := "1.0"

scalaVersion := "2.13.1"

resolvers += Resolver.sonatypeRepo("releases")

libraryDependencies ++= Seq(
  "com.danielasfregola" %% "twitter4s" % "6.2",
  "ch.qos.logback" % "logback-classic" % "1.2.3"
)

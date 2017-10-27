name := "$name$"

version := "1.0"

scalaVersion := "2.12.3"

resolvers += Resolver.sonatypeRepo("releases")

libraryDependencies ++= Seq(
  Library.twitter4s,
  Library.logbackClassic
)

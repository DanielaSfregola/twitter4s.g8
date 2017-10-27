import sbt._

object Version {
  final val twitter4s = "5.1"
  final val logbackClassic = "1.1.9"
}

object Library {
  val twitter4s = "com.danielasfregola" %% "twitter4s" % Version.twitter4s
  val logbackClassic = "ch.qos.logback" % "logback-classic" % Version.logbackClassic
}
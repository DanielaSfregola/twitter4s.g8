package $package$

import com.danielasfregola.twitter4s.TwitterRestClient

object $classname$ extends App {

  // Make sure to define the following env variables:
  // TWITTER_CONSUMER_TOKEN_KEY and TWITTER_CONSUMER_TOKEN_SECRET
  // TWITTER_ACCESS_TOKEN_KEY and TWITTER_ACCESS_TOKEN_SECRET
  val client = TwitterRestClient()

}

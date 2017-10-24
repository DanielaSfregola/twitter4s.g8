import com.danielasfregola.twitter4s.TwitterStreamingClient
import com.danielasfregola.twitter4s.entities.Tweet


object StreamingExample extends App {

  // Make sure to define the following env variables:
  // TWITTER_CONSUMER_TOKEN_KEY and TWITTER_CONSUMER_TOKEN_SECRET
  // TWITTER_ACCESS_TOKEN_KEY and TWITTER_ACCESS_TOKEN_SECRET
  val streamingClient = TwitterStreamingClient()

  val trackedWords = Seq("#scala", "#functionalprogramming")

  streamingClient.filterStatuses(tracks = trackedWords) {
    case tweet: Tweet => println(tweet.text)
  }

}

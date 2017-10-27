# twitter4s.g8

[![Build Status](https://travis-ci.org/DanielaSfregola/twitter4s.g8.svg?branch=master)](https://travis-ci.org/DanielaSfregola/twitter4s.g8)  [![License](http://img.shields.io/:license-Apache%202-red.svg)](http://www.apache.org/licenses/LICENSE-2.0.txt) [![Chat](https://badges.gitter.im/Join%20Chat.svg)](https://gitter.im/twitter4s/Lobby)

[Giter8](http://www.foundweekends.org/giter8/) template for a sample application using twitter4s. 

## Usage
Get the template for the sample application:
```
sbt new DanielaSfregola/twitter4s.g8
```

This template will prompt for the name of the project. Press Enter if the default values suit you.

Add your consumer and access token as environment variables:
```bash
export TWITTER_CONSUMER_TOKEN_KEY='my-consumer-key'
export TWITTER_CONSUMER_TOKEN_SECRET='my-consumer-secret'
export TWITTER_ACCESS_TOKEN_KEY='my-access-key'
export TWITTER_ACCESS_TOKEN_SECRET='my-access-secret'
```

The sample project contains examples for both REST and streaming client. 

Run the examples with ```sbt run``` and choose the main to run.

Run template tests with ```sbt test```
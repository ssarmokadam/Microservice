package com.capgemini.twitterService.twittermanagement.service.impl;

import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.twitter.api.Tweet;
import org.springframework.social.twitter.api.Twitter;

import com.capgemini.twitterService.twittermanagement.service.api.TwittermanagementRestService;

/***
 *
 * @author ssarmoka
 *
 */
@Named("TwittermanagementRestService")
public class TwittermanagementRestServiceImpl implements TwittermanagementRestService {

  @Autowired
  private Twitter twitter;

  /**
   * user/password is mythaistarrestaurant@gmail.com / mythaistarrestaurant2501
   */
  @SuppressWarnings("javadoc")
  @Override
  public boolean sendTweet() {

    System.out.println("Hello Twitter-------------------");
    this.twitter.timelineOperations().updateStatus("Test tweet message Microservice1");
    // this.twitter.directMessageOperations().sendDirectMessage("MyThaiStar", "Test tweet message Microservice");
    return true;
  }

  @Override
  public boolean getTweet() {

    System.out.println("In get tweet method");
    long tweetId = 933626371795857408L;
    Tweet tweet = this.twitter.timelineOperations().getStatus(tweetId);
    // TwitterWrapper wrapper = new TwitterWrapper(tweet);
    return true;
  }

}

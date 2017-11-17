package com.capgemini.twitterService.twitter.service.impl.rest;

import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.twitter.api.Twitter;

import com.capgemini.twitterService.twitter.service.api.rest.TwittermanagementRestService;

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

}

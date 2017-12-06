package com.capgemini.twitterService.twittermanagement.service.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.social.twitter.api.Twitter;
import org.springframework.social.twitter.api.impl.TwitterTemplate;
import org.springframework.stereotype.Component;

/***

@author ssarmoka
 *
 */
 @Component
 public class TwitterTemplateCreator {
 @Autowired
 private Environment env;

 @Bean
 public Twitter getTwitterTemplate() {

 String consumerKey = this.env.getProperty("spring.social.twitter.appId");
 String consumerSecret = this.env.getProperty("spring.social.twitter.appSecret");
 String accessToken = this.env.getProperty("spring.social.twitter.accessToken");
 String accessTokenSecret = this.env.getProperty("spring.social.twitter.accessTokenSecret");
 // Preconditions.checkNotNull(consumerKey);
 // Preconditions.checkNotNull(consumerSecret);
 // Preconditions.checkNotNull(accessToken);
 // Preconditions.checkNotNull(accessTokenSecret);
 TwitterTemplate twitterTemplate = new TwitterTemplate(consumerKey, consumerSecret, accessToken, accessTokenSecret);
 return twitterTemplate;
 }
 }

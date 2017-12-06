package com.capgemini.twitterService.twittermanagement.service.api;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.social.twitter.api.Tweet;

/**
 * @author ssarmoka
 *
 */
@FeignClient(value = "twitterService")
public interface TwitterClient {

  @POST
  @Path("/${server.context-path}/services/rest/twitter/sendtweet")
  boolean sendTweet();

  @GET
  @Path("/${server.context-path}/services/rest/twitter/gettweet")
  public Tweet getTweet();
}

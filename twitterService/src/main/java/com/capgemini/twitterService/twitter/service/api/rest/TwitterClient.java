package com.capgemini.twitterService.twitter.service.api.rest;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author ssarmoka
 *
 */
@FeignClient(value = "twitterService")
public interface TwitterClient {

  @RequestMapping(method = RequestMethod.POST, value = "/${server.context-path}/services/rest/twitter/sendtweet")
  boolean sendTweet();
}

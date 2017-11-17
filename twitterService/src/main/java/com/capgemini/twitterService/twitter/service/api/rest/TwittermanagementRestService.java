package com.capgemini.twitterService.twitter.service.api.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.capgemini.twitterService.general.service.api.RestService;

/**
 * @author ssarmoka
 *
 */
@Path("/twitter")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface TwittermanagementRestService extends RestService {

  /**
   * @return
   */
  @POST
  @Path("/sendtweet")
  boolean sendTweet();
}

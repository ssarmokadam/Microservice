package com.capgemini.emailService.eventmanegment.service.api.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.capgemini.emailService.eventmanegment.logic.api.Eventmanegment;
import com.capgemini.emailService.eventmanegment.logic.api.to.EventEto;
import com.capgemini.emailService.eventmanegment.logic.api.to.EventSearchCriteriaTo;

import io.oasp.module.jpa.common.api.to.PaginatedListTo;

/**
 * The service interface for REST calls in order to execute the logic of component {@link Eventmanegment}.
 */
@Path("/eventmanegment/v1")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface EventmanegmentRestService {

  /**
   * Delegates to {@link Eventmanegment#findEvent}.
   *
   * @param id the ID of the {@link EventEto}
   * @return the {@link EventEto}
   */
  @GET
  @Path("/event/{id}/")
  public EventEto getEvent(@PathParam("id") long id);

  /**
   * Delegates to {@link Eventmanegment#saveEvent}.
   *
   * @param event the {@link EventEto} to be saved
   * @return the recently created {@link EventEto}
   */
  @POST
  @Path("/event/")
  public EventEto saveEvent(EventEto event);

  /**
   * Delegates to {@link Eventmanegment#deleteEvent}.
   *
   * @param id ID of the {@link EventEto} to be deleted
   */
  @DELETE
  @Path("/event/{id}/")
  public void deleteEvent(@PathParam("id") long id);

  /**
   * Delegates to {@link Eventmanegment#findEventEtos}.
   *
   * @param searchCriteriaTo the pagination and search criteria to be used for finding events.
   * @return the {@link PaginatedListTo list} of matching {@link EventEto}s.
   */
  @Path("/event/search")
  @POST
  public PaginatedListTo<EventEto> findEventsByPost(EventSearchCriteriaTo searchCriteriaTo);

}
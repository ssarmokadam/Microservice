package com.capgemini.emailService.attendeesmanagment.service.api.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.capgemini.emailService.attendeesmanagment.logic.api.Attendeesmanagment;
import com.capgemini.emailService.attendeesmanagment.logic.api.to.AttendeesEto;
import com.capgemini.emailService.attendeesmanagment.logic.api.to.AttendeesSearchCriteriaTo;

import io.oasp.module.jpa.common.api.to.PaginatedListTo;

/**
 * The service interface for REST calls in order to execute the logic of component {@link Attendeesmanagment}.
 */
@Path("/attendeesmanagment/v1")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface AttendeesmanagmentRestService {

  /**
   * Delegates to {@link Attendeesmanagment#findAttendees}.
   *
   * @param id the ID of the {@link AttendeesEto}
   * @return the {@link AttendeesEto}
   */
  @GET
  @Path("/attendees/{id}/")
  public AttendeesEto getAttendees(@PathParam("id") long id);

  /**
   * Delegates to {@link Attendeesmanagment#saveAttendees}.
   *
   * @param attendees the {@link AttendeesEto} to be saved
   * @return the recently created {@link AttendeesEto}
   */
  @POST
  @Path("/attendees/")
  public AttendeesEto saveAttendees(AttendeesEto attendees);

  /**
   * Delegates to {@link Attendeesmanagment#deleteAttendees}.
   *
   * @param id ID of the {@link AttendeesEto} to be deleted
   */
  @DELETE
  @Path("/attendees/{id}/")
  public void deleteAttendees(@PathParam("id") long id);

  /**
   * Delegates to {@link Attendeesmanagment#findAttendeesEtos}.
   *
   * @param searchCriteriaTo the pagination and search criteria to be used for finding attendeess.
   * @return the {@link PaginatedListTo list} of matching {@link AttendeesEto}s.
   */
  @Path("/attendees/search")
  @POST
  public PaginatedListTo<AttendeesEto> findAttendeessByPost(AttendeesSearchCriteriaTo searchCriteriaTo);

}
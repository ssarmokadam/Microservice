package com.capgemini.emailService.attachmentmanegment.service.api.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.capgemini.emailService.attachmentmanegment.logic.api.Attachmentmanegment;
import com.capgemini.emailService.attachmentmanegment.logic.api.to.AttachmentEto;
import com.capgemini.emailService.attachmentmanegment.logic.api.to.AttachmentSearchCriteriaTo;

import io.oasp.module.jpa.common.api.to.PaginatedListTo;

/**
 * The service interface for REST calls in order to execute the logic of component {@link Attachmentmanegment}.
 */
@Path("/attachmentmanegment/v1")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface AttachmentmanegmentRestService {

  /**
   * Delegates to {@link Attachmentmanegment#findAttachment}.
   *
   * @param id the ID of the {@link AttachmentEto}
   * @return the {@link AttachmentEto}
   */
  @GET
  @Path("/attachment/{id}/")
  public AttachmentEto getAttachment(@PathParam("id") long id);

  /**
   * Delegates to {@link Attachmentmanegment#saveAttachment}.
   *
   * @param attachment the {@link AttachmentEto} to be saved
   * @return the recently created {@link AttachmentEto}
   */
  @POST
  @Path("/attachment/")
  public AttachmentEto saveAttachment(AttachmentEto attachment);

  /**
   * Delegates to {@link Attachmentmanegment#deleteAttachment}.
   *
   * @param id ID of the {@link AttachmentEto} to be deleted
   */
  @DELETE
  @Path("/attachment/{id}/")
  public void deleteAttachment(@PathParam("id") long id);

  /**
   * Delegates to {@link Attachmentmanegment#findAttachmentEtos}.
   *
   * @param searchCriteriaTo the pagination and search criteria to be used for finding attachments.
   * @return the {@link PaginatedListTo list} of matching {@link AttachmentEto}s.
   */
  @Path("/attachment/search")
  @POST
  public PaginatedListTo<AttachmentEto> findAttachmentsByPost(AttachmentSearchCriteriaTo searchCriteriaTo);

}
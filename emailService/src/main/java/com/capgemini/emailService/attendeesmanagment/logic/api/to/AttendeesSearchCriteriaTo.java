package com.capgemini.emailService.attendeesmanagment.logic.api.to;

import io.oasp.module.jpa.common.api.to.SearchCriteriaTo;

/**
 * This is the {@link SearchCriteriaTo search criteria} {@link net.sf.mmm.util.transferobject.api.TransferObject TO}
 * used to find {@link com.capgemini.emailService.attendeesmanagment.common.api.Attendees}s.
 *
 */
public class AttendeesSearchCriteriaTo extends SearchCriteriaTo {

  private static final long serialVersionUID = 1L;

  private Long id;

  private String email;

  private String displayName;

  private Boolean organizer;

  private Boolean optional;

  private String responseStatus;

  private String comment;

  /**
   * The constructor.
   */
  public AttendeesSearchCriteriaTo() {

    super();
  }

  public Long getId() {

    return this.id;
  }

  public void setId(Long id) {

    this.id = id;
  }

  public String getEmail() {

    return this.email;
  }

  public void setEmail(String email) {

    this.email = email;
  }

  public String getDisplayName() {

    return this.displayName;
  }

  public void setDisplayName(String displayName) {

    this.displayName = displayName;
  }

  public Boolean isOrganizer() {

    return this.organizer;
  }

  public void setOrganizer(Boolean organizer) {

    this.organizer = organizer;
  }

  public Boolean isOptional() {

    return this.optional;
  }

  public void setOptional(Boolean optional) {

    this.optional = optional;
  }

  public String getResponseStatus() {

    return this.responseStatus;
  }

  public void setResponseStatus(String responseStatus) {

    this.responseStatus = responseStatus;
  }

  public String getComment() {

    return this.comment;
  }

  public void setComment(String comment) {

    this.comment = comment;
  }

}

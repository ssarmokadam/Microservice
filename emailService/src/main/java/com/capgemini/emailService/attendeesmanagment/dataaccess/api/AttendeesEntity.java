package com.capgemini.emailService.attendeesmanagment.dataaccess.api;

import com.capgemini.emailService.attendeesmanagment.common.api.Attendees;
import com.capgemini.emailService.general.dataaccess.api.ApplicationPersistenceEntity;

/**
 * @author ssarmoka
 */
public class AttendeesEntity extends ApplicationPersistenceEntity implements Attendees {

  private Long id;

  private String email;

  private String displayName;

  private boolean organizer;

  private boolean optional;

  private String responseStatus;

  private String comment;

  private static final long serialVersionUID = 1L;

  /**
   * @return id
   */
  @Override
  public Long getId() {

    return this.id;
  }

  /**
   * @param id new value of {@link #getid}.
   */
  @Override
  public void setId(Long id) {

    this.id = id;
  }

  /**
   * @return email
   */
  public String getEmail() {

    return this.email;
  }

  /**
   * @param email new value of {@link #getemail}.
   */
  public void setEmail(String email) {

    this.email = email;
  }

  /**
   * @return displayName
   */
  public String getDisplayName() {

    return this.displayName;
  }

  /**
   * @param displayName new value of {@link #getdisplayName}.
   */
  public void setDisplayName(String displayName) {

    this.displayName = displayName;
  }

  /**
   * @return organizer
   */
  public boolean isOrganizer() {

    return this.organizer;
  }

  /**
   * @param organizer new value of {@link #getorganizer}.
   */
  public void setOrganizer(boolean organizer) {

    this.organizer = organizer;
  }

  /**
   * @return optional
   */
  public boolean isOptional() {

    return this.optional;
  }

  /**
   * @param optional new value of {@link #getoptional}.
   */
  public void setOptional(boolean optional) {

    this.optional = optional;
  }

  /**
   * @return responseStatus
   */
  public String getResponseStatus() {

    return this.responseStatus;
  }

  /**
   * @param responseStatus new value of {@link #getresponseStatus}.
   */
  public void setResponseStatus(String responseStatus) {

    this.responseStatus = responseStatus;
  }

  /**
   * @return comment
   */
  public String getComment() {

    return this.comment;
  }

  /**
   * @param comment new value of {@link #getcomment}.
   */
  public void setComment(String comment) {

    this.comment = comment;
  }

}

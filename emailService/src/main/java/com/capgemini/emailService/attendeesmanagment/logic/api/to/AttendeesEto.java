package com.capgemini.emailService.attendeesmanagment.logic.api.to;

import com.capgemini.emailService.attendeesmanagment.common.api.Attendees;
import com.capgemini.emailService.general.common.api.to.AbstractEto;

/**
 * Entity transport object of Attendees
 */
public class AttendeesEto extends AbstractEto implements Attendees {

  private static final long serialVersionUID = 1L;

  private Long id;

  private String email;

  private String displayName;

  private boolean organizer;

  private boolean optional;

  private String responseStatus;

  private String comment;

  @Override
  public Long getId() {

    return this.id;
  }

  @Override
  public void setId(Long id) {

    this.id = id;
  }

  @Override
  public String getEmail() {

    return this.email;
  }

  @Override
  public void setEmail(String email) {

    this.email = email;
  }

  @Override
  public String getDisplayName() {

    return this.displayName;
  }

  @Override
  public void setDisplayName(String displayName) {

    this.displayName = displayName;
  }

  @Override
  public boolean isOrganizer() {

    return this.organizer;
  }

  @Override
  public void setOrganizer(boolean organizer) {

    this.organizer = organizer;
  }

  @Override
  public boolean isOptional() {

    return this.optional;
  }

  @Override
  public void setOptional(boolean optional) {

    this.optional = optional;
  }

  @Override
  public String getResponseStatus() {

    return this.responseStatus;
  }

  @Override
  public void setResponseStatus(String responseStatus) {

    this.responseStatus = responseStatus;
  }

  @Override
  public String getComment() {

    return this.comment;
  }

  @Override
  public void setComment(String comment) {

    this.comment = comment;
  }

  @Override
  public int hashCode() {

    final int prime = 31;
    int result = super.hashCode();
    result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
    result = prime * result + ((this.email == null) ? 0 : this.email.hashCode());
    result = prime * result + ((this.displayName == null) ? 0 : this.displayName.hashCode());
    result = prime * result + ((Boolean) this.organizer).hashCode();
    result = prime * result + ((Boolean) this.optional).hashCode();
    result = prime * result + ((this.responseStatus == null) ? 0 : this.responseStatus.hashCode());
    result = prime * result + ((this.comment == null) ? 0 : this.comment.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {

    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    // class check will be done by super type EntityTo!
    if (!super.equals(obj)) {
      return false;
    }
    AttendeesEto other = (AttendeesEto) obj;
    if (this.id == null) {
      if (other.id != null) {
        return false;
      }
    } else if (!this.id.equals(other.id)) {
      return false;
    }
    if (this.email == null) {
      if (other.email != null) {
        return false;
      }
    } else if (!this.email.equals(other.email)) {
      return false;
    }
    if (this.displayName == null) {
      if (other.displayName != null) {
        return false;
      }
    } else if (!this.displayName.equals(other.displayName)) {
      return false;
    }
    if (this.organizer != other.organizer) {
      return false;
    }
    if (this.optional != other.optional) {
      return false;
    }
    if (this.responseStatus == null) {
      if (other.responseStatus != null) {
        return false;
      }
    } else if (!this.responseStatus.equals(other.responseStatus)) {
      return false;
    }
    if (this.comment == null) {
      if (other.comment != null) {
        return false;
      }
    } else if (!this.comment.equals(other.comment)) {
      return false;
    }
    return true;
  }
}

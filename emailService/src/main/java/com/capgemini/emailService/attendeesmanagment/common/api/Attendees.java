package com.capgemini.emailService.attendeesmanagment.common.api;

import com.capgemini.emailService.general.common.api.ApplicationEntity;

public interface Attendees extends ApplicationEntity {

  public Long getId();

  public void setId(Long id);

  public String getEmail();

  public void setEmail(String email);

  public String getDisplayName();

  public void setDisplayName(String displayName);

  public boolean isOrganizer();

  public void setOrganizer(boolean organizer);

  public boolean isOptional();

  public void setOptional(boolean optional);

  public String getResponseStatus();

  public void setResponseStatus(String responseStatus);

  public String getComment();

  public void setComment(String comment);

}

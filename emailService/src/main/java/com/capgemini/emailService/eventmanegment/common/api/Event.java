package com.capgemini.emailService.eventmanegment.common.api;

import java.sql.Date;
import java.util.List;

import com.capgemini.emailService.attachmentmanegment.dataaccess.api.AttachmentEntity;
import com.capgemini.emailService.general.common.api.ApplicationEntity;

public interface Event extends ApplicationEntity {

  public String getKind();

  public void setKind(String kind);

  public Long getId();

  public void setId(Long id);

  public String getHtmlLink();

  public void setHtmlLink(String htmlLink);

  public Date getCreated();

  public void setCreated(Date created);

  public Date getUpdated();

  public void setUpdated(Date updated);

  public String getSummary();

  public void setSummary(String summary);

  public String getDescription();

  public void setDescription(String description);

  public String getLocation();

  public void setLocation(String location);

  public Long getCreatorId();

  public void setCreatorId(Long creatorId);

  public Long getOrganizerId();

  public void setOrganizerId(Long organizerId);

  public List<AttachmentEntity> getAttachments();

  public void setAttachments(List<AttachmentEntity> attachments);

  public Date getStartDate();

  public void setStartDate(Date startDate);

  public Date getEndtDate();

  public void setEndtDate(Date endtDate);

}

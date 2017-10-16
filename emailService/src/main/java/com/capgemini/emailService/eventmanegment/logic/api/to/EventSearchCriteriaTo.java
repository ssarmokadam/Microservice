package com.capgemini.emailService.eventmanegment.logic.api.to;

import java.sql.Date;
import java.util.List;

import com.capgemini.emailService.attachmentmanegment.dataaccess.api.AttachmentEntity;

import io.oasp.module.jpa.common.api.to.SearchCriteriaTo;

/**
 * This is the {@link SearchCriteriaTo search criteria} {@link net.sf.mmm.util.transferobject.api.TransferObject TO}
 * used to find {@link com.capgemini.emailService.eventmanegment.common.api.Event}s.
 *
 */
public class EventSearchCriteriaTo extends SearchCriteriaTo {

  private static final long serialVersionUID = 1L;

  private String kind;

  private Long id;

  private String htmlLink;

  private Date created;

  private Date updated;

  private String summary;

  private String description;

  private String location;

  private Long creatorId;

  private Long organizerId;

  private List<AttachmentEntity> attachments;

  private Date startDate;

  private Date endtDate;

  /**
   * The constructor.
   */
  public EventSearchCriteriaTo() {

    super();
  }

  public String getKind() {

    return this.kind;
  }

  public void setKind(String kind) {

    this.kind = kind;
  }

  public Long getId() {

    return this.id;
  }

  public void setId(Long id) {

    this.id = id;
  }

  public String getHtmlLink() {

    return this.htmlLink;
  }

  public void setHtmlLink(String htmlLink) {

    this.htmlLink = htmlLink;
  }

  public Date getCreated() {

    return this.created;
  }

  public void setCreated(Date created) {

    this.created = created;
  }

  public Date getUpdated() {

    return this.updated;
  }

  public void setUpdated(Date updated) {

    this.updated = updated;
  }

  public String getSummary() {

    return this.summary;
  }

  public void setSummary(String summary) {

    this.summary = summary;
  }

  public String getDescription() {

    return this.description;
  }

  public void setDescription(String description) {

    this.description = description;
  }

  public String getLocation() {

    return this.location;
  }

  public void setLocation(String location) {

    this.location = location;
  }

  public Long getCreatorId() {

    return this.creatorId;
  }

  public void setCreatorId(Long creatorId) {

    this.creatorId = creatorId;
  }

  public Long getOrganizerId() {

    return this.organizerId;
  }

  public void setOrganizerId(Long organizerId) {

    this.organizerId = organizerId;
  }

  public List<AttachmentEntity> getAttachments() {

    return this.attachments;
  }

  public void setAttachments(List<AttachmentEntity> attachments) {

    this.attachments = attachments;
  }

  public Date getStartDate() {

    return this.startDate;
  }

  public void setStartDate(Date startDate) {

    this.startDate = startDate;
  }

  public Date getEndtDate() {

    return this.endtDate;
  }

  public void setEndtDate(Date endtDate) {

    this.endtDate = endtDate;
  }

}

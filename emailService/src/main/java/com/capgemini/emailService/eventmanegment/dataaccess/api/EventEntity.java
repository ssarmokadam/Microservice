package com.capgemini.emailService.eventmanegment.dataaccess.api;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.persistence.Transient;

import com.capgemini.emailService.attachmentmanegment.dataaccess.api.AttachmentEntity;
import com.capgemini.emailService.attendeesmanagment.dataaccess.api.AttendeesEntity;
import com.capgemini.emailService.eventmanegment.common.api.Event;
import com.capgemini.emailService.general.dataaccess.api.ApplicationPersistenceEntity;

/**
 * @author ssarmoka
 */
public class EventEntity extends ApplicationPersistenceEntity implements Serializable, Event {

  /**
   */
  private static final long serialVersionUID = 1L;

  private String kind;

  private Long id;

  private String htmlLink;

  private Date created;

  private Date updated;

  private String summary;

  private String description;

  private String location;

  private AttendeesEntity creator;

  private AttendeesEntity organizer;

  private List<AttendeesEntity> attendees;

  private List<AttachmentEntity> attachments;

  private Date startDate;

  private Date endtDate;

  /**
   * @return kind
   */
  public String getKind() {

    return this.kind;
  }

  /**
   * @param kind new value of {@link #getkind}.
   */
  public void setKind(String kind) {

    this.kind = kind;
  }

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
   * @return htmlLink
   */
  public String getHtmlLink() {

    return this.htmlLink;
  }

  /**
   * @param htmlLink new value of {@link #gethtmlLink}.
   */
  public void setHtmlLink(String htmlLink) {

    this.htmlLink = htmlLink;
  }

  /**
   * @return created
   */
  public Date getCreated() {

    return this.created;
  }

  /**
   * @param created new value of {@link #getcreated}.
   */
  public void setCreated(Date created) {

    this.created = created;
  }

  /**
   * @return updated
   */
  public Date getUpdated() {

    return this.updated;
  }

  /**
   * @param updated new value of {@link #getupdated}.
   */
  public void setUpdated(Date updated) {

    this.updated = updated;
  }

  /**
   * @return summary
   */
  public String getSummary() {

    return this.summary;
  }

  /**
   * @param summary new value of {@link #getsummary}.
   */
  public void setSummary(String summary) {

    this.summary = summary;
  }

  /**
   * @return description
   */
  public String getDescription() {

    return this.description;
  }

  /**
   * @param description new value of {@link #getdescription}.
   */
  public void setDescription(String description) {

    this.description = description;
  }

  /**
   * @return location
   */
  public String getLocation() {

    return this.location;
  }

  /**
   * @param location new value of {@link #getlocation}.
   */
  public void setLocation(String location) {

    this.location = location;
  }

  /**
   * @return creator
   */
  public AttendeesEntity getCreator() {

    return this.creator;
  }

  /**
   * @param creator new value of {@link #getcreator}.
   */
  public void setCreator(AttendeesEntity creator) {

    this.creator = creator;
  }

  /**
   * @return organizer
   */
  public AttendeesEntity getOrganizer() {

    return this.organizer;
  }

  /**
   * @param organizer new value of {@link #getorganizer}.
   */
  public void setOrganizer(AttendeesEntity organizer) {

    this.organizer = organizer;
  }

  /**
   * @return attendees
   */
  public List<AttendeesEntity> getAttendees() {

    return this.attendees;
  }

  /**
   * @param attendees new value of {@link #getattendees}.
   */
  public void setAttendees(List<AttendeesEntity> attendees) {

    this.attendees = attendees;
  }

  /**
   * @return attachments
   */
  public List<AttachmentEntity> getAttachments() {

    return this.attachments;
  }

  /**
   * @param attachments new value of {@link #getattachments}.
   */
  public void setAttachments(List<AttachmentEntity> attachments) {

    this.attachments = attachments;
  }

  /**
   * @return startDate
   */
  public Date getStartDate() {

    return this.startDate;
  }

  /**
   * @param startDate new value of {@link #getstartDate}.
   */
  public void setStartDate(Date startDate) {

    this.startDate = startDate;
  }

  /**
   * @return endtDate
   */
  public Date getEndtDate() {

    return this.endtDate;
  }

  /**
   * @param endtDate new value of {@link #getendtDate}.
   */
  public void setEndtDate(Date endtDate) {

    this.endtDate = endtDate;
  }

  /**
   * @return serialversionuid
   */
  public static long getSerialversionuid() {

    return serialVersionUID;
  }

  @Override
  @Transient
  public Long getCreatorId() {

    if (this.creator == null) {
      return null;
    }
    return this.creator.getId();
  }

  @Override
  public void setCreatorId(Long creatorId) {

    if (creatorId == null) {
      this.creator = null;
    } else {
      AttendeesEntity attendeesEntity = new AttendeesEntity();
      attendeesEntity.setId(creatorId);
      this.creator = attendeesEntity;
    }
  }

  @Override
  @Transient
  public Long getOrganizerId() {

    if (this.organizer == null) {
      return null;
    }
    return this.organizer.getId();
  }

  @Override
  public void setOrganizerId(Long organizerId) {

    if (organizerId == null) {
      this.organizer = null;
    } else {
      AttendeesEntity attendeesEntity = new AttendeesEntity();
      attendeesEntity.setId(organizerId);
      this.organizer = attendeesEntity;
    }
  }

}

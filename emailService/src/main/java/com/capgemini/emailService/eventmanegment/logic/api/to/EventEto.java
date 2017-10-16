package com.capgemini.emailService.eventmanegment.logic.api.to;

import java.sql.Date;
import java.util.List;

import com.capgemini.emailService.attachmentmanegment.dataaccess.api.AttachmentEntity;
import com.capgemini.emailService.eventmanegment.common.api.Event;
import com.capgemini.emailService.general.common.api.to.AbstractEto;

/**
 * Entity transport object of Event
 */
public class EventEto extends AbstractEto implements Event {

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

  @Override
  public String getKind() {

    return this.kind;
  }

  @Override
  public void setKind(String kind) {

    this.kind = kind;
  }

  @Override
  public Long getId() {

    return this.id;
  }

  @Override
  public void setId(Long id) {

    this.id = id;
  }

  @Override
  public String getHtmlLink() {

    return this.htmlLink;
  }

  @Override
  public void setHtmlLink(String htmlLink) {

    this.htmlLink = htmlLink;
  }

  @Override
  public Date getCreated() {

    return this.created;
  }

  @Override
  public void setCreated(Date created) {

    this.created = created;
  }

  @Override
  public Date getUpdated() {

    return this.updated;
  }

  @Override
  public void setUpdated(Date updated) {

    this.updated = updated;
  }

  @Override
  public String getSummary() {

    return this.summary;
  }

  @Override
  public void setSummary(String summary) {

    this.summary = summary;
  }

  @Override
  public String getDescription() {

    return this.description;
  }

  @Override
  public void setDescription(String description) {

    this.description = description;
  }

  @Override
  public String getLocation() {

    return this.location;
  }

  @Override
  public void setLocation(String location) {

    this.location = location;
  }

  @Override
  public Long getCreatorId() {

    return this.creatorId;
  }

  @Override
  public void setCreatorId(Long creatorId) {

    this.creatorId = creatorId;
  }

  @Override
  public Long getOrganizerId() {

    return this.organizerId;
  }

  @Override
  public void setOrganizerId(Long organizerId) {

    this.organizerId = organizerId;
  }

  @Override
  public List<AttachmentEntity> getAttachments() {

    return this.attachments;
  }

  @Override
  public void setAttachments(List<AttachmentEntity> attachments) {

    this.attachments = attachments;
  }

  @Override
  public Date getStartDate() {

    return this.startDate;
  }

  @Override
  public void setStartDate(Date startDate) {

    this.startDate = startDate;
  }

  @Override
  public Date getEndtDate() {

    return this.endtDate;
  }

  @Override
  public void setEndtDate(Date endtDate) {

    this.endtDate = endtDate;
  }

  @Override
  public int hashCode() {

    final int prime = 31;
    int result = super.hashCode();
    result = prime * result + ((this.kind == null) ? 0 : this.kind.hashCode());
    result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
    result = prime * result + ((this.htmlLink == null) ? 0 : this.htmlLink.hashCode());
    result = prime * result + ((this.created == null) ? 0 : this.created.hashCode());
    result = prime * result + ((this.updated == null) ? 0 : this.updated.hashCode());
    result = prime * result + ((this.summary == null) ? 0 : this.summary.hashCode());
    result = prime * result + ((this.description == null) ? 0 : this.description.hashCode());
    result = prime * result + ((this.location == null) ? 0 : this.location.hashCode());

    result = prime * result + ((this.creatorId == null) ? 0 : this.creatorId.hashCode());

    result = prime * result + ((this.organizerId == null) ? 0 : this.organizerId.hashCode());

    result = prime * result + ((this.attachments == null) ? 0 : this.attachments.hashCode());
    result = prime * result + ((this.startDate == null) ? 0 : this.startDate.hashCode());
    result = prime * result + ((this.endtDate == null) ? 0 : this.endtDate.hashCode());
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
    EventEto other = (EventEto) obj;
    if (this.kind == null) {
      if (other.kind != null) {
        return false;
      }
    } else if (!this.kind.equals(other.kind)) {
      return false;
    }
    if (this.id == null) {
      if (other.id != null) {
        return false;
      }
    } else if (!this.id.equals(other.id)) {
      return false;
    }
    if (this.htmlLink == null) {
      if (other.htmlLink != null) {
        return false;
      }
    } else if (!this.htmlLink.equals(other.htmlLink)) {
      return false;
    }
    if (this.created == null) {
      if (other.created != null) {
        return false;
      }
    } else if (!this.created.equals(other.created)) {
      return false;
    }
    if (this.updated == null) {
      if (other.updated != null) {
        return false;
      }
    } else if (!this.updated.equals(other.updated)) {
      return false;
    }
    if (this.summary == null) {
      if (other.summary != null) {
        return false;
      }
    } else if (!this.summary.equals(other.summary)) {
      return false;
    }
    if (this.description == null) {
      if (other.description != null) {
        return false;
      }
    } else if (!this.description.equals(other.description)) {
      return false;
    }
    if (this.location == null) {
      if (other.location != null) {
        return false;
      }
    } else if (!this.location.equals(other.location)) {
      return false;
    }

    if (this.creatorId == null) {
      if (other.creatorId != null) {
        return false;
      }
    } else if (!this.creatorId.equals(other.creatorId)) {
      return false;
    }

    if (this.organizerId == null) {
      if (other.organizerId != null) {
        return false;
      }
    } else if (!this.organizerId.equals(other.organizerId)) {
      return false;
    }

    if (this.attachments == null) {
      if (other.attachments != null) {
        return false;
      }
    } else if (!this.attachments.equals(other.attachments)) {
      return false;
    }
    if (this.startDate == null) {
      if (other.startDate != null) {
        return false;
      }
    } else if (!this.startDate.equals(other.startDate)) {
      return false;
    }
    if (this.endtDate == null) {
      if (other.endtDate != null) {
        return false;
      }
    } else if (!this.endtDate.equals(other.endtDate)) {
      return false;
    }
    return true;
  }
}

package com.capgemini.emailService.attachmentmanegment.logic.api.to;

import com.capgemini.emailService.attachmentmanegment.common.api.Attachment;
import com.capgemini.emailService.general.common.api.to.AbstractEto;

/**
 * Entity transport object of Attachment
 */
public class AttachmentEto extends AbstractEto implements Attachment {

  private static final long serialVersionUID = 1L;

  private String fileUrl;

  private String title;

  private String mimeType;

  private String iconLink;

  private String fileId;

  @Override
  public String getFileUrl() {

    return fileUrl;
  }

  @Override
  public void setFileUrl(String fileUrl) {

    this.fileUrl = fileUrl;
  }

  @Override
  public String getTitle() {

    return title;
  }

  @Override
  public void setTitle(String title) {

    this.title = title;
  }

  @Override
  public String getMimeType() {

    return mimeType;
  }

  @Override
  public void setMimeType(String mimeType) {

    this.mimeType = mimeType;
  }

  @Override
  public String getIconLink() {

    return iconLink;
  }

  @Override
  public void setIconLink(String iconLink) {

    this.iconLink = iconLink;
  }

  @Override
  public String getFileId() {

    return fileId;
  }

  @Override
  public void setFileId(String fileId) {

    this.fileId = fileId;
  }

  @Override
  public int hashCode() {

    final int prime = 31;
    int result = super.hashCode();
    result = prime * result + ((this.fileUrl == null) ? 0 : this.fileUrl.hashCode());
    result = prime * result + ((this.title == null) ? 0 : this.title.hashCode());
    result = prime * result + ((this.mimeType == null) ? 0 : this.mimeType.hashCode());
    result = prime * result + ((this.iconLink == null) ? 0 : this.iconLink.hashCode());
    result = prime * result + ((this.fileId == null) ? 0 : this.fileId.hashCode());
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
    AttachmentEto other = (AttachmentEto) obj;
    if (this.fileUrl == null) {
      if (other.fileUrl != null) {
        return false;
      }
    } else if (!this.fileUrl.equals(other.fileUrl)) {
      return false;
    }
    if (this.title == null) {
      if (other.title != null) {
        return false;
      }
    } else if (!this.title.equals(other.title)) {
      return false;
    }
    if (this.mimeType == null) {
      if (other.mimeType != null) {
        return false;
      }
    } else if (!this.mimeType.equals(other.mimeType)) {
      return false;
    }
    if (this.iconLink == null) {
      if (other.iconLink != null) {
        return false;
      }
    } else if (!this.iconLink.equals(other.iconLink)) {
      return false;
    }
    if (this.fileId == null) {
      if (other.fileId != null) {
        return false;
      }
    } else if (!this.fileId.equals(other.fileId)) {
      return false;
    }
    return true;
  }
}

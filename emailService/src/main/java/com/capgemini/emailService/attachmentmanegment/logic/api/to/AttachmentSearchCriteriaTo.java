package com.capgemini.emailService.attachmentmanegment.logic.api.to;

import io.oasp.module.jpa.common.api.to.SearchCriteriaTo;

/**
 * This is the {@link SearchCriteriaTo search criteria} {@link net.sf.mmm.util.transferobject.api.TransferObject TO}
 * used to find {@link com.capgemini.emailService.attachmentmanegment.common.api.Attachment}s.
 *
 */
public class AttachmentSearchCriteriaTo extends SearchCriteriaTo {

  private static final long serialVersionUID = 1L;

  private String fileUrl;

  private String title;

  private String mimeType;

  private String iconLink;

  private String fileId;

  /**
   * The constructor.
   */
  public AttachmentSearchCriteriaTo() {

    super();
  }

  public String getFileUrl() {

    return fileUrl;
  }

  public void setFileUrl(String fileUrl) {

    this.fileUrl = fileUrl;
  }

  public String getTitle() {

    return title;
  }

  public void setTitle(String title) {

    this.title = title;
  }

  public String getMimeType() {

    return mimeType;
  }

  public void setMimeType(String mimeType) {

    this.mimeType = mimeType;
  }

  public String getIconLink() {

    return iconLink;
  }

  public void setIconLink(String iconLink) {

    this.iconLink = iconLink;
  }

  public String getFileId() {

    return fileId;
  }

  public void setFileId(String fileId) {

    this.fileId = fileId;
  }

}

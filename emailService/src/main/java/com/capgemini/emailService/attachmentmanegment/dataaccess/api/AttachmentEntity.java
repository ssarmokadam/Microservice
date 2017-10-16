package com.capgemini.emailService.attachmentmanegment.dataaccess.api;

import java.io.Serializable;

import com.capgemini.emailService.attachmentmanegment.common.api.Attachment;
import com.capgemini.emailService.general.dataaccess.api.ApplicationPersistenceEntity;

/**
 * @author ssarmoka
 */
public class AttachmentEntity extends ApplicationPersistenceEntity implements Serializable, Attachment {

  /**
   */
  private static final long serialVersionUID = 1L;

  private String fileUrl;

  private String title;

  private String mimeType;

  private String iconLink;

  private String fileId;

  /**
   * @return fileUrl
   */
  public String getFileUrl() {

    return this.fileUrl;
  }

  /**
   * @param fileUrl new value of {@link #getfileUrl}.
   */
  public void setFileUrl(String fileUrl) {

    this.fileUrl = fileUrl;
  }

  /**
   * @return title
   */
  public String getTitle() {

    return this.title;
  }

  /**
   * @param title new value of {@link #gettitle}.
   */
  public void setTitle(String title) {

    this.title = title;
  }

  /**
   * @return mimeType
   */
  public String getMimeType() {

    return this.mimeType;
  }

  /**
   * @param mimeType new value of {@link #getmimeType}.
   */
  public void setMimeType(String mimeType) {

    this.mimeType = mimeType;
  }

  /**
   * @return iconLink
   */
  public String getIconLink() {

    return this.iconLink;
  }

  /**
   * @param iconLink new value of {@link #geticonLink}.
   */
  public void setIconLink(String iconLink) {

    this.iconLink = iconLink;
  }

  /**
   * @return fileId
   */
  public String getFileId() {

    return this.fileId;
  }

  /**
   * @param fileId new value of {@link #getfileId}.
   */
  public void setFileId(String fileId) {

    this.fileId = fileId;
  }

}

package com.capgemini.emailService.attachmentmanegment.common.api;

import com.capgemini.emailService.general.common.api.ApplicationEntity;

public interface Attachment extends ApplicationEntity {

  public String getFileUrl();

  public void setFileUrl(String fileUrl);

  public String getTitle();

  public void setTitle(String title);

  public String getMimeType();

  public void setMimeType(String mimeType);

  public String getIconLink();

  public void setIconLink(String iconLink);

  public String getFileId();

  public void setFileId(String fileId);

}

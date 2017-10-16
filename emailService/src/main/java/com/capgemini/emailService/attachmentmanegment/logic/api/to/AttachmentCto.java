package com.capgemini.emailService.attachmentmanegment.logic.api.to;

import com.capgemini.emailService.general.common.api.to.AbstractCto;

/**
 * Composite transport object of Attachment
 */
public class AttachmentCto extends AbstractCto {

  private static final long serialVersionUID = 1L;

  private AttachmentEto attachment;

  public AttachmentEto getAttachment() {

    return attachment;
  }

  public void setAttachment(AttachmentEto attachment) {

    this.attachment = attachment;
  }

}

package com.capgemini.emailService.attachmentmanegment.service.impl.rest;

import javax.inject.Inject;
import javax.inject.Named;

import com.capgemini.emailService.attachmentmanegment.logic.api.Attachmentmanegment;
import com.capgemini.emailService.attachmentmanegment.logic.api.to.AttachmentEto;
import com.capgemini.emailService.attachmentmanegment.logic.api.to.AttachmentSearchCriteriaTo;
import com.capgemini.emailService.attachmentmanegment.service.api.rest.AttachmentmanegmentRestService;

import io.oasp.module.jpa.common.api.to.PaginatedListTo;

/**
 * The service implementation for REST calls in order to execute the logic of component {@link Attachmentmanegment}.
 */
@Named("AttachmentmanegmentRestService")
public class AttachmentmanegmentRestServiceImpl implements AttachmentmanegmentRestService {

  @Inject
  private Attachmentmanegment attachmentmanegment;

  @Override
  public AttachmentEto getAttachment(long id) {

    return this.attachmentmanegment.findAttachment(id);
  }

  @Override
  public AttachmentEto saveAttachment(AttachmentEto attachment) {

    return this.attachmentmanegment.saveAttachment(attachment);
  }

  @Override
  public void deleteAttachment(long id) {

    this.attachmentmanegment.deleteAttachment(id);
  }

  @Override
  public PaginatedListTo<AttachmentEto> findAttachmentsByPost(AttachmentSearchCriteriaTo searchCriteriaTo) {

    return this.attachmentmanegment.findAttachmentEtos(searchCriteriaTo);
  }

}
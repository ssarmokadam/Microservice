package com.capgemini.emailService.attachmentmanegment.dataaccess.api.dao;

import com.capgemini.emailService.attachmentmanegment.dataaccess.api.AttachmentEntity;
import com.capgemini.emailService.attachmentmanegment.logic.api.to.AttachmentSearchCriteriaTo;
import com.capgemini.emailService.general.dataaccess.api.dao.ApplicationDao;

import io.oasp.module.jpa.common.api.to.PaginatedListTo;

/**
 * Data access interface for Attachment entities
 */
public interface AttachmentDao extends ApplicationDao<AttachmentEntity> {

  /**
   * Finds the {@link AttachmentEntity attachments} matching the given {@link AttachmentSearchCriteriaTo}.
   *
   * @param criteria is the {@link AttachmentSearchCriteriaTo}.
   * @return the {@link PaginatedListTo} with the matching {@link AttachmentEntity} objects.
   */
  PaginatedListTo<AttachmentEntity> findAttachments(AttachmentSearchCriteriaTo criteria);
}

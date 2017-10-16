package com.capgemini.emailService.attachmentmanegment.logic.api;

import com.capgemini.emailService.attachmentmanegment.logic.api.to.AttachmentEto;
import com.capgemini.emailService.attachmentmanegment.logic.api.to.AttachmentSearchCriteriaTo;

import io.oasp.module.jpa.common.api.to.PaginatedListTo;

/**
 * Interface for Attachmentmanegment component.
 */
public interface Attachmentmanegment {

  /**
   * Returns a Attachment by its id 'id'.
   *
   * @param id The id 'id' of the Attachment.
   * @return The {@link AttachmentEto} with id 'id'
   */
  AttachmentEto findAttachment(Long id);

  /**
   * Returns a paginated list of Attachments matching the search criteria.
   *
   * @param criteria the {@link AttachmentSearchCriteriaTo}.
   * @return the {@link List} of matching {@link AttachmentEto}s.
   */
  PaginatedListTo<AttachmentEto> findAttachmentEtos(AttachmentSearchCriteriaTo criteria);

  /**
   * Deletes a attachment from the database by its id 'attachmentId'.
   *
   * @param attachmentId Id of the attachment to delete
   * @return boolean <code>true</code> if the attachment can be deleted, <code>false</code> otherwise
   */
  boolean deleteAttachment(Long attachmentId);

  /**
   * Saves a attachment and store it in the database.
   *
   * @param attachment the {@link AttachmentEto} to create.
   * @return the new {@link AttachmentEto} that has been saved with ID and version.
   */
  AttachmentEto saveAttachment(AttachmentEto attachment);

}
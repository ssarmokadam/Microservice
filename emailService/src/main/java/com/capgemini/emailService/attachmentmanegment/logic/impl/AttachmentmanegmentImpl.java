package com.capgemini.emailService.attachmentmanegment.logic.impl;

import java.util.Objects;

import javax.inject.Inject;
import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;

import com.capgemini.emailService.attachmentmanegment.dataaccess.api.AttachmentEntity;
import com.capgemini.emailService.attachmentmanegment.dataaccess.api.dao.AttachmentDao;
import com.capgemini.emailService.attachmentmanegment.logic.api.Attachmentmanegment;
import com.capgemini.emailService.attachmentmanegment.logic.api.to.AttachmentEto;
import com.capgemini.emailService.attachmentmanegment.logic.api.to.AttachmentSearchCriteriaTo;
import com.capgemini.emailService.general.logic.base.AbstractComponentFacade;

import io.oasp.module.jpa.common.api.to.PaginatedListTo;

/**
 * Implementation of component interface of attachmentmanegment
 */
@Named
@Transactional
public class AttachmentmanegmentImpl extends AbstractComponentFacade implements Attachmentmanegment {

  /** Logger instance. */
  private static final Logger LOG = LoggerFactory.getLogger(AttachmentmanegmentImpl.class);

  /** @see #getAttachmentDao() */
  @Inject
  private AttachmentDao attachmentDao;

  /**
   * The constructor.
   */
  public AttachmentmanegmentImpl() {
    super();
  }

  @Override
  public AttachmentEto findAttachment(Long id) {

    LOG.debug("Get Attachment with id {} from database.", id);
    return getBeanMapper().map(getAttachmentDao().findOne(id), AttachmentEto.class);
  }

  @Override
  public PaginatedListTo<AttachmentEto> findAttachmentEtos(AttachmentSearchCriteriaTo criteria) {

    criteria.limitMaximumPageSize(MAXIMUM_HIT_LIMIT);
    PaginatedListTo<AttachmentEntity> attachments = getAttachmentDao().findAttachments(criteria);
    return mapPaginatedEntityList(attachments, AttachmentEto.class);
  }

  @Override
  public boolean deleteAttachment(Long attachmentId) {

    AttachmentEntity attachment = getAttachmentDao().find(attachmentId);
    getAttachmentDao().delete(attachment);
    LOG.debug("The attachment with id '{}' has been deleted.", attachmentId);
    return true;
  }

  @Override
  public AttachmentEto saveAttachment(AttachmentEto attachment) {

    Objects.requireNonNull(attachment, "attachment");
    AttachmentEntity attachmentEntity = getBeanMapper().map(attachment, AttachmentEntity.class);

    // initialize, validate attachmentEntity here if necessary
    AttachmentEntity resultEntity = getAttachmentDao().save(attachmentEntity);
    LOG.debug("Attachment with id '{}' has been created.", resultEntity.getId());

    return getBeanMapper().map(resultEntity, AttachmentEto.class);
  }

  /**
   * Returns the field 'attachmentDao'.
   * 
   * @return the {@link AttachmentDao} instance.
   */
  public AttachmentDao getAttachmentDao() {

    return this.attachmentDao;
  }

}
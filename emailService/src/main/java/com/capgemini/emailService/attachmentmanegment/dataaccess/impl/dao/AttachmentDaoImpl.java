package com.capgemini.emailService.attachmentmanegment.dataaccess.impl.dao;

import javax.inject.Named;

import com.capgemini.emailService.attachmentmanegment.dataaccess.api.AttachmentEntity;
import com.capgemini.emailService.attachmentmanegment.dataaccess.api.dao.AttachmentDao;
import com.capgemini.emailService.attachmentmanegment.logic.api.to.AttachmentSearchCriteriaTo;
import com.capgemini.emailService.general.dataaccess.base.dao.ApplicationDaoImpl;
import com.mysema.query.alias.Alias;
import com.mysema.query.jpa.impl.JPAQuery;
import com.mysema.query.types.path.EntityPathBase;

import io.oasp.module.jpa.common.api.to.PaginatedListTo;

/**
 * This is the implementation of {@link AttachmentDao}.
 */
@Named
public class AttachmentDaoImpl extends ApplicationDaoImpl<AttachmentEntity> implements AttachmentDao {

  /**
   * The constructor.
   */
  public AttachmentDaoImpl() {

    super();
  }

  @Override
  public Class<AttachmentEntity> getEntityClass() {

    return AttachmentEntity.class;
  }

  @Override
  public PaginatedListTo<AttachmentEntity> findAttachments(AttachmentSearchCriteriaTo criteria) {

    AttachmentEntity attachment = Alias.alias(AttachmentEntity.class);
    EntityPathBase<AttachmentEntity> alias = Alias.$(attachment);
    JPAQuery query = new JPAQuery(getEntityManager()).from(alias);

    String fileUrl = criteria.getFileUrl();
    if (fileUrl != null) {
      query.where(Alias.$(attachment.getFileUrl()).eq(fileUrl));
    }
    String title = criteria.getTitle();
    if (title != null) {
      query.where(Alias.$(attachment.getTitle()).eq(title));
    }
    String mimeType = criteria.getMimeType();
    if (mimeType != null) {
      query.where(Alias.$(attachment.getMimeType()).eq(mimeType));
    }
    String iconLink = criteria.getIconLink();
    if (iconLink != null) {
      query.where(Alias.$(attachment.getIconLink()).eq(iconLink));
    }
    String fileId = criteria.getFileId();
    if (fileId != null) {
      query.where(Alias.$(attachment.getFileId()).eq(fileId));
    }
    return findPaginated(criteria, query, alias);
  }

}
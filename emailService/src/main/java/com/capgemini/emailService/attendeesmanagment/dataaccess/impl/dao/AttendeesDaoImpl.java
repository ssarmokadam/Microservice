package com.capgemini.emailService.attendeesmanagment.dataaccess.impl.dao;

import javax.inject.Named;

import com.capgemini.emailService.attendeesmanagment.dataaccess.api.AttendeesEntity;
import com.capgemini.emailService.attendeesmanagment.dataaccess.api.dao.AttendeesDao;
import com.capgemini.emailService.attendeesmanagment.logic.api.to.AttendeesSearchCriteriaTo;
import com.capgemini.emailService.general.dataaccess.base.dao.ApplicationDaoImpl;
import com.mysema.query.alias.Alias;
import com.mysema.query.jpa.impl.JPAQuery;
import com.mysema.query.types.path.EntityPathBase;

import io.oasp.module.jpa.common.api.to.PaginatedListTo;

/**
 * This is the implementation of {@link AttendeesDao}.
 */
@Named
public class AttendeesDaoImpl extends ApplicationDaoImpl<AttendeesEntity> implements AttendeesDao {

  /**
   * The constructor.
   */
  public AttendeesDaoImpl() {

    super();
  }

  @Override
  public Class<AttendeesEntity> getEntityClass() {

    return AttendeesEntity.class;
  }

  @Override
  public PaginatedListTo<AttendeesEntity> findAttendeess(AttendeesSearchCriteriaTo criteria) {

    AttendeesEntity attendees = Alias.alias(AttendeesEntity.class);
    EntityPathBase<AttendeesEntity> alias = Alias.$(attendees);
    JPAQuery query = new JPAQuery(getEntityManager()).from(alias);

    Long id = criteria.getId();
    if (id != null) {
      query.where(Alias.$(attendees.getId()).eq(id));
    }
    String email = criteria.getEmail();
    if (email != null) {
      query.where(Alias.$(attendees.getEmail()).eq(email));
    }
    String displayName = criteria.getDisplayName();
    if (displayName != null) {
      query.where(Alias.$(attendees.getDisplayName()).eq(displayName));
    }
    Boolean organizer = criteria.isOrganizer();
    if (organizer != null) {
      query.where(Alias.$(attendees.isOrganizer()).eq(organizer));
    }
    Boolean optional = criteria.isOptional();
    if (optional != null) {
      query.where(Alias.$(attendees.isOptional()).eq(optional));
    }
    String responseStatus = criteria.getResponseStatus();
    if (responseStatus != null) {
      query.where(Alias.$(attendees.getResponseStatus()).eq(responseStatus));
    }
    String comment = criteria.getComment();
    if (comment != null) {
      query.where(Alias.$(attendees.getComment()).eq(comment));
    }
    return findPaginated(criteria, query, alias);
  }

}
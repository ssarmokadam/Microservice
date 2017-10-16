package com.capgemini.emailService.eventmanegment.dataaccess.impl.dao;

import java.sql.Date;

import javax.inject.Named;

import com.capgemini.emailService.eventmanegment.dataaccess.api.EventEntity;
import com.capgemini.emailService.eventmanegment.dataaccess.api.dao.EventDao;
import com.capgemini.emailService.eventmanegment.logic.api.to.EventSearchCriteriaTo;
import com.capgemini.emailService.general.dataaccess.base.dao.ApplicationDaoImpl;
import com.mysema.query.alias.Alias;
import com.mysema.query.jpa.impl.JPAQuery;
import com.mysema.query.types.path.EntityPathBase;

import io.oasp.module.jpa.common.api.to.PaginatedListTo;

/**
 * This is the implementation of {@link EventDao}.
 */
@Named
public class EventDaoImpl extends ApplicationDaoImpl<EventEntity> implements EventDao {

  /**
   * The constructor.
   */
  public EventDaoImpl() {

    super();
  }

  @Override
  public Class<EventEntity> getEntityClass() {

    return EventEntity.class;
  }

  @Override
  public PaginatedListTo<EventEntity> findEvents(EventSearchCriteriaTo criteria) {

    EventEntity event = Alias.alias(EventEntity.class);
    EntityPathBase<EventEntity> alias = Alias.$(event);
    JPAQuery query = new JPAQuery(getEntityManager()).from(alias);

    String kind = criteria.getKind();
    if (kind != null) {
      query.where(Alias.$(event.getKind()).eq(kind));
    }
    Long id = criteria.getId();
    if (id != null) {
      query.where(Alias.$(event.getId()).eq(id));
    }
    String htmlLink = criteria.getHtmlLink();
    if (htmlLink != null) {
      query.where(Alias.$(event.getHtmlLink()).eq(htmlLink));
    }
    Date created = criteria.getCreated();
    if (created != null) {
      query.where(Alias.$(event.getCreated()).eq(created));
    }
    Date updated = criteria.getUpdated();
    if (updated != null) {
      query.where(Alias.$(event.getUpdated()).eq(updated));
    }
    String summary = criteria.getSummary();
    if (summary != null) {
      query.where(Alias.$(event.getSummary()).eq(summary));
    }
    String description = criteria.getDescription();
    if (description != null) {
      query.where(Alias.$(event.getDescription()).eq(description));
    }
    String location = criteria.getLocation();
    if (location != null) {
      query.where(Alias.$(event.getLocation()).eq(location));
    }
    Long creator = criteria.getCreatorId();
    if (creator != null) {
      if (event.getCreator() != null) {
        query.where(Alias.$(event.getCreator().getId()).eq(creator));
      }
    }
    Long organizer = criteria.getOrganizerId();
    if (organizer != null) {
      if (event.getOrganizer() != null) {
        query.where(Alias.$(event.getOrganizer().getId()).eq(organizer));
      }
    }
    Date startDate = criteria.getStartDate();
    if (startDate != null) {
      query.where(Alias.$(event.getStartDate()).eq(startDate));
    }
    Date endtDate = criteria.getEndtDate();
    if (endtDate != null) {
      query.where(Alias.$(event.getEndtDate()).eq(endtDate));
    }
    return findPaginated(criteria, query, alias);
  }

}
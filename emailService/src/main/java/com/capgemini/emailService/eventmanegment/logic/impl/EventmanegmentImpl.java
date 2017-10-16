package com.capgemini.emailService.eventmanegment.logic.impl;

import java.util.Objects;

import javax.inject.Inject;
import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;

import com.capgemini.emailService.eventmanegment.dataaccess.api.EventEntity;
import com.capgemini.emailService.eventmanegment.dataaccess.api.dao.EventDao;
import com.capgemini.emailService.eventmanegment.logic.api.Eventmanegment;
import com.capgemini.emailService.eventmanegment.logic.api.to.EventEto;
import com.capgemini.emailService.eventmanegment.logic.api.to.EventSearchCriteriaTo;
import com.capgemini.emailService.general.logic.base.AbstractComponentFacade;

import io.oasp.module.jpa.common.api.to.PaginatedListTo;

/**
 * Implementation of component interface of eventmanegment
 */
@Named
@Transactional
public class EventmanegmentImpl extends AbstractComponentFacade implements Eventmanegment {

  /** Logger instance. */
  private static final Logger LOG = LoggerFactory.getLogger(EventmanegmentImpl.class);

  /** @see #getEventDao() */
  @Inject
  private EventDao eventDao;

  /**
   * The constructor.
   */
  public EventmanegmentImpl() {
    super();
  }

  @Override
  public EventEto findEvent(Long id) {

    LOG.debug("Get Event with id {} from database.", id);
    return getBeanMapper().map(getEventDao().findOne(id), EventEto.class);
  }

  @Override
  public PaginatedListTo<EventEto> findEventEtos(EventSearchCriteriaTo criteria) {

    criteria.limitMaximumPageSize(MAXIMUM_HIT_LIMIT);
    PaginatedListTo<EventEntity> events = getEventDao().findEvents(criteria);
    return mapPaginatedEntityList(events, EventEto.class);
  }

  @Override
  public boolean deleteEvent(Long eventId) {

    EventEntity event = getEventDao().find(eventId);
    getEventDao().delete(event);
    LOG.debug("The event with id '{}' has been deleted.", eventId);
    return true;
  }

  @Override
  public EventEto saveEvent(EventEto event) {

    Objects.requireNonNull(event, "event");
    EventEntity eventEntity = getBeanMapper().map(event, EventEntity.class);

    // initialize, validate eventEntity here if necessary
    EventEntity resultEntity = getEventDao().save(eventEntity);
    LOG.debug("Event with id '{}' has been created.", resultEntity.getId());

    return getBeanMapper().map(resultEntity, EventEto.class);
  }

  /**
   * Returns the field 'eventDao'.
   * 
   * @return the {@link EventDao} instance.
   */
  public EventDao getEventDao() {

    return this.eventDao;
  }

}
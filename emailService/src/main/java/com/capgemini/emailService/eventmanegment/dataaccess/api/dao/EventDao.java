package com.capgemini.emailService.eventmanegment.dataaccess.api.dao;

import com.capgemini.emailService.eventmanegment.dataaccess.api.EventEntity;
import com.capgemini.emailService.eventmanegment.logic.api.to.EventSearchCriteriaTo;
import com.capgemini.emailService.general.dataaccess.api.dao.ApplicationDao;

import io.oasp.module.jpa.common.api.to.PaginatedListTo;

/**
 * Data access interface for Event entities
 */
public interface EventDao extends ApplicationDao<EventEntity> {

  /**
   * Finds the {@link EventEntity events} matching the given {@link EventSearchCriteriaTo}.
   *
   * @param criteria is the {@link EventSearchCriteriaTo}.
   * @return the {@link PaginatedListTo} with the matching {@link EventEntity} objects.
   */
  PaginatedListTo<EventEntity> findEvents(EventSearchCriteriaTo criteria);
}

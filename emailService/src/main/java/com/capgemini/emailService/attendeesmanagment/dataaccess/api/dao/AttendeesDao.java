package com.capgemini.emailService.attendeesmanagment.dataaccess.api.dao;

import com.capgemini.emailService.attendeesmanagment.dataaccess.api.AttendeesEntity;
import com.capgemini.emailService.attendeesmanagment.logic.api.to.AttendeesSearchCriteriaTo;
import com.capgemini.emailService.general.dataaccess.api.dao.ApplicationDao;

import io.oasp.module.jpa.common.api.to.PaginatedListTo;

/**
 * Data access interface for Attendees entities
 */
public interface AttendeesDao extends ApplicationDao<AttendeesEntity> {

  /**
   * Finds the {@link AttendeesEntity attendeess} matching the given {@link AttendeesSearchCriteriaTo}.
   *
   * @param criteria is the {@link AttendeesSearchCriteriaTo}.
   * @return the {@link PaginatedListTo} with the matching {@link AttendeesEntity} objects.
   */
  PaginatedListTo<AttendeesEntity> findAttendeess(AttendeesSearchCriteriaTo criteria);
}

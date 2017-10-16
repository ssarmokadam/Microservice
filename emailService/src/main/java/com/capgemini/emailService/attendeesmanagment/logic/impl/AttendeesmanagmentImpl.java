package com.capgemini.emailService.attendeesmanagment.logic.impl;

import java.util.Objects;

import javax.inject.Inject;
import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;

import com.capgemini.emailService.attendeesmanagment.dataaccess.api.AttendeesEntity;
import com.capgemini.emailService.attendeesmanagment.dataaccess.api.dao.AttendeesDao;
import com.capgemini.emailService.attendeesmanagment.logic.api.Attendeesmanagment;
import com.capgemini.emailService.attendeesmanagment.logic.api.to.AttendeesEto;
import com.capgemini.emailService.attendeesmanagment.logic.api.to.AttendeesSearchCriteriaTo;
import com.capgemini.emailService.general.logic.base.AbstractComponentFacade;

import io.oasp.module.jpa.common.api.to.PaginatedListTo;

/**
 * Implementation of component interface of attendeesmanagment
 */
@Named
@Transactional
public class AttendeesmanagmentImpl extends AbstractComponentFacade implements Attendeesmanagment {

  /** Logger instance. */
  private static final Logger LOG = LoggerFactory.getLogger(AttendeesmanagmentImpl.class);

  /** @see #getAttendeesDao() */
  @Inject
  private AttendeesDao attendeesDao;

  /**
   * The constructor.
   */
  public AttendeesmanagmentImpl() {
    super();
  }

  @Override
  public AttendeesEto findAttendees(Long id) {

    LOG.debug("Get Attendees with id {} from database.", id);
    return getBeanMapper().map(getAttendeesDao().findOne(id), AttendeesEto.class);
  }

  @Override
  public PaginatedListTo<AttendeesEto> findAttendeesEtos(AttendeesSearchCriteriaTo criteria) {

    criteria.limitMaximumPageSize(MAXIMUM_HIT_LIMIT);
    PaginatedListTo<AttendeesEntity> attendeess = getAttendeesDao().findAttendeess(criteria);
    return mapPaginatedEntityList(attendeess, AttendeesEto.class);
  }

  @Override
  public boolean deleteAttendees(Long attendeesId) {

    AttendeesEntity attendees = getAttendeesDao().find(attendeesId);
    getAttendeesDao().delete(attendees);
    LOG.debug("The attendees with id '{}' has been deleted.", attendeesId);
    return true;
  }

  @Override
  public AttendeesEto saveAttendees(AttendeesEto attendees) {

    Objects.requireNonNull(attendees, "attendees");
    AttendeesEntity attendeesEntity = getBeanMapper().map(attendees, AttendeesEntity.class);

    // initialize, validate attendeesEntity here if necessary
    AttendeesEntity resultEntity = getAttendeesDao().save(attendeesEntity);
    LOG.debug("Attendees with id '{}' has been created.", resultEntity.getId());

    return getBeanMapper().map(resultEntity, AttendeesEto.class);
  }

  /**
   * Returns the field 'attendeesDao'.
   * 
   * @return the {@link AttendeesDao} instance.
   */
  public AttendeesDao getAttendeesDao() {

    return this.attendeesDao;
  }

}
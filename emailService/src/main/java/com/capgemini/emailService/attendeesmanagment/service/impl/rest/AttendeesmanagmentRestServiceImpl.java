package com.capgemini.emailService.attendeesmanagment.service.impl.rest;

import javax.inject.Inject;
import javax.inject.Named;

import com.capgemini.emailService.attendeesmanagment.logic.api.Attendeesmanagment;
import com.capgemini.emailService.attendeesmanagment.logic.api.to.AttendeesEto;
import com.capgemini.emailService.attendeesmanagment.logic.api.to.AttendeesSearchCriteriaTo;
import com.capgemini.emailService.attendeesmanagment.service.api.rest.AttendeesmanagmentRestService;

import io.oasp.module.jpa.common.api.to.PaginatedListTo;

/**
 * The service implementation for REST calls in order to execute the logic of component {@link Attendeesmanagment}.
 */
@Named("AttendeesmanagmentRestService")
public class AttendeesmanagmentRestServiceImpl implements AttendeesmanagmentRestService {

  @Inject
  private Attendeesmanagment attendeesmanagment;

  @Override
  public AttendeesEto getAttendees(long id) {

    return this.attendeesmanagment.findAttendees(id);
  }

  @Override
  public AttendeesEto saveAttendees(AttendeesEto attendees) {

    return this.attendeesmanagment.saveAttendees(attendees);
  }

  @Override
  public void deleteAttendees(long id) {

    this.attendeesmanagment.deleteAttendees(id);
  }

  @Override
  public PaginatedListTo<AttendeesEto> findAttendeessByPost(AttendeesSearchCriteriaTo searchCriteriaTo) {

    return this.attendeesmanagment.findAttendeesEtos(searchCriteriaTo);
  }

}
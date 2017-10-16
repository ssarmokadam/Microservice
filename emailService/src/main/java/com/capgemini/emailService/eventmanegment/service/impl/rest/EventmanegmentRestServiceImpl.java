package com.capgemini.emailService.eventmanegment.service.impl.rest;

import javax.inject.Inject;
import javax.inject.Named;

import com.capgemini.emailService.eventmanegment.logic.api.Eventmanegment;
import com.capgemini.emailService.eventmanegment.logic.api.to.EventEto;
import com.capgemini.emailService.eventmanegment.logic.api.to.EventSearchCriteriaTo;
import com.capgemini.emailService.eventmanegment.service.api.rest.EventmanegmentRestService;

import io.oasp.module.jpa.common.api.to.PaginatedListTo;

/**
 * The service implementation for REST calls in order to execute the logic of component {@link Eventmanegment}.
 */
@Named("EventmanegmentRestService")
public class EventmanegmentRestServiceImpl implements EventmanegmentRestService {

  @Inject
  private Eventmanegment eventmanegment;

  @Override
  public EventEto getEvent(long id) {

    return this.eventmanegment.findEvent(id);
  }

  @Override
  public EventEto saveEvent(EventEto event) {

    return this.eventmanegment.saveEvent(event);
  }

  @Override
  public void deleteEvent(long id) {

    this.eventmanegment.deleteEvent(id);
  }

  @Override
  public PaginatedListTo<EventEto> findEventsByPost(EventSearchCriteriaTo searchCriteriaTo) {

    return this.eventmanegment.findEventEtos(searchCriteriaTo);
  }

}
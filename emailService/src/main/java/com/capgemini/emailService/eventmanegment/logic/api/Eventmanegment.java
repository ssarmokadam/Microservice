package com.capgemini.emailService.eventmanegment.logic.api;

import com.capgemini.emailService.eventmanegment.logic.api.to.EventEto;
import com.capgemini.emailService.eventmanegment.logic.api.to.EventSearchCriteriaTo;

import io.oasp.module.jpa.common.api.to.PaginatedListTo;

/**
 * Interface for Eventmanegment component.
 */
public interface Eventmanegment {

  /**
   * Returns a Event by its id 'id'.
   *
   * @param id The id 'id' of the Event.
   * @return The {@link EventEto} with id 'id'
   */
  EventEto findEvent(Long id);

  /**
   * Returns a paginated list of Events matching the search criteria.
   *
   * @param criteria the {@link EventSearchCriteriaTo}.
   * @return the {@link List} of matching {@link EventEto}s.
   */
  PaginatedListTo<EventEto> findEventEtos(EventSearchCriteriaTo criteria);

  /**
   * Deletes a event from the database by its id 'eventId'.
   *
   * @param eventId Id of the event to delete
   * @return boolean <code>true</code> if the event can be deleted, <code>false</code> otherwise
   */
  boolean deleteEvent(Long eventId);

  /**
   * Saves a event and store it in the database.
   *
   * @param event the {@link EventEto} to create.
   * @return the new {@link EventEto} that has been saved with ID and version.
   */
  EventEto saveEvent(EventEto event);

}
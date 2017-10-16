package com.capgemini.emailService.attendeesmanagment.logic.api;

import com.capgemini.emailService.attendeesmanagment.logic.api.to.AttendeesEto;
import com.capgemini.emailService.attendeesmanagment.logic.api.to.AttendeesSearchCriteriaTo;

import io.oasp.module.jpa.common.api.to.PaginatedListTo;

/**
 * Interface for Attendeesmanagment component.
 */
public interface Attendeesmanagment {

  /**
   * Returns a Attendees by its id 'id'.
   *
   * @param id The id 'id' of the Attendees.
   * @return The {@link AttendeesEto} with id 'id'
   */
  AttendeesEto findAttendees(Long id);

  /**
   * Returns a paginated list of Attendeess matching the search criteria.
   *
   * @param criteria the {@link AttendeesSearchCriteriaTo}.
   * @return the {@link List} of matching {@link AttendeesEto}s.
   */
  PaginatedListTo<AttendeesEto> findAttendeesEtos(AttendeesSearchCriteriaTo criteria);

  /**
   * Deletes a attendees from the database by its id 'attendeesId'.
   *
   * @param attendeesId Id of the attendees to delete
   * @return boolean <code>true</code> if the attendees can be deleted, <code>false</code> otherwise
   */
  boolean deleteAttendees(Long attendeesId);

  /**
   * Saves a attendees and store it in the database.
   *
   * @param attendees the {@link AttendeesEto} to create.
   * @return the new {@link AttendeesEto} that has been saved with ID and version.
   */
  AttendeesEto saveAttendees(AttendeesEto attendees);

}
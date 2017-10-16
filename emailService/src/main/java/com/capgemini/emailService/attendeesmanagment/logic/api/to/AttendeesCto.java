package com.capgemini.emailService.attendeesmanagment.logic.api.to;

import com.capgemini.emailService.general.common.api.to.AbstractCto;

/**
 * Composite transport object of Attendees
 */
public class AttendeesCto extends AbstractCto {

  private static final long serialVersionUID = 1L;

  private AttendeesEto attendees;

  public AttendeesEto getAttendees() {

    return attendees;
  }

  public void setAttendees(AttendeesEto attendees) {

    this.attendees = attendees;
  }

}

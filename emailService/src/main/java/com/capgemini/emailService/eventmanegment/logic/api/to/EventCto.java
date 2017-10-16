package com.capgemini.emailService.eventmanegment.logic.api.to;

import java.util.List;

import com.capgemini.emailService.attendeesmanagment.logic.api.to.AttendeesEto;
import com.capgemini.emailService.general.common.api.to.AbstractCto;

/**
 * Composite transport object of Event
 */
public class EventCto extends AbstractCto {

  private static final long serialVersionUID = 1L;

  private EventEto event;

  private AttendeesEto creator;

  private AttendeesEto organizer;

  private List<AttendeesEto> attendees;

  public EventEto getEvent() {

    return this.event;
  }

  public void setEvent(EventEto event) {

    this.event = event;
  }

  public AttendeesEto getCreator() {

    return this.creator;
  }

  public void setCreator(AttendeesEto creator) {

    this.creator = creator;
  }

  public AttendeesEto getOrganizer() {

    return this.organizer;
  }

  public void setOrganizer(AttendeesEto organizer) {

    this.organizer = organizer;
  }

  public List<AttendeesEto> getAttendees() {

    return this.attendees;
  }

  public void setAttendees(List<AttendeesEto> attendees) {

    this.attendees = attendees;
  }

}

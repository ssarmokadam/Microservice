package com.capgemini.emailService.eventmanegment.service.api.rest;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.capgemini.emailService.eventmanegment.logic.api.to.EventEto;

@FeignClient(value = "emailService")
public interface EmailServiceClient {

  @RequestMapping(method = RequestMethod.POST, value = "/${server.context-path}/services/rest/eventmanegment/v1/event")
  EventEto saveEvent(EventEto event);

}
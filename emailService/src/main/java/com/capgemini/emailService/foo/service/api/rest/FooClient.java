package com.capgemini.emailService.foo.service.api.rest;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.capgemini.emailService.foo.service.api.FooMessageTo;

@FeignClient(value = "emailService")
public interface FooClient {

  @RequestMapping(method = RequestMethod.GET, value = "/${server.context-path}/services/rest/foomanagement/v1/foo")
  FooMessageTo foo();

}
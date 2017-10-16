package com.capgemini.emailService.foo.service.impl.rest;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Value;

import com.capgemini.emailService.foo.service.api.FooMessageTo;
import com.capgemini.emailService.foo.service.api.rest.FooClient;
import com.capgemini.emailService.foo.service.api.rest.FoomanagementRestService;

/**
 */
@Named("FoomanagementRestService")
public class FoomanagementRestServiceImpl implements FoomanagementRestService {

  @Inject
  FooClient fooClient;

  @Value("${msgFromConfigServer}")
  String msgFromConfigServer;

  @Override
  public FooMessageTo foo() {

    return new FooMessageTo(this.msgFromConfigServer);
  }

  @Override
  public FooMessageTo fooRemote() {

    return this.fooClient.foo();
  }

}

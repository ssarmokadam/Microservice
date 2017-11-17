package com.capgemini.twitterService.foo.service.impl.rest;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import com.capgemini.twitterService.foo.service.api.FooMessageTo;
import com.capgemini.twitterService.foo.service.api.rest.FooClient;
import com.capgemini.twitterService.foo.service.api.rest.FoomanagementRestService;


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
    
    return new FooMessageTo(msgFromConfigServer);
  }

  @Override
  public FooMessageTo fooRemote() {

    return this.fooClient.foo();
  }
  
}

package com.capgemini.emailService.general.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.ws.config.annotation.EnableWs;

import com.capgemini.emailService.general.configuration.api.AbstractServiceConfig;

/**
 * {@link Configuration} for (REST or SOAP) services using CXF.
 */
@Configuration
@EnableWs
@ImportResource({ "classpath:META-INF/cxf/cxf.xml" })
public class ServiceConfig extends AbstractServiceConfig {

}
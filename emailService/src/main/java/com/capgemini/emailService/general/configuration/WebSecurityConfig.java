package com.capgemini.emailService.general.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import com.capgemini.devonfw.microservices.configuration.jwt.JsonWebTokenSecurityConfig;
import com.capgemini.devonfw.microservices.configuration.jwt.JsonWebTokenUtility;

/**
 * Security configuration based on {@link WebSecurityConfigurerAdapter}.
 *
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends JsonWebTokenSecurityConfig {

  @Override
  public JsonWebTokenUtility getJsonWebTokenUtility() {

    return new JsonWebTokenUtility();
  }

  @Override
  protected void setupAuthorization(HttpSecurity http) throws Exception {

    // Unsecure resources (triggers for actuator and more)
    String[] unsecuredResources = new String[] { "/health", "/info", "/metrics", "/trace", "/refresh", };

    http.authorizeRequests()
        // authenticate all other requests
        .antMatchers(unsecuredResources).permitAll()
        // authenticate all other requests
        .anyRequest().authenticated();
  }

}

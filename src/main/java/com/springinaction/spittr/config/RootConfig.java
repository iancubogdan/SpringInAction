package com.springinaction.spittr.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by Bogdan on 12/23/2015.
 */
@Configuration
@ComponentScan(basePackages={"com.springinaction.spittr"}, excludeFilters={@ComponentScan.Filter(type= FilterType.ANNOTATION, value=EnableWebMvc.class)})
public class RootConfig {
}

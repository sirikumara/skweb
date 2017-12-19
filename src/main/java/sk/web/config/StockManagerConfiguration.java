/* Copyright (C) MovoCash, Inc - All Rights Reserved.
 *
 * This file is part of the MovoCash software solution.
 *
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential.
 * Written by Sirikumara Ranathunga <siri@movo.cash>, Month YYYY
 */
package sk.web.config;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * This class is a replacement of dispatcher-servlet.xml
 * @author Sirikumara Ranathunga
 */

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "sk.web.*")
public class StockManagerConfiguration {
    
    private static final Logger LOGGER = Logger.getLogger(StockManagerConfiguration.class);
    
    @Bean
    public ViewResolver viewResolver(){
        LOGGER.info("Initializing viewResolver bean.");
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/jsp/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }
}

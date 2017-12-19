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
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * This class will be initialized and its onStartup method will be called by
 * servlet container.
 *
 * @author Sirikumara Ranathunga
 */
public class StockManagerInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
private static final Logger LOGGER = Logger.getLogger(StockManagerInitializer.class);
    
    @Override
    protected Class<?>[] getRootConfigClasses() {
        LOGGER.info("getRootConfigClasses called");
        return new Class[]{StockManagerConfiguration.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        LOGGER.info("getServletConfigClasses called");
        return null;
    }

    @Override
    protected String[] getServletMappings() {
        LOGGER.info("getServletMappings called");
        return new String[]{"/"};
    }
}

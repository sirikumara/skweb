/* Copyright (C) MovoCash, Inc - All Rights Reserved.
 *
 * This file is part of the MovoCash software solution.
 *
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential.
 * Written by Sirikumara Ranathunga <siri@movo.cash>, Month YYYY
 */
package sk.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Sirikumara Ranathunga
 */

@Controller
@RequestMapping("stock-manager")
public class StockManagerController {
    
    @RequestMapping("item")
    public String showPage(ModelMap modelMap){
        System.out.println("showPage method started.");
        modelMap.addAttribute("message", "This message from the admin.");
        return "item";
    }
}

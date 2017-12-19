/* Copyright (C) MovoCash, Inc - All Rights Reserved.
 *
 * This file is part of the MovoCash software solution.
 *
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential.
 * Written by Sirikumara Ranathunga <siri@movo.cash>, Month YYYY
 */
package sk.web.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sk.web.domain.Item;

/**
 *
 * @author Sirikumara Ranathunga
 */
@RestController
@RequestMapping("api")
public class StockManagerResource {

    @RequestMapping("stock-name")
    public String getStockName() {
        return "Grossery 1";
    }

    @RequestMapping("item-book")
    public Item getItem() {
        Item item = new Item();
        item.setName("Book");
        item.setPrice(50.50);
        return item;
    }
}

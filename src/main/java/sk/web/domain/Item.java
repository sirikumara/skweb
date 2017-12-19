/* Copyright (C) MovoCash, Inc - All Rights Reserved.
 *
 * This file is part of the MovoCash software solution.
 *
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential.
 * Written by Sirikumara Ranathunga <siri@movo.cash>, Month YYYY
 */
package sk.web.domain;

/**
 *
 * @author Sirikumara Ranathunga
 */
public class Item {
    private String name;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
}

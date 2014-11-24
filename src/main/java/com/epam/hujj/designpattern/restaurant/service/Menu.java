package com.epam.hujj.designpattern.restaurant.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.epam.hujj.designpattern.restaurant.domain.Product;

public class Menu {

    private Logger logger = LoggerFactory.getLogger(Menu.class);
    private List<Product> products = new ArrayList<Product>();

    public double getHappiness(final double clientHappiness) {
        double happiness = clientHappiness;
        for (Product p : products) {
            happiness = p.calculateHappiness(happiness);
            logger.debug(p.getName() + " Happiness: " + happiness);
        }
        return happiness;
    }

    public Menu(List<Product> products) {
        super();
        this.products = products;
    }

}

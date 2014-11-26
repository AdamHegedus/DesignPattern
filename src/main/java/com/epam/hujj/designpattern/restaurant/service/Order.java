package com.epam.hujj.designpattern.restaurant.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.epam.hujj.designpattern.restaurant.menu.Menu;

public class Order {

    private Logger logger = LoggerFactory.getLogger(Order.class);
    private Menu menu;
    private Client client;

    /**
     * Creates new Order object with the menu and client fields.
     * @param menu
     * @param client
     */
    public Order(Menu menu, Client client) {
        super();
        this.menu = menu;
        this.client = client;

        logger.info("A new order is been placed by client (happiness = "
                + client.getHappiness() + ")");
        logger.info(menu.toString());
    }

    /**
     * Gets the menu.
     * @return the menu
     */
    public Menu getMenu() {
        return menu;
    }

    /**
     * Gets the client.
     * @return the client
     */
    public Client getClient() {
        return client;
    }

}

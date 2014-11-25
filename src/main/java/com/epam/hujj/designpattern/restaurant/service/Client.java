package com.epam.hujj.designpattern.restaurant.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.epam.hujj.designpattern.restaurant.menu.Menu;

/**
 * Client comes in a restaurant and has an initial happiness. Client can order a
 * menu and consume it.
 * @author adam_hegedus
 */
public class Client implements ClientType {

    private Logger logger = LoggerFactory.getLogger(Client.class);
    private double happiness;
    private Menu menu;

    /**
     * Sets the default happiness for the client when it's coming in the
     * restaurant.
     * @param happiness, the default happiness
     */
    public Client(final double happiness) {
        this.happiness = happiness;
    }

    @Override
    public void consume() {
        logger.debug("Happiness before consuming food: " + this.happiness);
        happiness = menu.getFullMenuHappinessModifier(happiness);
        logger.debug("Happiness after food consumed: " + this.happiness);
    }

    @Override
    public void orderMenu(final Menu menu) {
        this.menu = menu;
    }

    /**
     * Retrieves the happiness of the client.
     * @return happiness
     */
    public double getHappiness() {
        return happiness;
    }

}

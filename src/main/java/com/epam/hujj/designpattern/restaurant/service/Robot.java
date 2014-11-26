package com.epam.hujj.designpattern.restaurant.service;

import java.util.concurrent.LinkedBlockingQueue;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.epam.hujj.designpattern.restaurant.menu.Menu;

public class Robot implements Runnable {

    private Logger logger = LoggerFactory.getLogger(Robot.class);
    private LinkedBlockingQueue<Order> orders = new LinkedBlockingQueue<Order>();

    /**
     * Default constructor, does logging only.
     */
    public Robot() {
        super();
        logger.info("Robot is serving.");
    }

    /**
     * Adds order to the orders queue.
     * @param order, the order to add to the queue.
     */
    public void addOrder(Order order) {
        try {
            orders.put(order);
        } catch (InterruptedException e) {
            logger.warn(e.toString());
        }
    }

    /**
     * Processes the orders, gets the first from the list and let the client
     * consume it. If no orders are on the queue then it waits because of the
     * {@link LinkedBlockingQueue} behavior.
     */
    public void processOrder() {
        Order order = null;
        try {
            order = orders.take();
        } catch (InterruptedException e) {
            logger.warn(e.toString());
        }
        Client client = order.getClient();
        Menu menu = order.getMenu();
        client.consume(menu);
    }

    @Override
    public void run() {
        while (true) {
            processOrder();
        }
    }
}

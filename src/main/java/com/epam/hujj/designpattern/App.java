package com.epam.hujj.designpattern;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.epam.hujj.designpattern.restaurant.domain.Chips;
import com.epam.hujj.designpattern.restaurant.domain.Extra;
import com.epam.hujj.designpattern.restaurant.domain.HotDog;
import com.epam.hujj.designpattern.restaurant.domain.Ketchup;
import com.epam.hujj.designpattern.restaurant.domain.Mustard;
import com.epam.hujj.designpattern.restaurant.domain.Product;
import com.epam.hujj.designpattern.restaurant.service.Client;

public class App {
    private static Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {

        Client client1 = new Client(5.0, menuFactory());
        logger.debug("Client 1 created, happiness: " + client1.getHappiness());
        client1.consume();
        logger.debug("Client 1 consumed, happiness: " + client1.getHappiness());

        Client client2 = new Client(8.0, menuFactory());
        logger.debug("Client 2 created, happiness: " + client2.getHappiness());
        client2.consume();
        logger.debug("Client 2 consumed, happiness: " + client2.getHappiness());
    }

    private static List<Product> menuFactory() {
        List<Product> products = new ArrayList<Product>();
        products.add(new HotDog(extraFactory()));
        products.add(new Chips());
        products.add(new Chips());
        return products;
    }

    private static List<Extra> extraFactory() {
        List<Extra> extras = new ArrayList<Extra>();
        extras.add(new Mustard());
        extras.add(new Ketchup());
        return extras;
    }
}

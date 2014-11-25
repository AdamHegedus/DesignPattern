package com.epam.hujj.designpattern;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.epam.hujj.designpattern.restaurant.domain.Product;
import com.epam.hujj.designpattern.restaurant.menu.Menu;
import com.epam.hujj.designpattern.restaurant.menu.MenuItems;
import com.epam.hujj.designpattern.restaurant.menu.ProductFactory;
import com.epam.hujj.designpattern.restaurant.service.Client;

public class App {
    private static Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {

        logger.debug("App start");

        Client client = new Client(2.0);
        logger.debug("Client happiness: " + client.getHappiness());

        ProductFactory productFactory = new ProductFactory();

        List<Product> menu = new ArrayList<Product>();

        menu.add(productFactory
                .getMenuItem(MenuItems.CHIPS_WITH_KETCHUP_AND_MUSTARD));
        menu.add(productFactory.getMenuItem(MenuItems.CHIPS_WITH_MUSTARD));
        menu.add(productFactory.getMenuItem(MenuItems.HOTDOG_WITH_KETCHUP));

        Menu m = new Menu(menu);
        client.orderMenu(m);
        client.consume();

    }
}

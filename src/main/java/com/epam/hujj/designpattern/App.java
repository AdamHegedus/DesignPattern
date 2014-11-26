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
import com.epam.hujj.designpattern.restaurant.service.Order;
import com.epam.hujj.designpattern.restaurant.service.Robot;

public class App {
    private static Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {

        logger.debug("A new Restaurant opened, a robot is serving food to the clients.");
        Robot robot = new Robot();
        new Thread(robot).start();

        Client client1 = new Client(2.0);
        Client client2 = new Client(3.0);

        Order order1 = new Order(createAMenu(), client1);
        Order order2 = new Order(createBMenu(), client2);
        robot.addOrder(order1);
        robot.addOrder(order2);
        Order order3 = new Order(createBMenu(), client1);
        robot.addOrder(order3);

    }

    /**
     * Creates a menu.
     * @return menu A
     */
    private static Menu createAMenu() {
        ProductFactory productFactory = new ProductFactory();
        List<Product> menu = new ArrayList<Product>();

        menu.add(productFactory
                .getMenuItem(MenuItems.CHIPS_WITH_KETCHUP_AND_MUSTARD));
        menu.add(productFactory.getMenuItem(MenuItems.CHIPS_WITH_MUSTARD));
        menu.add(productFactory.getMenuItem(MenuItems.HOTDOG_WITH_KETCHUP));

        return new Menu(menu);
    }

    /**
     * Creates a menu.
     * @return menu B
     */
    private static Menu createBMenu() {
        ProductFactory productFactory = new ProductFactory();
        List<Product> menu = new ArrayList<Product>();

        menu.add(productFactory
                .getMenuItem(MenuItems.HOTDOG_WITH_KETCHUP_AND_MUSTARD));
        menu.add(productFactory.getMenuItem(MenuItems.CHIPS));
        menu.add(productFactory.getMenuItem(MenuItems.HOTDOG_WITH_KETCHUP));

        return new Menu(menu);
    }

}

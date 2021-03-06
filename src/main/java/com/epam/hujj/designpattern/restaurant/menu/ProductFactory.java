package com.epam.hujj.designpattern.restaurant.menu;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.epam.hujj.designpattern.restaurant.domain.Chips;
import com.epam.hujj.designpattern.restaurant.domain.HotDog;
import com.epam.hujj.designpattern.restaurant.domain.Ketchup;
import com.epam.hujj.designpattern.restaurant.domain.Mustard;
import com.epam.hujj.designpattern.restaurant.domain.Product;

public class ProductFactory {
    private Logger logger = LoggerFactory.getLogger(ProductFactory.class);

    /**
     * Retrieves new Product instance based on input parameter food.
     * @param food , {@link MenuItems} type, only these combinations are
     *            available on the menu
     * @return the Product
     */
    public Product getMenuItem(MenuItems food) {
        Product product = null;
        switch (food) {
        case HOTDOG:
            product = new HotDog();
            break;
        case HOTDOG_WITH_MUSTARD:
            product = new Mustard(new HotDog());
            break;
        case HOTDOG_WITH_KETCHUP:
            product = new Ketchup(new HotDog());
            break;
        case HOTDOG_WITH_KETCHUP_AND_MUSTARD:
            product = new Ketchup(new Mustard(new HotDog()));
            break;
        case CHIPS:
            product = new Chips();
            break;
        case CHIPS_WITH_MUSTARD:
            product = new Mustard(new Chips());
            break;
        case CHIPS_WITH_KETCHUP:
            product = new Ketchup(new Chips());
            break;
        case CHIPS_WITH_KETCHUP_AND_MUSTARD:
            product = new Ketchup(new Mustard(new Chips()));
            break;

        default:
            logger.warn("MenuItem not on the Menu.");
            throw new IllegalArgumentException("MenuItem not on the Menu.");
        }

        return product;

    }
}

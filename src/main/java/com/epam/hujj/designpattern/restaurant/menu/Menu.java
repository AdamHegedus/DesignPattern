package com.epam.hujj.designpattern.restaurant.menu;

import java.util.ArrayList;
import java.util.List;

import com.epam.hujj.designpattern.restaurant.domain.Product;

public class Menu {

    private List<Product> products = new ArrayList<Product>();

    /**
     * Sets the products on the menu.
     * @param products
     */
    public Menu(List<Product> products) {
        this.products = products;
    }

    /**
     * Gets the happiness modifier of the full menu based on the clients initial
     * happiness before consuming the menu.
     * @param clientHappiness, the initial happiness of the client
     * @return the happiness modifier of the full menu
     */
    public double getFullMenuHappinessModifier(final double clientHappiness) {
        double happiness = clientHappiness;
        for (Product product : products) {
            happiness += product.getHappinessModifier(clientHappiness);
        }
        return happiness;
    }
}

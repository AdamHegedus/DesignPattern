package com.epam.hujj.designpattern.restaurant.menu;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.epam.hujj.designpattern.restaurant.domain.Product;

public class Menu {
    private Logger logger = LoggerFactory.getLogger(Menu.class);
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

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("The Menu contains these products:");
        for (Product product : products) {
            result.append("\n\t");
            result.append(product.toString());
        }
        return result.toString();
    }

}

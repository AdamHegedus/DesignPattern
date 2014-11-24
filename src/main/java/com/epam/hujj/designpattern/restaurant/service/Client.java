package com.epam.hujj.designpattern.restaurant.service;

import java.util.List;

import com.epam.hujj.designpattern.restaurant.domain.Product;

public class Client {

    private double happiness;
    private Menu menu;

    public Client(final double happiness, final List<Product> menu) {
        super();
        this.happiness = happiness;
        this.menu = new Menu(menu);
    }

    public void consume() {
        happiness = menu.getHappiness(happiness);
    }

    public double getHappiness() {
        return happiness;
    }

}

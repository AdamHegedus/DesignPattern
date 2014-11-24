package com.epam.hujj.designpattern.restaurant.domain;

public class Ketchup implements Extra {

    private double modifier = 2.0;

    public double modifyHappiness(final double happiness) {
        return happiness * modifier;
    }

}

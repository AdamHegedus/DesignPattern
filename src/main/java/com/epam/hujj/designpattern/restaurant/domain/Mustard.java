package com.epam.hujj.designpattern.restaurant.domain;

public class Mustard implements Extra {

    private double modifier = 1.0;

    public double modifyHappiness(double happiness) {
        return happiness + modifier;
    }

}

package com.epam.hujj.designpattern.restaurant.domain;

import java.util.ArrayList;
import java.util.List;

public class HotDog implements Product {

    private double modifier = 2.0;
    private List<Extra> extras = new ArrayList<Extra>();

    public HotDog(List<Extra> extras) {
        super();
        this.extras = extras;
    }

    public double calculateHappiness(final double happiness) {
        calculateExtras();
        return happiness + modifier;
    }

    private void calculateExtras() {
        for (Extra e : extras) {
            modifier = e.modifyHappiness(modifier);
        }
    }

    public String getName() {
        return "Hot Dog";
    }

}

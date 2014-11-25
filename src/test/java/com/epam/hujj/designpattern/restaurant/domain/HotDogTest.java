package com.epam.hujj.designpattern.restaurant.domain;

import junit.framework.Assert;

import org.junit.Test;

public class HotDogTest {
    private HotDog underTest;

    @Test
    public void testGetHappinessModifier() {
        // GIVEN
        underTest = new HotDog();
        double expected = Double.valueOf(2.0);
        // WHEN
        double actual = underTest.getHappinessModifier(Double.valueOf(5.0));
        // THEN
        Assert.assertEquals(expected, actual);

    }
}

package com.epam.hujj.designpattern.restaurant.domain;

import junit.framework.Assert;

import org.junit.Test;

public class ChipsTest {

    private Chips underTest;

    @Test
    public void testGetHappinessModifier() {
        // GIVEN
        underTest = new Chips();
        double expected = Double.valueOf(0.25);
        // WHEN
        double actual = underTest.getHappinessModifier(Double.valueOf(5.0));
        // THEN
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testToString() {
        // GIVEN
        underTest = new Chips();
        String expected = "Chips";
        // WHEN
        String actual = underTest.toString();
        // THEN
        Assert.assertEquals(expected, actual);
    }
}

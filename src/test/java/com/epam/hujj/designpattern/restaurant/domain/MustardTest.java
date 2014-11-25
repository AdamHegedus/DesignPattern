package com.epam.hujj.designpattern.restaurant.domain;

import junit.framework.Assert;

import org.easymock.EasyMock;
import org.junit.Test;

public class MustardTest {
    private Mustard underTest;

    @Test
    public void testGetHappinessModifier() {
        // GIVEN
        Product product = EasyMock.createMock(Product.class);
        underTest = new Mustard(product);
        double expected = Double.valueOf(1.0);
        // WHEN
        double actual = underTest.getHappinessModifier(Double.valueOf(5.0));
        // THEN
        Assert.assertEquals(expected, actual);

    }
}

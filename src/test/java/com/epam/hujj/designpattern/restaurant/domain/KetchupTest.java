package com.epam.hujj.designpattern.restaurant.domain;

import junit.framework.Assert;

import org.easymock.EasyMock;
import org.junit.Test;

public class KetchupTest {
    private Ketchup underTest;

    @Test
    public void testGetHappinessModifier() {
        // GIVEN
        Product product = EasyMock.createMock(Product.class);
        underTest = new Ketchup(product);
        double expected = Double.valueOf(10.0);

        EasyMock.expect(product.getHappinessModifier(5.0)).andReturn(5.0)
                .anyTimes();
        EasyMock.replay(product);
        // WHEN
        double actual = underTest.getHappinessModifier(Double.valueOf(5.0));
        // THEN
        EasyMock.verify(product);
        Assert.assertEquals(expected, actual);
    }

}

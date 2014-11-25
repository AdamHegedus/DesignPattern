package com.epam.hujj.designpattern.restaurant.service;

import junit.framework.Assert;

import org.easymock.EasyMock;
import org.junit.Before;
import org.junit.Test;

import com.epam.hujj.designpattern.restaurant.menu.Menu;

public class ClientTest {
    private Client underTest;

    @Before
    public void setUp() {
        underTest = new Client(5.0);
    }

    @Test
    public void testClient() {
        // GIVEN in setup
        double expected = Double.valueOf(5.0);
        // WHEN
        double actual = underTest.getHappiness();
        // THEN
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConsume() {
        // GIVEN in setup
        Menu menu = EasyMock.createMock(Menu.class);
        EasyMock.expect(menu.getFullMenuHappinessModifier(5.0)).andReturn(10.0)
                .anyTimes();
        EasyMock.replay(menu);

        double expected = Double.valueOf(10.0);
        underTest.orderMenu(menu);
        // WHEN
        underTest.consume();
        // THEN
        double actual = underTest.getHappiness();
        Assert.assertEquals(expected, actual);
        EasyMock.verify(menu);
    }
}

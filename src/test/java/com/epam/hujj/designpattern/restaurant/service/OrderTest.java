package com.epam.hujj.designpattern.restaurant.service;

import junit.framework.Assert;

import org.easymock.EasyMock;
import org.junit.Test;

import com.epam.hujj.designpattern.restaurant.menu.Menu;

public class OrderTest {

    private Order underTest;

    @Test
    public void testOrder() {
        // GIVEN in setup
        Menu menu = EasyMock.createMock(Menu.class);
        Client client = EasyMock.createMock(Client.class);
        // WHEN
        underTest = new Order(menu, client);
        // THEN
        Assert.assertEquals(menu, underTest.getMenu());
        Assert.assertEquals(client, underTest.getClient());

    }
}

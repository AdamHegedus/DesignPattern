package com.epam.hujj.designpattern.restaurant.menu;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;

import org.easymock.EasyMock;
import org.junit.Test;

import com.epam.hujj.designpattern.restaurant.domain.Product;

public class MenuTest {
	private Menu underTest;

	@Test
	public void testClient() {
		// GIVEN
		Product product = EasyMock.createMock(Product.class);
		List<Product> products = new ArrayList<>();
		products.add(product);
		products.add(product);
		products.add(product);
		
		EasyMock.expect(product.getHappinessModifier(5.0)).andReturn(10.0).anyTimes();
		
		EasyMock.replay(product);
		double expected = Double.valueOf(35.0);
		underTest = new Menu(products);
		// WHEN
		double actual = underTest.getFullMenuHappinessModifier(5.0);
		// THEN
		Assert.assertEquals(expected, actual);
		EasyMock.verify(product);
	}
}

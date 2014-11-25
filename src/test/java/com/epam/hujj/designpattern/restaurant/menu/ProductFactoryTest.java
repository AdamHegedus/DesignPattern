package com.epam.hujj.designpattern.restaurant.menu;

import junit.framework.Assert;

import org.easymock.EasyMock;
import org.junit.Before;
import org.junit.Test;

import com.epam.hujj.designpattern.restaurant.domain.Chips;
import com.epam.hujj.designpattern.restaurant.domain.HotDog;
import com.epam.hujj.designpattern.restaurant.domain.Ketchup;
import com.epam.hujj.designpattern.restaurant.domain.Mustard;
import com.epam.hujj.designpattern.restaurant.domain.Product;

public class ProductFactoryTest {

	private ProductFactory underTest;

	@Before
	public void setUp() {
		underTest = new ProductFactory();
	}

	@Test(expected = RuntimeException.class)
	public void testGetMenuItemShouldThrowExceptionWhenNullAsMenuItemIsGiven() {
		// GIVEN in setup
		// WHEN
		underTest.getMenuItem(null);
		// THEN
		Assert.fail("Should throw RuntimeException!");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testGetMenuItemShouldThrowExceptionWhenInvalidMenuItemIsGiven() {
		// GIVEN in setup
		// WHEN
		underTest.getMenuItem(MenuItems.NONE);
		// THEN
		Assert.fail("Should throw RuntimeException!");
	}

	@Test
	public void testGetMenuItemShouldReturnNewChips() {
		// GIVEN in setup
		// WHEN
		Product actual = underTest.getMenuItem(MenuItems.CHIPS);
		// THEN
		Assert.assertTrue(actual instanceof Chips);
	}
	
	@Test
	public void testGetMenuItemShouldReturnNewChipsWithKethup() {
		// GIVEN in setup
		Ketchup ketchup = EasyMock.createMock(Ketchup.class);
		HotDog hotdog = EasyMock.createMock(HotDog.class);
		// WHEN
		Product actual = underTest.getMenuItem(MenuItems.CHIPS_WITH_KETCHUP);
		// THEN
		Assert.assertTrue(actual instanceof Ketchup);
	}
	
	@Test
	public void testGetMenuItemShouldReturnNewChipsWithMustard() {
		// GIVEN in setup
		Ketchup ketchup = EasyMock.createMock(Ketchup.class);
		HotDog hotdog = EasyMock.createMock(HotDog.class);
		// WHEN
		Product actual = underTest.getMenuItem(MenuItems.CHIPS_WITH_MUSTARD);
		// THEN
		Assert.assertTrue(actual instanceof Mustard);
	}
	
	@Test
	public void testGetMenuItemShouldReturnNewChipsWithKethupAndMustard() {
		// GIVEN in setup
		Ketchup ketchup = EasyMock.createMock(Ketchup.class);
		HotDog hotdog = EasyMock.createMock(HotDog.class);
		// WHEN
		Product actual = underTest.getMenuItem(MenuItems.CHIPS_WITH_KETCHUP_AND_MUSTARD);
		// THEN
		Assert.assertTrue(actual instanceof Ketchup);
	}

	@Test
	public void testGetMenuItemShouldReturnNewHotDog() {
		// GIVEN in setup
		// WHEN
		Product actual = underTest.getMenuItem(MenuItems.HOTDOG);
		// THEN
		Assert.assertTrue(actual instanceof HotDog);
	}

	@Test
	public void testGetMenuItemShouldReturnNewHotDogWithKethup() {
		// GIVEN in setup
		Ketchup ketchup = EasyMock.createMock(Ketchup.class);
		HotDog hotdog = EasyMock.createMock(HotDog.class);
		// WHEN
		Product actual = underTest.getMenuItem(MenuItems.HOTDOG_WITH_KETCHUP);
		// THEN
		Assert.assertTrue(actual instanceof Ketchup);
	}
	
	@Test
	public void testGetMenuItemShouldReturnNewHotDogWithMustard() {
		// GIVEN in setup
		Ketchup ketchup = EasyMock.createMock(Ketchup.class);
		HotDog hotdog = EasyMock.createMock(HotDog.class);
		// WHEN
		Product actual = underTest.getMenuItem(MenuItems.HOTDOG_WITH_MUSTARD);
		// THEN
		Assert.assertTrue(actual instanceof Mustard);
	}
	
	@Test
	public void testGetMenuItemShouldReturnNewHotDogWithKethupAndMustard() {
		// GIVEN in setup
		Ketchup ketchup = EasyMock.createMock(Ketchup.class);
		HotDog hotdog = EasyMock.createMock(HotDog.class);
		// WHEN
		Product actual = underTest.getMenuItem(MenuItems.HOTDOG_WITH_KETCHUP_AND_MUSTARD);
		// THEN
		Assert.assertTrue(actual instanceof Ketchup);
	}
}

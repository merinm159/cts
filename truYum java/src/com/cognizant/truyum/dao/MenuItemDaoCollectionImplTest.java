package com.cognizant.truyum.dao;

import java.text.ParseException;
import java.util.List;

import com.cognizant.truyum.model.*;
import com.cognizant.truyum.util.DateUtil;

public class MenuItemDaoCollectionImplTest {
	public static void main(String[] args) throws ParseException {
//		MenuItemDaoCollectionImplTest t = new MenuItemDaoCollectionImplTest();
		testGetMenuItemListAdmin();
		testGetMenuItemListCustomer();
		testModifyMenuItem();
	}

	public static void testGetMenuItemListAdmin() throws ParseException {
		MenuItemDao menuItemDao = new MenuItemDaoCollectionImpl();
		List<MenuItem> list = menuItemDao.getMenuItemListAdmin();
		for (MenuItem menuItem : list) {
			System.out.println(menuItem);
		}
	}

	public static void testGetMenuItemListCustomer() throws ParseException {
		MenuItemDao menuItemDao = new MenuItemDaoCollectionImpl();
		List<MenuItem> menuItemList = menuItemDao.getMenuItemListCustomer();

		for (MenuItem item : menuItemList) {
			System.out.println(item);
		}
	}

	public static void testModifyMenuItem() throws ParseException {
		MenuItem matchingId = new MenuItem(1, "Sandwich", 100.00f, false, new DateUtil().convertToDate("02/07/2017"),
				"MainCourse", true);
		MenuItemDao menuItemDao = new MenuItemDaoCollectionImpl();
		menuItemDao.modifyMenuItem(matchingId);
		MenuItem modified=menuItemDao.getMenuItem(1);
		System.out.println(modified);
	}

	public static void testGetMenuItem() {

	}

}

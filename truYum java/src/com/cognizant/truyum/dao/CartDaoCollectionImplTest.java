package com.cognizant.truyum.dao;

import java.text.ParseException;
import java.util.List;

import com.cognizant.truyum.model.MenuItem;

public class CartDaoCollectionImplTest {
	public static void main(String[] args) throws ParseException {
		testAddCartItem();
		testRemoveCartItem();
	}

	public static void testAddCartItem() throws ParseException {
		CartDao cartDao=new CartDaoCollectionImpl();
		cartDao.addCartItem(1, 5);
		List<MenuItem> cartItemList;
		try {
			cartItemList = cartDao.getAllCartItems(1);
			cartItemList.forEach(System.out::println);
		} catch (CartEmptyException e) {
			e.printStackTrace();
		}
		
	}

	public static void testGetAllCartItems() {
		CartDao cartDao=new CartDaoCollectionImpl();
		try {
			List<MenuItem> cartItemList = cartDao.getAllCartItems(1);
			cartItemList.forEach(System.out::println);
		} catch (CartEmptyException e) {
			e.printStackTrace();
		}
		
	}

	public static void testRemoveCartItem() throws ParseException {
		CartDao cartDao = new CartDaoCollectionImpl();
		cartDao.addCartItem(1, 5);
		List<MenuItem> lst;
		try {
			lst = cartDao.getAllCartItems(1);
			lst.forEach(System.out::println);

		} catch (CartEmptyException e) {
			e.printStackTrace();
		}
		
	}
}

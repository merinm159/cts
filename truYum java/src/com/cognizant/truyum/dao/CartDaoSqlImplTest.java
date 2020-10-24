package com.cognizant.truyum.dao;

import java.util.List;

import com.cognizant.truyum.model.MenuItem;

public class CartDaoSqlImplTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		testAddCartItem();
		testGetAllCartItem();
		testRemoveCartItem();
		testGetAllCartItem();
		
	}
	
	public static void testAddCartItem() {
		CartDaoSqlImpl cartDaoImpl = new CartDaoSqlImpl();
		cartDaoImpl.addCartItem(1, 2);
		
	}
	
	public static void testGetAllCartItem() {
		int user_id = 2;
		CartDaoSqlImpl cartDaoImpl = new CartDaoSqlImpl();
		try {
			List<MenuItem> menuItemList = cartDaoImpl.getAllCartItems(user_id);
			for(MenuItem item : menuItemList) {
				System.out.println(item);
			}
		} catch (CartEmptyException e) {
			System.out.printf("The user id number %f did not buy anything\n",user_id);
			e.printStackTrace();
		}
	}
	
	public static void testRemoveCartItem() {
		CartDaoSqlImpl cartDaoImpl = new CartDaoSqlImpl();
		long userId = 1;
		System.out.println("\nBefore Delelting");
		try {
			for(MenuItem item : cartDaoImpl.getAllCartItems(userId)) {
				System.out.println(item);
			}
		} catch (CartEmptyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		long menuItemId = 1;
		cartDaoImpl.removeCartItem(userId, menuItemId);
		System.out.println("\nAfter Delelting");
		try {
			for(MenuItem item : cartDaoImpl.getAllCartItems(userId)) {
				System.out.println(item);
			}
		} catch (CartEmptyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println();
	}
}
package com.cognizant.truyum.dao;
import com.cognizant.truyum.model.*;
import java.util.HashMap;
import java.util.List;

public class CartDaoCollectionImpl implements CartDao {
	 private static HashMap<Long, Cart> userCarts;
	 
	 

	public CartDaoCollectionImpl() {
		super();
		if (userCarts==null) {
			userCarts=new HashMap<Long, Cart>();
		}
	}


	@Override
	public void addCartItem(long userId, long menuItemId) {
		
		
		
	}


	@Override
	public List<MenuItem> getAllCartItems(long userId) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void removeCartItem(long userId, long menuItemId) {
		// TODO Auto-generated method stub
		
	}
}

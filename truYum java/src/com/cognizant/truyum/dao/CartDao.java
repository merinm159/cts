package com.cognizant.truyum.dao;
import com.cognizant.truyum.model.*;

import java.util.List;

public interface CartDao {
	public void addCartItem(long userId,long menuItemId ); 
	public List<MenuItem> getAllCartItems(long userId);//  raises CartEmptyException
	void removeCartItem(long userId ,long menuItemId); 

}

package com.cognizant.truyum.dao;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.cognizant.truyum.model.MenuItem;
import com.cognizant.truyum.util.DateUtil;

public class MenuItemDaoCollectionImpl implements MenuItemDao {
	private static List<MenuItem> menuItemList;

	public MenuItemDaoCollectionImpl() throws ParseException {

		super();
		if (menuItemList == null) {
			List<MenuItem> l = new ArrayList<>();

			l.add(new MenuItem(1, "Sandwich", 99.00f, true, new DateUtil().convertToDate("15/03/2017"), "Main Course",
					true));
			l.add(new MenuItem(2, "Burger", 129.00f, true, new DateUtil().convertToDate("23/12/2017"), "Main Course",
					false));
			l.add(new MenuItem(3, "Pizza", 149.00f, true, new DateUtil().convertToDate("21/08/2018"), "Main Course",
					false));
			l.add(new MenuItem(4, "French Fries", 57.00f, false, new DateUtil().convertToDate("02/07/2017"), "Starters",
					true));
			l.add(new MenuItem(5, "Chocolate Brownie", 32.00f, true, new DateUtil().convertToDate("02/11/2022"),
					"Dessert", true));
			menuItemList = l;
		}

	}

	@Override
	public List<MenuItem> getMenuItemListAdmin() {
		// TODO Auto-generated method stub
		return menuItemList;
	}

	@Override
	public List<MenuItem> getMenuItemListCustomer() {
		List<MenuItem> m = new ArrayList<MenuItem>();
//		Date currentdate = Calendar.getInstance().getTime();  
//		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");  
//      String strDate = dateFormat.format(currentdate); 
//		LocalDate currentdate=LocalDate.now();
//		Date current=new DateUtil().convertToDate(currentdate);
		Date strDate = new DateUtil().convertToDate("23/10/2020");
		for (MenuItem menuItem : menuItemList) {
			if (menuItem.getDateOfLaunch().before(strDate) || menuItem.getDateOfLaunch().equals(strDate)) {
				m.add(menuItem);
			}
		}
		return m;
	}

	@Override
	public void modifyMenuItem(MenuItem menuItem) {
		
		for (MenuItem m : menuItemList) {
			if (menuItem.equals(m)) {
				m.setId(menuItem.getId());
				m.setName(menuItem.getName());
				m.setPrice(menuItem.getPrice());
				m.setActive(menuItem.isActive());
				m.setDateOfLaunch(menuItem.getDateOfLaunch());
				m.setCategory(menuItem.getCategory());
				m.setFreeDelivery(menuItem.isFreeDelivery());
			}
			
		}
	}

	@Override
	public MenuItem getMenuItem(long menuItemId) {
		for (MenuItem menuItem : menuItemList) {
			if(menuItem.getId()==menuItemId)
				return menuItem;
		}
		return null;
	}

}

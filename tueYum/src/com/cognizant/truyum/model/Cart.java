package com.cognizant.truyum.model;

import java.util.List;

public class Cart {
	private List<MenuItem> menuItemList;
	public List<MenuItem> getMenuItemList() {
		return menuItemList;
	}
	public void setMenuItemList(List<MenuItem> menuItemList) {
		this.menuItemList = menuItemList;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	private double total;
}

package com.practice.BundleCalculator.utils;

public class OrderItem {
	private int itemNum;
	private String itemFormat;
	
	public OrderItem(int itemNum, String itemFormat) {
		super();
		this.itemNum = itemNum;
		this.itemFormat = itemFormat;
	}

	public int getItemNum() {
		return itemNum;
	}

	public void setItemNum(int itemNum) {
		this.itemNum = itemNum;
	}

	public String getItemFormat() {
		return itemFormat;
	}

	public void setItemFormat(String itemFormat) {
		this.itemFormat = itemFormat;
	}
}

package com.practice.BundleCalculator.action;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import com.practice.BundleCalculator.utils.OrderItem;

public class UserInput {
	List<OrderItem> orderList = new LinkedList<OrderItem>();
	
	public File getFile(String fileName){
		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource(fileName).getFile());
		return file; 
	}
	
	public List<OrderItem> readOrderByFile(File file){
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(file));
			String str = null;
			while((str = reader.readLine()) != null){
				int itemNum = Integer.valueOf(str.split(" ")[0]);
				String itemFormat = str.split(" ")[1];
				orderList.add(new OrderItem(itemNum, itemFormat));
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return orderList;
	}
}

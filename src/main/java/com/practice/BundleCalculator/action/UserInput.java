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
		String line;
		try(BufferedReader br = new BufferedReader(new FileReader(file))){
			while((line = br.readLine()) != null){
				int itemNum = Integer.valueOf(line.split(" ")[0]);
				String itemFormat = line.split(" ")[1];
				orderList.add(new OrderItem(itemNum, itemFormat));
			}
		} catch (IOException e){
			e.printStackTrace();
		}
		// br will be closed automatically
		return orderList;
	}
}

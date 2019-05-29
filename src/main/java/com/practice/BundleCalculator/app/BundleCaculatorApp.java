package com.practice.BundleCalculator.app;

import java.io.File;
import java.util.List;

import com.practice.BundleCalculator.action.UserInput;
import com.practice.BundleCalculator.action.UserOutput;
import com.practice.BundleCalculator.utils.OrderItem;

public class BundleCaculatorApp {
	public static void main(String[] args){
		UserInput input = new UserInput();
		File file = input.getFile("order.txt");
		List<OrderItem> order = input.readOrderByFile(file);
		UserOutput output = new UserOutput();
		output.generateOutput(order);
	}
}

package com.practice.BundleCalculator.app;

import java.util.List;
import java.util.Map;

import com.practice.BundleCalculator.Bundle.FormatCode;
import com.practice.BundleCalculator.Input.UserInput;
import com.practice.BundleCalculator.Order.OrderItem;
import com.practice.BundleCalculator.Output.UserOutput;

public class BundleCaculatorApp {
	public static void main(String[] args){
		// read order list
		UserInput input = new UserInput("order.txt");
		List<OrderItem> order = input.readOrder();
		// read submission format list
		input = new UserInput("submission.txt");
		Map<FormatCode, Map<String, Float>> submission = input.readSubmission();
		// generate output
		UserOutput output = new UserOutput();
		output.generateOutput(order, submission);
	}
}
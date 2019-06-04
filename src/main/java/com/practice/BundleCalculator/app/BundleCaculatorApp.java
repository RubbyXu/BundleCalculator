package com.practice.BundleCalculator.app;

import java.util.List;

import com.practice.BundleCalculator.Bundle.SubmissionFormat;
import com.practice.BundleCalculator.Input.UserInput;
import com.practice.BundleCalculator.Order.OrderItem;
import com.practice.BundleCalculator.Output.UserOutput;

public class BundleCaculatorApp {
	public static void main(String[] args){
		UserInput input = new UserInput("order.txt");
		List<OrderItem> order = input.readOrder();
		input = new UserInput("submission.txt");
		List<SubmissionFormat> submission = input.readSubmission();
		UserOutput output = new UserOutput();
		output.generateOutput(order, submission);
	}
}
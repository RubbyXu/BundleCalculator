package com.practice.BundleCalculator.app;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import com.practice.BundleCalculator.action.UserInput;
import com.practice.BundleCalculator.action.UserOutput;
import com.practice.BundleCalculator.utils.FormatCode;
import com.practice.BundleCalculator.utils.OrderItem;
import com.practice.BundleCalculator.utils.SubmissionFormat;

public class BundleCaculatorApp {
	public static void main(String[] args){
		UserInput input = new UserInput();
		File orderFile = input.getFile("order.txt");
		File submissionFile = input.getFile("submission.txt");
		List<OrderItem> order = input.readOrderByFile(orderFile);
		List<SubmissionFormat> submission = input.readSubmissionByFile(submissionFile);
		UserOutput output = new UserOutput();
		output.generateOutput(order, submission);
	}
}

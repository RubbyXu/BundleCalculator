package com.practice.BundleCalculator.Input;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.practice.BundleCalculator.Bundle.FormatCode;
import com.practice.BundleCalculator.Bundle.SubmissionFormat;
import com.practice.BundleCalculator.Order.OrderItem;

public class UserInput {
	String fileName;
	
	private final static String SPACE = " ";
	private final static String SEPARATOR = "\\|";
	private final static String AT = "@ \\$";
	private final static String INPUT_EXAMPLE = "10 IMG" + "/n" + "15 FLAC" + "/n" + "13 VID";
	
	File file = null;
	List<OrderItem> orderList = new LinkedList<OrderItem>();
	List<SubmissionFormat> submissionList = new LinkedList<SubmissionFormat>();
	
//	public File getFile(String fileName){
//		ClassLoader classLoader = getClass().getClassLoader();
//		File file = new File(classLoader.getResource(fileName).getFile());
//		return file; 
//	}
	
	public UserInput(String fileName) {
		ClassLoader classLoader = getClass().getClassLoader();
		file = new File(classLoader.getResource(fileName).getFile());
	}

	public List<OrderItem> readOrder(){
		String line;
		try(BufferedReader br = new BufferedReader(new FileReader(file))){
			while((line = br.readLine()) != null){
				String[] item = line.split(SPACE);
				if (item.length != 2){
					System.out.println("Please input the order following the example here.");
					System.out.println(INPUT_EXAMPLE);
				} else {
					orderList.add(new OrderItem(Integer.valueOf(item[0]), item[1]));
				}
			}
		} catch (IOException e){
			e.printStackTrace();
		}
		// br will be closed automatically
		return orderList;
	}
	
	public List<SubmissionFormat> readSubmission(){
		String line;
		Map<Integer, Float> bundlesMap = new HashMap<Integer, Float>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(file))){
			while((line = br.readLine()) != null){
				if (line.contains(FormatCode.IMG.toString()) 
						|| line.contains(FormatCode.Flac.toString()) 
						|| line.contains(FormatCode.VID.toString())){
					line = line.replaceAll(AT, "");
					String[] post = line.split(SEPARATOR);
					String bundles = post[2].trim();
					String[] values = bundles.split(SPACE);
					for(int i = 0; i < values.length; i++){
						bundlesMap.put(Integer.valueOf(values[i]), Float.valueOf(values[i+1]));
						i++;
					}
					submissionList.add(new SubmissionFormat(FormatCode.valueOf(post[1].trim()), bundlesMap));
				}				
			}
		} catch (IOException e){
			e.printStackTrace();
		}
		// br will be closed automatically
		return submissionList;
	}
}

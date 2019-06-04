package com.practice.BundleCalculator.Output;

//import java.io.IOException;
//import java.io.InputStream;
import java.util.List;
import java.util.Map;
//import java.util.Properties;

import com.practice.BundleCalculator.Bundle.FormatCode;
import com.practice.BundleCalculator.Order.OrderItem;

public class UserOutput {

	public void generateOutput(List<OrderItem> orderList, Map<FormatCode, Map<String, Float>> submissionMap){ 
//		Properties prop = new Properties();
//		InputStream input = null;
//		try {
//			input = this.getClass().getClassLoader().getResourceAsStream("post.properties");
//			prop.load(input);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		for(OrderItem orderItem : orderList){
			int itemNum = orderItem.getItemNum();
			String itemFormat = orderItem.getItemFormat();
			Map<String, Float> bundles;
			switch(itemFormat){
				// if order item is image
				case "IMG":
					bundles = submissionMap.get(FormatCode.IMG);
					Float imagePostCost_10 = bundles.get("IMG10");
					System.out.println(itemNum + " " + itemFormat + " " + "$" + imagePostCost_10);
					System.out.println(" " + "1 x " + itemNum + " $" + imagePostCost_10);
//					String imagePostCost_10 = prop.getProperty("imagePostCost_10");
//					String imagePostNum_10 = prop.getProperty("imagePostNum_10");
//					System.out.println(itemNum + " " + itemFormat + " " + "$" + imagePostCost_10);
//					System.out.println(" " + "1 x " + imagePostNum_10 + " $" + imagePostCost_10);
					break;
				// if order item is audio
				case "FLAC":
					bundles = submissionMap.get(FormatCode.Flac);
					Float audioPostCost_6 = bundles.get("Flac6");
					Float audioPostCost_9 = bundles.get("Flac9");
					Float audioTotalCost = audioPostCost_6 + audioPostCost_9;
					System.out.println(itemNum + " " + itemFormat + " $" + String.valueOf(audioTotalCost));
					System.out.println(" " + "1 x 9" + " $" + audioPostCost_9);
					System.out.println(" " + "1 x 6" + " $" + audioPostCost_6);
//					String audioPostCost_9 = prop.getProperty("audioPostCost_9");
//					String audioPostNum_9 = prop.getProperty("audioPostNum_9");
//					String audioPostCost_6 = prop.getProperty("audioPostCost_6");
//					String audioPostNum_6 = prop.getProperty("audioPostNum_6");
//					Float audioTotalCost = Float.valueOf(audioPostCost_9) + Float.valueOf(audioPostCost_6);
//					System.out.println(itemNum + " " + itemFormat + " $" + String.valueOf(audioTotalCost));
//					System.out.println(" " + "1 x " + audioPostNum_9 + " $" + audioPostCost_9);
//					System.out.println(" " + "1 x " + audioPostNum_6 + " $" + audioPostCost_6);
					break;
				// if order item is video
				case "VID":
					bundles = submissionMap.get(FormatCode.VID);
					Float videoPostCost_3 = bundles.get("VID3");
					Float videoPostCost_5 = bundles.get("VID5");
					Float videoTotalCost = videoPostCost_3 + 2 * videoPostCost_5;
					System.out.println(itemNum + " " + itemFormat + " $" + String.valueOf(videoTotalCost));
					System.out.println(" " + "2 x 5" + " $" + 2 * Float.valueOf(videoPostCost_5));
					System.out.println(" " + "1 x 3" + " $" + videoPostCost_3);
//					String videoPostCost_5 = prop.getProperty("videoPostCost_5");
//					String videoPostNum_5 = prop.getProperty("videoPostNum_5");
//					String videoPostCost_3 = prop.getProperty("videoPostCost_3");
//					String videoPostNum_3 = prop.getProperty("videoPostNum_3");
//					Float videoTotalCost = 2 * Float.valueOf(videoPostCost_5) + Float.valueOf(videoPostCost_3);
//					System.out.println(itemNum + " " + itemFormat + " $" + String.valueOf(videoTotalCost));
//					System.out.println(" " + "2 x " + videoPostNum_5 + " $" + 2 * Float.valueOf(videoPostCost_5));
//					System.out.println(" " + "1 x " + videoPostNum_3 + " $" + videoPostCost_3);
			}
		}
//		if (input != null){
//			try {
//				input.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
	}
}

package com.practice.BundleCalculator.utils;

public class BundleCost {
	
	String mediaFormat;
	int postNum;
	float postCost;
	
	public BundleCost(String mediaFormat, int postNum, float postCost) {
		super();
		this.mediaFormat = mediaFormat;
		this.postNum = postNum;
		this.postCost = postCost;
	}

	public String getMediaFormat() {
		return mediaFormat;
	}

	public void setMediaFormat(String mediaFormat) {
		this.mediaFormat = mediaFormat;
	}

	public int getPostNum() {
		return postNum;
	}

	public void setPostNum(int postNum) {
		this.postNum = postNum;
	}

	public float getPostCost() {
		return postCost;
	}

	public void setPostCost(float postCost) {
		this.postCost = postCost;
	}
}

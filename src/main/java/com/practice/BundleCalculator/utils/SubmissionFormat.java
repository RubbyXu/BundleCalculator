package com.practice.BundleCalculator.utils;

import java.util.*;

public class SubmissionFormat {
	private String formatCode;
	private Map<Integer, Float> bundles = new HashMap<Integer, Float>();
	
	public SubmissionFormat(String formatCode, Map<Integer, Float> bundles){
		this.formatCode = formatCode;
		this.bundles = bundles;
	}

	@Override
	public String toString() {
		return "mediaFormat [formatCode=" + formatCode + ", bundles=" + bundles + "]";
	}

	public String getFormatCode() {
		return formatCode;
	}

	public void setFormatCode(String formatCode) {
		this.formatCode = formatCode;
	}

	public Map<Integer, Float> getBundles() {
		return bundles;
	}

	public void setBundles(Map<Integer, Float> bundles) {
		this.bundles = bundles;
	}	
}

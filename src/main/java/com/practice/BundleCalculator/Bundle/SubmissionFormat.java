package com.practice.BundleCalculator.Bundle;

import java.util.*;

public class SubmissionFormat {
	private FormatCode formatCode;
	private Map<Integer, Float> bundlesMap = new HashMap<Integer, Float>();
	
	public SubmissionFormat(FormatCode formatCode, Map<Integer, Float> bundlesMap){
		this.formatCode = formatCode;
		this.bundlesMap = bundlesMap;
	}

	@Override
	public String toString() {
		return "mediaFormat [formatCode=" + formatCode + ", bundlesMap=" + bundlesMap + "]";
	}

	public FormatCode getFormatCode() {
		return formatCode;
	}

	public void setFormatCode(FormatCode formatCode) {
		this.formatCode = formatCode;
	}

	public Map<Integer, Float> getBundlesMap() {
		return bundlesMap;
	}

	public void setBundlesMap(Map<Integer, Float> bundlesMap) {
		this.bundlesMap = bundlesMap;
	}	
}

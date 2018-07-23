package com.jayshree.springboot.util;

/**
 * @author Jayshree
 *
 * @Created-on Jul 22, 2018
 *
 */
public class CustomErrorType {

	private String errorMessage;

	public CustomErrorType(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

}

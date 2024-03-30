package com.personetics.test;

public class Node {

	private String digits;

	public Node(String digits) {
		setDigits(digits);
	}

	public Node(int digits) {
		setDigits(Integer.toString(digits));
	}

	public String getDigits() {
		return digits;
	}

	public void setDigits(String digits) {
		this.digits = digits;
	}

}

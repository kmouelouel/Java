package com.video2brain.javase;

public class Myexception extends Exception {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		 return "Error-my own exception";
	}

}

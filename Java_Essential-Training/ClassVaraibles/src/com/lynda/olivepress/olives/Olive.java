package com.lynda.olivepress.olives;

public class Olive {
	public static final long BLACK=0x000000;
	public static final long GREEN=0x00FF00;
	public String name ="Kalamata";
	public String flavor ="Grassy";
	public long color = Olive.BLACK;
	private int oil = 3;
	
	
	public int getOil() {
		return oil;
	}


	public void setOil(int oil) {
		this.oil = oil;
	}


	public Olive() {
		super();
	}


	public Olive(int oil) {
		super();
		this.oil = oil;
	}


	public int  crush(){
		 System.out.println("ouch!");
		 return oil;
	 }
}
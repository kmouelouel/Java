package com.video2brain.converter.Launcher;

 

import com.video2brain.convert.tools.Converter;

public class Launcher {

	public static void main(String[] args) {
	String celciusString=args[0];
	float celiusFloat=Float.valueOf(celciusString);
		float result=Converter.converttoFahren(celiusFloat);
		System.out.println("Fahrenheit : "+result);	
		// ask user to choose which convert he want and entre the numbers 
/*	System.out.println("**********Convert Celcuis To Fehrenheit**********");
	System.out.println("Please enter a number : ");
	Scanner sc= new Scanner(System.in);
	float number=sc.nextFloat();*/
		
	
	
	}

}

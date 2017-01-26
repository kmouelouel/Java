package com.video2brain.javase;
 /* 
 * codeur: kahina Moueloul
 */
import java.util.Scanner;
public class Lancher {
	/* global variables  
	 public,private,protected are modificateur d acceses.
	modificateur d accesse */
	public static int myvalue=5,  mysecondvalue=10;
    public 	static int result;
    // Main is unique and one only and is called method
	//method main 
    public static void main(String[] args){
	System.out.println("hello Word");
     // local variable 
	
	result=myvalue+mysecondvalue;
	System.out.println("mon result is : "+result);
	// input data 
	Scanner sc = new Scanner(System.in);
	String myinput=sc.nextLine();
	System.out.println("Valeur :"+ myinput);
    }
}

package com.vedio2brain.javase;

import com.video2brain.tools.MyNewClass;

public class Launcher {

	public static void main(String[] args) {
		System.out.println("this is : an exemple of method class ");
		int mynumber=24, mysecondnumber=65;
		
		
		System.out.println("my result is "+Somme(mynumber,mysecondnumber)); 
	MyNewClass.myOtherMethod();
	}
	public static int Somme(int number1,int number2){
	 return number1+number2;
	 }

}

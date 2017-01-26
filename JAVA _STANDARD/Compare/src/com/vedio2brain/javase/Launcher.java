package com.vedio2brain.javase;

public class Launcher {

	public static void main(String[] args) {
	int myfirstvalue=5;
	int mysecondvalue=10;
	boolean result=myfirstvalue==mysecondvalue;
	boolean secondresult=false;
	
	if(result ^ secondresult){
		System.out.println("test true");
	}else {
		System.out.println("test false ");
		
	}
	
	}

}

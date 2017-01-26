package com.video2brain.javase;

public class Launcher {

	public static void main(String[] args) {
 
		int[] myarray={1,2,3};
	try {myarray[3]=0;
	}catch (Exception e)
	{System.out.println("Error, exception thrown");
	}
	try {
		Thread.sleep(100);
		
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}

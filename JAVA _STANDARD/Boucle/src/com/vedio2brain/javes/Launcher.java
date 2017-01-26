package com.vedio2brain.javes;

public class Launcher {

	public static void main(String[] args) {
        System.out.println("boucle for");
		for(int i=0;i<10;i++)
	     {System.out.println("hello world "+ i);
	     }
		System.out.println("boucle while");
		boolean mybool=true;
		
		int j=4;
		while(mybool){
			j--;
			System.out.println("hello world "+j);
		
		if (j==1){
			mybool=false;}
		}
		System.out.println("boucle do while");
		do{
			System.out.println("hello world with do ");
			
		}while(false);
		// for each is used for list or arrays
		System.out.println("boucle fo each ");
		int [] myarray={5,6,7,8};
		for(int i:myarray){
			System.out.println("hello word "+i);
		}
}
}


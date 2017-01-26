package com.video2brain.javase;

public class Launcher {

	public static void main(String[] args) {
	 for(int i=0;i<10;i++){
		 if(i==5){
			 //lancer une exception 
			 try{
				 throw new Myexception();
			 }catch(Myexception e){
				e.printStackTrace(); 
			 }
			 
		 }
		 
		 
	 }
	}

}

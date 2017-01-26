package com.video2brain.myfirstObject.launcher;

import ccom.video2brain.myfirstObject.models.Car;

public class Launcher {

	public static void main(String[] args) {
   Car MyCar=new Car();
   Car MyCar2=new Car("blue");
   MyCar2.showmeDetails();
   // use get and set
   MyCar.setColor("black");
   System.out.println(MyCar.getColor());
   
   
   
	}

}

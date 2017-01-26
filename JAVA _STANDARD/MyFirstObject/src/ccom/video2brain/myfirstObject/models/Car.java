package ccom.video2brain.myfirstObject.models;
// objet etat and comportement 
public class Car extends Vehicule {
	// etat 
 
 
public Car(){
	System.out.println("Constructor's car");
}

public Car(String color){
	super.setColor(color);
}

// method  d objet no static 
 
public void showmeDetails(){
	System.out.println("my color is "+super.getColor());
}



}
package com.lynda.javatraining;

public class SimpleApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Welcomer welcomer= new Welcomer();
        welcomer.sayHello();
        // Turning an array of characters into string
	    char[] chars={'A','z','o','l'};
	    String s= new String(chars);
	    System.out.println(s);
	}

}


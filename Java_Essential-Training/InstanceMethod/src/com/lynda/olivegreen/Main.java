package com.lynda.olivegreen;

import com.lynda.olivegreen_olives.Olives;
import com.lynda.olivegreen_press.OlivePress;

public class Main {

	public static void main(String[] args) {
	Olives[] olives={new Olives(), new Olives(), new Olives()};
	OlivePress press = new OlivePress();
	press.getOil(olives);
	}

}

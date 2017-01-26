package com.lynda.olivegreen_press;

import java.util.Iterator;

import com.lynda.olivegreen_olives.Olives;

public class OlivePress {
public void getOil(Olives[] olives){
	for (Olives olive : olives) {
		olive.crush();
	}
}
}

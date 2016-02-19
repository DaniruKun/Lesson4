package lv.lessons.progmeistars._4p.classes;

import lv.lessons.progmeistars._4p.interfaces.Person;
import lv.lessons.progmeistars._4p.interfaces.Vehicle;

public class Bus implements Vehicle {
	
	private Person[] passengerArray; //should be filled in constructor
	@Override
	public Person[] getPassengers() {
		return passengerArray;
	}
}

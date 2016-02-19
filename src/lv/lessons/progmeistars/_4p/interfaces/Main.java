package lv.lessons.progmeistars._4p.interfaces;

import java.util.Random;

import lv.lessons.progmeistars._4p.classes.Bus;
import lv.lessons.progmeistars._4p.classes.Car;
import lv.lessons.progmeistars._4p.classes.Man;

public class Main {

	public static void main(String[] args) {
		//P C 3 C 4 B 10 P P K
		Counter counter = new Counter();
		for (int i = 0; i < args.length; i++){
			//process arguments here, like:
			if (args[i].equalsIgnoreCase("P")){
				Random rndm = new Random();
				int r = rndm.nextInt(1);
				if (r == 0) {
					Person p = new Woman();
				} else {
				Person p = new Man();
				}
				//Man.name = smth
				//or woman, choose randomly
				//fill things like name or whatever
				counter.count(p); //and process it
			}
			if (args[i].equalsIgnoreCase("C")) {
				if (Integer.getInteger(args[i+1]) <=5) {
					Car c = new Vehicle();
					c.getPassengers();
					
				}
			}
			if (args[i].equalsIgnoreCase("B")) {
				if (Integer.getInteger(args[i+1]) <=50) {
					Bus b = new Vehicle();
					b.getPassengers();
				}
			}
			
		}
	}

}

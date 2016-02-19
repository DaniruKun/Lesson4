package lv.lessons.progmeistars._4p.interfaces;

public class Counter {
	public void count(Countable c){
		if (c instanceof Person) {
			Person p = (Person) c;
			
		}
		else {
			if (c instanceof Vehicle) {
				Vehicle v = (Vehicle) c;
				for (int i = 0; i < v.getPassengers().length; i++) {
					count(v.getPassengers()[i]);
				}
			}
		}
		
		String[] people = new String[100];
		
	}
}

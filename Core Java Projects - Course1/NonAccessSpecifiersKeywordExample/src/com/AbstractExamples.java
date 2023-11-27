package com;
abstract class Bike {
	abstract void speed();
	void mailage() {
		System.out.println("55km/lt");
	}
}
class Honda extends Bike {			
	void color() {
		System.out.println("Gray");
	}
	@Override
	void speed() {					// override 
		System.out.println("50km/hr");
	}
}
class Pulsar extends Bike {
	void color() {
		System.out.println("Black");
	}
	@Override
	void mailage() {
		System.out.println("40km/lt");
	}
	@Override
	void speed() {					// override 
		System.out.println("90km/hr");
	}
}
public class AbstractExamples {
	public static void main(String[] args) {
		Honda hh = new Honda();		hh.speed();  hh.color();	hh.mailage();
		Pulsar pu = new Pulsar(); pu.speed(); pu.color();		pu.mailage();

	}

}

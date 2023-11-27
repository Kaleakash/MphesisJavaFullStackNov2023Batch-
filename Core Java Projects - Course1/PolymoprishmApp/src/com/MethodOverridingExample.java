package com;
class Bike {
	void speed() {
		System.out.println("60km/hr");
	}
}
class Honda extends Bike {			// re-usability 
	void color() {
		System.out.println("Gray");
	}
}
class Pulsar extends Bike {
	//@Override
	void color() {
		System.out.println("Black");
	}
	@Override
	void speed() {					// override 
		System.out.println("90km/hr");
	}
}
class Tvs extends Bike {
	void color() {
		System.out.println("Yellow");
	}
	@Override
	void speed() {
		super.speed();				// calling super class method 
		System.out.println("10km/hr");			// merge code 
	}
}
public class MethodOverridingExample {
	public static void main(String[] args) {
	Honda hh = new Honda();		hh.color(); hh.speed();
	Pulsar pu = new Pulsar();	pu.color(); pu.speed();
	Tvs tt = new Tvs();			tt.color(); tt.speed();
	}
}

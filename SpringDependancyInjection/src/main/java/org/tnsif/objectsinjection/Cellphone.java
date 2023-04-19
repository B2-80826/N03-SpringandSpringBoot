package org.tnsif.objectsinjection;

public class Cellphone {
	
	// DI in the form of objects
	Charger charger;

	public void setCharger(Charger charger) {
		this.charger = charger;
	}
	//injecting the object of charger class
	public void accept() {
		charger.power();
	}
	

}

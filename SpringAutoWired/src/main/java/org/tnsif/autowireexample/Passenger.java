package org.tnsif.autowireexample;

public class Passenger {
	Ticket t;

	public void setT(Ticket t) {
		this.t = t;
	}
	public void accept() {
		t.info();
	}
	public Passenger(Ticket t) {
		super();
		this.t=t;
		System.out.println("Autowire using contructor");
		
	}
	
	
	
	

}

package org.tnsif.usingautowireannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Remote {
	//DI using objects
	private Cell cell;

	//DI using setters
	/*
	 *  TO achive autowiring using setters use @autowired annotation
	 */
	@Autowired
	/*
	 * When you have multiple beans and if you want to access particular 
	 * one then we use qualified annotation
	 */
	@Qualifier("c2")
	public void setCell(Cell cell) {
		this.cell = cell;
	}
	// default constructor 
	public Remote() {
		super();
		System.out.println("Default constructor for remote");
	}
	
	//injecting the object of cell class
	public void remote() {
		cell.power();
	}
}

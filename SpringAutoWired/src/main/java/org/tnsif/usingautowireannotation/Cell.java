package org.tnsif.usingautowireannotation;

public class Cell {
	private String company;
	private String size;
	
	//Getters and setters
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	//Default Constructor
	public Cell() {
		super();
		System.out.println("Default Constructor for Cell");
		
	}
	
	public void power() {
		System.out.println("company of cell: "+company);
		System.out.println("size of cell: "+size);
	}
	
	

}

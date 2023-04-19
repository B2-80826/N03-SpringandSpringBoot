package org.tnsif.collection;

import java.util.List;
import java.util.Set;
//program to demonstrate DI in the form of collection
public class CollectionDemo {
	private List<String>contactNo;
	private Set<String>books;
	
	//DI using Setters
	public void setContactNo(List<String> contactNo) {
		this.contactNo = contactNo;
	}
	public void setBooks(Set<String> books) {
		this.books = books;
	}
	
	public void display() {
		System.out.println("List of Contact Numbers");
		for(String itr:contactNo) {
			System.out.println(itr);
		}
		System.out.println("\n");
		System.out.println("Set of Books");
		for(String itr1:books) {
			System.out.println(itr1);
		}
	}
	
	

}

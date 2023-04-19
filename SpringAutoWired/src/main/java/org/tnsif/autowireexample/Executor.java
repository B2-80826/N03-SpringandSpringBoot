package org.tnsif.autowireexample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Executor {
	public static void main(String[] args) {
		ApplicationContext c=new ClassPathXmlApplicationContext("beans.xml");
		Passenger p=c.getBean("passenger",Passenger.class);
		p.accept();
	}

}

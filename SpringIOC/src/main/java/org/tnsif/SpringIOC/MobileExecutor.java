package org.tnsif.SpringIOC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MobileExecutor {

	// Driver class
	public static void main(String[] args) {
		/*hard coing when there is more no of classes 
		 
		Airtel A =new Airtel();
		A.call();
		A.massage();
		
		Jio B =new Jio();
		B.call();
		B.massage();
		*/
		
		ApplicationContext c=new ClassPathXmlApplicationContext("bean.xml");
		
		/*
		Airtel A=(Airtel) c.getBean("Airtel");
		A.call();
		A.massage();
		
		Jio J=(Jio) c.getBean("Jio");
		J.call();
		J.massage();
		*/
		Sim s =c.getBean("Sim",Sim.class);
		s.call();
		s.massage();
		/*
		Sim s1 =c.getBean("Sim1",Sim.class);
		s1.call();
		s1.massage();
		*/
		
	}
	
	

}

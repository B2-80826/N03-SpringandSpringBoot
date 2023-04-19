package org.tnsif.usingautowireannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//program to demonstarte example on Autowire example using @autowire annotation
public class Executor {
	public static void main(String[] args) {
		ApplicationContext c=new ClassPathXmlApplicationContext("web.xml");
		Remote r =c.getBean("remote",Remote.class);
		r.remote();
	}

}

package org.tnsif.objectsinjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DIUsingObjects {
	public static void main(String[] args) {
	BeanFactory f=new ClassPathXmlApplicationContext("web.xml"); 
	Cellphone c=f.getBean("c2",Cellphone.class);
	c.accept();
	
	}
}

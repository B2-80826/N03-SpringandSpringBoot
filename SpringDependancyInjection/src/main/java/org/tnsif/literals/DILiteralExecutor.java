package org.tnsif.literals;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DILiteralExecutor {

	public static void main(String[] args) {
		BeanFactory f=new ClassPathXmlApplicationContext("beans.xml"); 
		SwiftEngine e=f.getBean("scorpio",SwiftEngine.class);
		System.out.println(e);
		System.out.println(e.cost());
		System.out.println(e.display());
		
		SwiftEngine s=f.getBean("car",SwiftEngine.class);
		System.out.println(s);
		System.out.println(s.cost());
		System.out.println(s.display());
		

	}

}

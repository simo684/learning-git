package org.sid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class CataMvc61Application {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext cont = new AnnotationConfigApplicationContext(AlienConfig.class);
		
      
		 

		 Alien a1 = (Alien) cont.getBean("alienbean");
		 
		 System.out.println("the Alien object is created by spring is ; " + a1);
		a1.show();
		
		cont.close();
		 
	}

}

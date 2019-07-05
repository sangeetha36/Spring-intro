package com.lti.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.component.Calculator;

public class CalculatorTest {

	public static void main(String [] args) {
	
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		Calculator ca=(Calculator) context.getBean("ca");  //bean 
	    System.out.println("add :"+ca.add(3,4));
	    System.out.println("sub:"+ca.sub(3,4));	
	} 
}

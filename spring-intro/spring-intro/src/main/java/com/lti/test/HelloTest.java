package com.lti.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.component.CurrencyConverter;
import com.lti.component.HelloWorld;

public class HelloTest {

	public static void main(String [] args) {
	
		//Loading Spring's IoC Container
	ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
	
	//accessing one of the bean
	HelloWorld hw=(HelloWorld) context.getBean("hw");  //bean 
    System.out.println(hw.sayHello("vijay"));	
	
    CurrencyConverter cc =(CurrencyConverter)  context.getBean("cc");
    System.out.println(cc.convertDollarsToRupees(50));
    
    
	}
	
}

package com.cubic.classes;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainApp {
	public static void main(String[] args) {
		/*Resource resource=new ClassPathResource("resources/spring.xml");
		BeanFactory factory=new XmlBeanFactory(resource);*/
		ApplicationContext context=new ClassPathXmlApplicationContext("resources/spring.xml");
		Car e=(Car)context.getBean("c");
		e.printcarname();
		e.display();
	}
}

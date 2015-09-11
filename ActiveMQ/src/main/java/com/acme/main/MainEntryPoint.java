package com.acme.main;

import javax.jms.JMSException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.acme.jms.JmsMessageProducer;

public class MainEntryPoint {
	
	public static void main(String args[]) throws JMSException{
		
		ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("/META-INF/spring/applicationContext.xml");
	//	JmsMessageProducer producer = new JmsMessageProducer();
   //	producer.generateMessages();
		app.refresh();
		
	}
	
}

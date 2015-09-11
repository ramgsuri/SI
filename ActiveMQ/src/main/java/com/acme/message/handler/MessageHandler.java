package com.acme.message.handler;

import org.springframework.messaging.Message;

import com.acme.model.jaxb.FlightInfo;

public class MessageHandler {
	
	
	public Message<?>  receiveMessage(Message<?> message){
		
		System.out.println(" ---- The Message received is ---- "+message);
		Object obj = message.getPayload();
		System.out.println(" ---- The payload is ---- "+obj);
		FlightInfo flightObj =  (FlightInfo)obj;
		System.out.println(flightObj.getFlightModelNo());
		return message;
		
	}
	
}

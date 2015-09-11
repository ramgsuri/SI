package com.acme.model.jaxb;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="FlightInfo")
public class FlightInfo {
	
	public FlightInfo(){
		super();
	}
	
	@XmlElement(name="FlightModelNo")
	public String getFlightModelNo() {
		return flightModelNo;
	}

	public void setFlightModelNo(String flightModelNo) {
		this.flightModelNo = flightModelNo;
	}
	
	@XmlElement(name="FlightNo")
	public String getFlightNo() {
		return flightNo;
	}

	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}

	@XmlElement(name="Timestamp")
	public Long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	String flightModelNo;
	
	String flightNo;
	
	Long timestamp;
	
}

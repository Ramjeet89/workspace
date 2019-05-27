package com.java.camel.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.java.camel.exception.CamelCustomException;

public class MyProcessor implements Processor{

	@Override
	public void process(Exchange exchange) throws Exception {
		System.out.println("Exception Thrown");
		throw new CamelCustomException();
	}
}

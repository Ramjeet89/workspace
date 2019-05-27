package com.springboot.camel.route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

import com.springboot.camel.constant.ServiceConstants;
import com.springboot.camel.processor.HelloProcessor;

@Component
public class HelloRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from(ServiceConstants.HELLO_SERVICE_ENDPOINT)
		.id(ServiceConstants.HELLO_ROUTE_ID)
		.log("I'm in the Camel Route!")
		.process(new HelloProcessor());
	}
}

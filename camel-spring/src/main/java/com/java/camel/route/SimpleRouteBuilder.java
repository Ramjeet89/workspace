package com.java.camel.route;

import org.apache.camel.builder.RouteBuilder;

import com.java.camel.processor.MyProcessor;

public class SimpleRouteBuilder extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("file:C:/inputFolder?noop=true").process(new MyProcessor()).to("file:C:/outputFolder");
	}
}

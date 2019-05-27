package com.springboot.camel.route;

import org.apache.camel.ExchangePattern;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

import com.springboot.camel.constant.ServiceConstants;
import com.springboot.camel.processor.RedeliveryProcessor;

@Component
public class QueueReaderRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("jms:jms:deadLetterQueue")
		.routeId(ServiceConstants.QUEUE_READER_ROUTE_ID)
		.process(new RedeliveryProcessor())
		.to(ExchangePattern.InOnly, "jms:deadLetterQueue")
		.end();
	}
}

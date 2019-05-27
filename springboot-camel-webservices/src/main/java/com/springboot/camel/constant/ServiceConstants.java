package com.springboot.camel.constant;

public class ServiceConstants {

	public static final String HELLO_SERVICE_ENDPOINT = "direct:hello";
	public static final String HELLO_ROUTE_ID = "HelloRoute";
	public static final String QUEUE_READER_ROUTE_ID = "QueueReaderRoute";
	public static final String REDELIVERY_COUNT_HEADER_NAME = "redeliveryCount";

	private ServiceConstants() {

	}
}

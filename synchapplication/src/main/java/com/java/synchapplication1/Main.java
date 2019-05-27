package com.java.synchapplication1;

public class Main {
	public static void main(String[] args) {
	    Customer customer1 = new Customer();
	    Customer customer2 = new Customer();
	    Thread thread1 = new Thread(customer1);
	    Thread thread2 = new Thread(customer2);
	    thread1.setName("Customer-1");
	    thread2.setName("Customer-2");
	    thread1.start();
	    thread2.start();
	}
}
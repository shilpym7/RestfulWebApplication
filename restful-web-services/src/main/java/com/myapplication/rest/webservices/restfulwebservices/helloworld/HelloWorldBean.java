package com.myapplication.rest.webservices.restfulwebservices.helloworld;

public class HelloWorldBean {

	private String message;

	public HelloWorldBean(String message) {
		// TODO Auto-generated constructor stub
		this.message=message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "helloWorldBean [message=" + message + "]";
	}

	public String getMessage() {
		return message;
	}
   

}

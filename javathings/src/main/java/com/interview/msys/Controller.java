package com.interview.msys;

public class Controller {
	private static final int NUMBER_OF_ELEMENTS=1000;
	private Service service;
	
	public Controller() {}
	
	public Service getService() {
		return service;
	}

	public void setService(Service service) {
		this.service = service;
	}

	public void  execute() {
	  String elementType = "String";
	  service.processRequest(NUMBER_OF_ELEMENTS,elementType);	
	}

}

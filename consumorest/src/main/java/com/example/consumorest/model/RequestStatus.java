package com.example.consumorest.model;

public class RequestStatus {

	private Long id;
	private String name;
	private boolean valid;
	
	public RequestStatus(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	public RequestStatus() {}
	
	public Long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public boolean isValid() {
		return !(getName() == null || getId() == null);
	}
}

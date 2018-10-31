package com.example.consumorest.model;

public class RequestType {

	private Long id;
	private String name;
	private String description;
	private boolean valid;

	public RequestType(Long id, String name, String description) {
		this.id = id;
		this.name = name;
		this.description = description;
	}
	
	public RequestType() {}
	
	public Long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}
	
	public boolean isValid() {
		return !(getName() == null || getId() == null);
	}
}

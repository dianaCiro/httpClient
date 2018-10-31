package com.example.consumorest.model;

public class IdType {

	private Long id;
	private String name;
	private boolean valid;
	
	public IdType(Long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public IdType() {}

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

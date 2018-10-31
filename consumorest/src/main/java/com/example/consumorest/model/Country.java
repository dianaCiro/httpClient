package com.example.consumorest.model;

public class Country {

	private Long id;
	private String name;
	private boolean valid;
	
	public Country(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	public Country(){}
	
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

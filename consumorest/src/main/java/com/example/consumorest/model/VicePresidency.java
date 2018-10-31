package com.example.consumorest.model;

public class VicePresidency {

	private Long id;
	private String name;
	private boolean valid;
	
	public VicePresidency(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	public VicePresidency() {}
	
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

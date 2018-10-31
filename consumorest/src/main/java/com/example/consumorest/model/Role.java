package com.example.consumorest.model;

public class Role {
	
	private Long id;
	private String name;
	private boolean valid;
	
	public Role(Long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public Role() {}
	
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

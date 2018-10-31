package com.example.consumorest.model;

public class AccountType {

	private Long id;
	private String name;
	private boolean valid;

	public AccountType(Long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public AccountType() {
	}
	
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

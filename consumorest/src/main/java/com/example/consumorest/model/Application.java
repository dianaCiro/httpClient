package com.example.consumorest.model;

import java.util.List;

public class Application {

	private Long id;
	private String name;
	private List<Role> roles;
	private User responsible;
	private boolean valid;
	public Application(Long id, String name, List<Role> roles) {
		this.id = id;
		this.name = name;
		this.roles = roles;
	}
	
	public Application() {}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public User getResponsible() {
		return responsible;
	}

	public void setResponsible(User responsible) {
		this.responsible = responsible;
	}

	public boolean isValid() {
		return !(getName() == null || getId() == null || getRoles() == null );
	}
}

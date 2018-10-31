package com.example.consumorest.model;

public class User {

	private Long id;
	private String name;
	private String lastName;
	private String email;
	private String position;
	private String phone;
	private String address;
	private VicePresidency vicePresidency;
	private IdType idType;
	private boolean valid;
	
	public User(Long id, String name, String lastName, String email, String phone, String address, IdType idType) {
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.idType = idType;
	}

	public User() {}
	
	public IdType getIdType() {
		return idType;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmail() {
		return email;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getPhone() {
		return phone;
	}

	public String getAddress() {
		return address;
	}

	public VicePresidency getVicePresidency() {
		return vicePresidency;
	}

	public void setVicePresidency(VicePresidency vicePresidency) {
		this.vicePresidency = vicePresidency;
	}

	public boolean isValid() {

		if (getAddress() == null || getEmail() == null || getId() == null || getIdType() == null) {
			return false;
		}
		
		if (getLastName() == null || getName() == null || getPhone() == null || getPosition() == null) {
			return false;
		}
		
		return (getVicePresidency() != null) ;

		
	}

}

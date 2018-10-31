package com.example.consumorest.model;

import java.util.Calendar;
import java.util.List;

public class Request {

	private Long id;
	private Calendar requestDate;
	private Calendar startDate;
	private String requestingUser;
	private Calendar endDate;
	private Country country;
	private User user;
	private String company;
	private String directBoss;
	private AccountType accountType;
	private RequestStatus requestStatus;
	private RequestType requestType;
	private Application application;
	private String justification;
	private List<Role> roles;
	private boolean valid; 
	
	public RequestType getRequestType() {
		return requestType;
	}

	public void setRequestType(RequestType requestType) {
		this.requestType = requestType;
	}

	public Long getId() {
		return id;
	}

	public Calendar getRequestDate() {
		return requestDate;
	}

	public Calendar getStartDate() {
		return startDate;
	}

	public String getRequestingUser() {
		return requestingUser;
	}

	public Calendar getEndDate() {
		return endDate;
	}

	public Country getCountry() {
		return country;
	}

	public User getUser() {
		return user;
	}

	public String getCompany() {
		return company;
	}

	public String getDirectBoss() {
		return directBoss;
	}

	public AccountType getAccountType() {
		return accountType;
	}

	public RequestStatus getRequestStatus() {
		return requestStatus;
	}

	public Application getApplication() {
		return application;
	}

	public String getJustification() {
		return justification;
	}

	public void setRequestDate(Calendar requestDate) {
		this.requestDate = requestDate;
	}

	public void setStartDate(Calendar startDate) {
		this.startDate = startDate;
	}

	public void setRequestingUser(String requestingUser) {
		this.requestingUser = requestingUser;
	}

	public void setEndDate(Calendar endDate) {
		this.endDate = endDate;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public void setDirectBoss(String directBoss) {
		this.directBoss = directBoss;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}

	public void setRequestStatus(RequestStatus requestStatus) {
		this.requestStatus = requestStatus;
	}

	public void setApplication(Application application) {
		this.application = application;
	}

	public void setJustification(String justification) {
		this.justification = justification;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	public boolean isValid() {
		
		if (getRequestDate() == null || getStartDate() == null || getRequestingUser() == null || getEndDate() == null) {
			return false;
		}
		if (getCompany() == null || getDirectBoss() == null || getJustification() == null  ) {
			return false;
		}

		if (getRequestType() == null || getCountry() == null || getUser() == null) {
			return false;
		}

		if (getAccountType() == null || getApplication() == null) {
			return false;
		}
		
		if (!getCountry().isValid()) {
			return false;
		}
		if (!getUser().isValid()) {
			return false;
		}
		if (!getAccountType().isValid()) {
			return false;
		}
		if (!getApplication().isValid()) {
			return false;
		}
		
		return getRequestType().isValid();
	}

}

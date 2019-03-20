package com.springboot.countries.model;

import java.util.Date;

public abstract class Player {
	private String code;
	private String name;
	private String countryCode;
	private String sportCode;
	private Date dateOfBirth;
	private boolean isActive;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getSportCode() {
		return sportCode;
	}
	public void setSportCode(String sportCode) {
		this.sportCode = sportCode;
	}
	@Override
	public String toString() {
		return "Player [code=" + code + ", name=" + name + ", dateOfBirth=" + dateOfBirth + ", isActive=" + isActive
				+ "]";
	}
	
	
}

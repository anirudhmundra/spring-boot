package com.springboot.countries.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Country {
	@Id
	@GeneratedValue
	private String code;
	private String name;
	
	public Country() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Country(String code, String name) {
		super();
		this.code = code;
		this.name = name;
	}
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
	@Override
	public String toString() {
		return "Country [code=" + code + ", name=" + name + "]";
	}
	
}

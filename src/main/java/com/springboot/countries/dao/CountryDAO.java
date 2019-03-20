package com.springboot.countries.dao;

import java.util.List;

import com.springboot.countries.model.Country;

public interface CountryDAO {
	public List<Country> getAllCountries();
	public Country getCountryByCode(String code);
}

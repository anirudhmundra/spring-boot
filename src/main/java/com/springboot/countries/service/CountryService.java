package com.springboot.countries.service;

import java.util.List;

import com.springboot.countries.model.Country;

public interface CountryService {
	public List<Country> getAllCountries();
	public Country getCountryByCode(String code);
}

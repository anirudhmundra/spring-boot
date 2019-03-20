package com.springboot.countries.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.countries.dao.CountryDAO;
import com.springboot.countries.model.Country;
import com.springboot.countries.service.CountryService;

@Service
public class CountryServiceImpl implements CountryService{

	@Autowired
	private CountryDAO countryDAO;
	@Override
	public List<Country> getAllCountries() {
		// TODO Auto-generated method stub
		return this.countryDAO.getAllCountries();
	}

	@Override
	public Country getCountryByCode(String code) {
		// TODO Auto-generated method stub
		return this.countryDAO.getCountryByCode(code);
		
	}

}

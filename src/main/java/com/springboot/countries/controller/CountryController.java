package com.springboot.countries.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.countries.model.Country;
import com.springboot.countries.service.CountryService;

@RestController
public class CountryController {
	
	@Autowired
	private CountryService countryService;
	
	@GetMapping("/countries")
	public List<Country> getAllCountries() {
		return this.countryService.getAllCountries();
	}
	
	@GetMapping("/countries/{code}")
	public Country getCountryByCode(@PathVariable("code") String code) {
		return this.countryService.getCountryByCode(code);
	}
}

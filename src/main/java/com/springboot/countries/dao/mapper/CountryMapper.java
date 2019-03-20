package com.springboot.countries.dao.mapper;


import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.springboot.countries.model.Country;

public class CountryMapper implements RowMapper<Country>{

	@Override
	public Country mapRow(ResultSet rs, int rowNum) throws SQLException {
		Country country = new Country();
		country.setCode(rs.getString("code"));
		country.setName(rs.getString("name"));
		return country;
	}

}

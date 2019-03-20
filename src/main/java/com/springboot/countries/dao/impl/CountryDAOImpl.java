package com.springboot.countries.dao.impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.springboot.countries.dao.CountryDAO;
import com.springboot.countries.dao.mapper.CountryMapper;
import com.springboot.countries.model.Country;
@Repository
public class CountryDAOImpl extends JdbcDaoSupport implements CountryDAO {
	@Autowired
	CountryDAOImpl(DataSource dataSource){
        setDataSource(dataSource);
    }
	@Override
	public List<Country> getAllCountries() {
		// TODO Auto-generated method stub
		return this.getJdbcTemplate().query("select * from country", new CountryMapper());
	}

	@Override
	public Country getCountryByCode(String code) {
		// TODO Auto-generated method stub
		return this.getJdbcTemplate().queryForObject("select * from country where code = ?", new Object[]{code}, new CountryMapper());
	}

}

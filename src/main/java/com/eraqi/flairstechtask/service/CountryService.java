package com.eraqi.flairstechtask.service;

import com.eraqi.flairstechtask.constants.Error;
import com.eraqi.flairstechtask.dao.CountryDao;
import com.eraqi.flairstechtask.dao.CountryLanguageDao;
import com.eraqi.flairstechtask.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CountryService implements ICountryService {

    @Autowired
    CountryDao countryDao ;

    @Autowired
    CountryLanguageDao countryLanguageDao;

    @Override
    public ResponseEntity<Country> getCountryByCode(String code) {

        try {
            Country country = countryDao.findByCode(code);
            System.out.println(country.getContinent());
             country.setCountry_language(countryLanguageDao.findByCountryCode(code).get(0).getLanguage());
        }catch (NullPointerException npe) {
            System.out.println(npe);
            return new ResponseEntity(Error.INVALID_COUNTRY_CODE, HttpStatus.INTERNAL_SERVER_ERROR);
        }catch (Exception e) {
            System.out.println(e);
            return new ResponseEntity(Error.INTERNAL_ERROR, HttpStatus.OK);
        }
        return new ResponseEntity(countryDao.findByCode(code), HttpStatus.OK);
    }
}

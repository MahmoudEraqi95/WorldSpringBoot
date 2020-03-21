package com.eraqi.flairstechtask.service;

import com.eraqi.flairstechtask.constants.Error;
import com.eraqi.flairstechtask.dao.CountryDao;
import com.eraqi.flairstechtask.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CountryService implements ICountryService {

    @Autowired
    CountryDao countryDao ;

    @Override
    public ResponseEntity<Country> getCountryByCode(String code) {
        try {
            Country country = countryDao.findByCode(code);
        }catch (NullPointerException npe) {
            return new ResponseEntity(Error.INVALID_COUNTRY_CODE, HttpStatus.INTERNAL_SERVER_ERROR);
        }catch (Exception e) {
            return new ResponseEntity(Error.INTERNAL_ERROR, HttpStatus.OK);
        }
        return new ResponseEntity(countryDao.findByCode(code), HttpStatus.OK);
    }
}

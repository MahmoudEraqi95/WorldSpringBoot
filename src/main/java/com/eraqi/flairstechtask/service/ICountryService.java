package com.eraqi.flairstechtask.service;

import com.eraqi.flairstechtask.model.Country;
import org.springframework.http.ResponseEntity;

public interface ICountryService {
    ResponseEntity<Country> getCountryByCode(String code);
}

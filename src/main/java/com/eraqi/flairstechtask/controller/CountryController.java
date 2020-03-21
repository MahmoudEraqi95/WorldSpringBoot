package com.eraqi.flairstechtask.controller;

import com.eraqi.flairstechtask.constants.Error;
import com.eraqi.flairstechtask.model.Country;
import com.eraqi.flairstechtask.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;

@RestController
public class CountryController {

    @Autowired
    CountryService countryService;

    @GetMapping("/{code}")
    public ResponseEntity<Country> getCountryByCode(@PathVariable(value = "code") String code){
       return countryService.getCountryByCode(code);
    }

}

package com.eraqi.flairstechtask.tests;

import com.eraqi.flairstechtask.constants.Error;
import com.eraqi.flairstechtask.service.CountryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import static org.junit.Assert.assertEquals;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class CountryControllerTest {

    @Autowired
    CountryService countryService;

    @Test
    public void testGetCountryByCode()  {

        assertEquals(Error.INVALID_COUNTRY_CODE, countryService.getCountryByCode("Era").getBody());
    }

    @Test
    public void testDataBaseFailed() throws Exception {
        assertEquals(Error.INTERNAL_ERROR, countryService.getCountryByCode("BHR").getBody());
    }
}

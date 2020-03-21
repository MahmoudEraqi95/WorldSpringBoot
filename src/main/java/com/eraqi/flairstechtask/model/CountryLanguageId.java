package com.eraqi.flairstechtask.model;



import java.io.Serializable;


public class CountryLanguageId implements Serializable {

    private String countryCode;

    private String language;

    public CountryLanguageId() {
    }

    public CountryLanguageId(String countryCode, String language) {
        this.countryCode = countryCode;
        this.language = language;
    }
}

package com.eraqi.flairstechtask.model;

import javax.persistence.*;

@Entity(name = "country_language")
@IdClass(CountryLanguageId.class)
public class CountryLanguage {
    @Id
    private String countryCode;

    @Id
    private String language;

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}

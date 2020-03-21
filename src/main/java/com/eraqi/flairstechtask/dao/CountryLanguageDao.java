package com.eraqi.flairstechtask.dao;

import com.eraqi.flairstechtask.model.CountryLanguage;
import com.eraqi.flairstechtask.model.CountryLanguageId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountryLanguageDao extends JpaRepository< CountryLanguage, CountryLanguageId> {
    List<CountryLanguage> findByCountryCode(String countryCode);
}

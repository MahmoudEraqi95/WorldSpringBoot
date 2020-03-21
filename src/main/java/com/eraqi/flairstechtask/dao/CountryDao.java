package com.eraqi.flairstechtask.dao;

import com.eraqi.flairstechtask.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryDao extends JpaRepository<Country, String> {

    Country findByCode(String code);
}

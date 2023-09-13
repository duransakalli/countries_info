package com.countries.controller;

import com.countries.model.Country;
import com.countries.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@CrossOrigin("http://localhost:3000/")
@RestController
public class CountryController {

    private CountryRepository repository;

    @Autowired
    public CountryController(CountryRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/country")
    public List<Country> getCountryList() {
        return repository.findAll();
    }

    @GetMapping("/country/{id}")
    public Optional<Country> getCountry(@PathVariable String id) {
        return repository.findById(id);
    }

}

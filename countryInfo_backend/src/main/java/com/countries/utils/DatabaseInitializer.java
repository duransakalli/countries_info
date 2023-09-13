package com.countries.utils;

import com.countries.model.Country;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Service
public class DatabaseInitializer {

    @Autowired
    private MongoTemplate mongoTemplate;

    @PostConstruct
    public void initialize() throws IOException {

        mongoTemplate.remove(new Query(), Country.class);

        long count = mongoTemplate.count(new Query(), "countries");

        if(count > 0) {
            return;
        }

        InputStream inputStream = new ClassPathResource("countries.json").getInputStream();
        ObjectMapper mapper = new ObjectMapper();
        List<Country> countries = mapper.readValue(inputStream, new TypeReference<List<Country>>() {});

        mongoTemplate.insertAll(countries);
    }

}

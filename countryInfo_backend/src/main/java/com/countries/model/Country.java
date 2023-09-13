package com.countries.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.Id;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Country {

    private String name;
    private String code;
    private String capital;
    private String region;
    private Currency currency;
    private Language language;

    private String flag;
    private String dialling_code;

    private String isoCode;

    public Country(String name, String code, String capital, String region, Currency currency, Language language, String flag, String dialling_code, String isoCode) {
        this.name = name;
        this.code = code;
        this.capital = capital;
        this.region = region;
        this.currency = currency;
        this.language = language;
        this.flag = flag;
        this.dialling_code = dialling_code;
        this.isoCode = isoCode;
    }

    public Country() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getDialling_code() {
        return dialling_code;
    }

    public void setDialling_code(String dialling_code) {
        this.dialling_code = dialling_code;
    }

    public String getIsoCode() {
        return isoCode;
    }

    public void setIsoCode(String isoCode) {
        this.isoCode = isoCode;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", capital='" + capital + '\'' +
                ", region='" + region + '\'' +
                ", currency=" + currency +
                ", language=" + language +
                ", flag='" + flag + '\'' +
                ", dialling_code='" + dialling_code + '\'' +
                ", isoCode='" + isoCode + '\'' +
                '}';
    }
}

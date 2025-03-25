package com.isaque.hexagonal.application.core.domain;

public class Adress {

    public Adress() {
    }

    public Adress(String street, String city, String state) {
        this.street = street;
        this.city = city;
        this.state = state;
    }

    private String street;

    private String city;

    private String state;

    public String getStreet() {
        return this.street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

}

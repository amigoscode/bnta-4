package com.bnta.examples.oop;

public class Address {
    private String firstLine;
    private String postCode;
    private String city;

    public Address(String firstLine, String postCode, String city) {
        this.firstLine = firstLine;
        this.postCode = postCode;
        this.city = city;
    }

    public String getFirstLine() {
        return firstLine;
    }

    public void setFirstLine(String firstLine) {
        this.firstLine = firstLine;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "firstLine='" + firstLine + '\'' +
                ", postCode='" + postCode + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}

package com.onelogin.saml2.model;

public class CessionarioCommittente {

    private String cmIDCountry;
    private String cmIDCode;
    private String cmIDDenomination;
    private String hqAddress;
    private String hqAddressNumber;
    private String hqPostalCode;
    private String hqCity;
    private String hqCounty;

    public CessionarioCommittente(String cmIDCountry, String cmIDCode, String cmIDDenomination, String hqAddress, String hqAddressNumber, String hqPostalCode, String hqCity, String hqCounty) {
        this.cmIDCountry = cmIDCountry;
        this.cmIDCode = cmIDCode;
        this.cmIDDenomination = cmIDDenomination;
        this.hqAddress = hqAddress;
        this.hqAddressNumber = hqAddressNumber;
        this.hqPostalCode = hqPostalCode;
        this.hqCity = hqCity;
        this.hqCounty = hqCounty;
    }


    public String getCmIDCountry() {
        return cmIDCountry;
    }

    public void setCmIDCountry(String cmIDCountry) {
        this.cmIDCountry = cmIDCountry;
    }

    public String getCmIDCode() {
        return cmIDCode;
    }

    public void setCmIDCode(String cmIDCode) {
        this.cmIDCode = cmIDCode;
    }

    public String getCmIDDenomination() {
        return cmIDDenomination;
    }

    public void setCmIDDenomination(String cmIDDenomination) {
        this.cmIDDenomination = cmIDDenomination;
    }

    public String getHqAddress() {
        return hqAddress;
    }

    public void setHqAddress(String hqAddress) {
        this.hqAddress = hqAddress;
    }

    public String getHqAddressNumber() {
        return hqAddressNumber;
    }

    public void setHqAddressNumber(String hqAddressNumber) {
        this.hqAddressNumber = hqAddressNumber;
    }

    public String getHqPostalCode() {
        return hqPostalCode;
    }

    public void setHqPostalCode(String hqPostalCode) {
        this.hqPostalCode = hqPostalCode;
    }

    public String getHqCity() {
        return hqCity;
    }

    public void setHqCity(String hqCity) {
        this.hqCity = hqCity;
    }

    public String getHqCounty() {
        return hqCounty;
    }

    public void setHqCounty(String hqCounty) {
        this.hqCounty = hqCounty;
    }
}

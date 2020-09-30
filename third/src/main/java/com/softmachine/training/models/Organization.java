
package com.softmachine.training.models;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Organization {

    @SerializedName("id") private Long id;
    @SerializedName("code")
    private String code;
    @SerializedName("name_full")
    private String nameFull;
    @SerializedName("name_short")
    private String nameShort;
    @SerializedName("inn")
    private String inn;
    @SerializedName("company_type")
    private CompanyType companyType;
    @SerializedName("ogrn")
    private String ogrn;
    @SerializedName("egrul_date")
    private String egrulDate;
    @SerializedName("country")
    private Country country;
    @SerializedName("fio_head")
    private String fioHead;
    @SerializedName("address")
    private String address;
    @SerializedName("phone")
    private String phone;
    @SerializedName("e_mail")
    private String eMail;
    @SerializedName("www")
    private String www;
    @SerializedName("is_resident")
    private Boolean isResident;
    @SerializedName("securities")
    private List<Security> securities = new ArrayList<>();


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNameFull() {
        return nameFull;
    }

    public void setNameFull(String nameFull) {
        this.nameFull = nameFull;
    }

    public String getNameShort() {
        return nameShort;
    }

    public void setNameShort(String nameShort) {
        this.nameShort = nameShort;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public CompanyType getCompanyType() {
        return companyType;
    }

    public void setCompanyType(CompanyType companyType) {
        this.companyType = companyType;
    }

    public String getOgrn() {
        return ogrn;
    }

    public void setOgrn(String ogrn) {
        this.ogrn = ogrn;
    }

    public String getEgrulDate() {
        return egrulDate;
    }

    public void setEgrulDate(String egrulDate) {
        this.egrulDate = egrulDate;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getFioHead() {
        return fioHead;
    }

    public void setFioHead(String fioHead) {
        this.fioHead = fioHead;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEMail() {
        return eMail;
    }

    public void setEMail(String eMail) {
        this.eMail = eMail;
    }

    public String getWww() {
        return www;
    }

    public void setWww(String www) {
        this.www = www;
    }

    public Boolean getIsResident() {
        return isResident;
    }

    public void setIsResident(Boolean isResident) {
        this.isResident = isResident;
    }

    public List<Security> getSecurities() {
        return securities;
    }

    public void setSecurities(List<Security> securities) {
        this.securities = securities;
    }

    @Override
    public String toString() {
        return "Example{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", nameFull='" + nameFull + '\'' +
                ", nameShort='" + nameShort + '\'' +
                ", inn='" + inn + '\'' +
                ", companyType=" + companyType +
                ", ogrn='" + ogrn + '\'' +
                ", egrulDate='" + egrulDate + '\'' +
                ", country=" + country +
                ", fioHead='" + fioHead + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", eMail='" + eMail + '\'' +
                ", www='" + www + '\'' +
                ", isResident=" + isResident +
                ", securities=" + securities +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Organization organization = (Organization) o;
        return Objects.equals(id, organization.id) &&
                Objects.equals(code, organization.code) &&
                Objects.equals(nameFull, organization.nameFull) &&
                Objects.equals(nameShort, organization.nameShort) &&
                Objects.equals(inn, organization.inn) &&
                Objects.equals(companyType, organization.companyType) &&
                Objects.equals(ogrn, organization.ogrn) &&
                Objects.equals(egrulDate, organization.egrulDate) &&
                Objects.equals(country, organization.country) &&
                Objects.equals(fioHead, organization.fioHead) &&
                Objects.equals(address, organization.address) &&
                Objects.equals(phone, organization.phone) &&
                Objects.equals(eMail, organization.eMail) &&
                Objects.equals(www, organization.www) &&
                Objects.equals(isResident, organization.isResident) &&
                Objects.equals(securities, organization.securities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, code, nameFull, nameShort, inn, companyType, ogrn, egrulDate, country, fioHead, address, phone, eMail, www, isResident, securities);
    }
}

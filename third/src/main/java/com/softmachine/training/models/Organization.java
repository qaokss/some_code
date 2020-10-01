
package com.softmachine.training.models;

import com.google.gson.annotations.SerializedName;

import java.time.LocalDate;
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
    private LocalDate egrulDate;
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

    public LocalDate getEgrulDate() {
        return egrulDate;
    }

    public void setEgrulDate(LocalDate egrulDate) {
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

        Organization that = (Organization) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (code != null ? !code.equals(that.code) : that.code != null) return false;
        if (nameFull != null ? !nameFull.equals(that.nameFull) : that.nameFull != null) return false;
        if (nameShort != null ? !nameShort.equals(that.nameShort) : that.nameShort != null) return false;
        if (inn != null ? !inn.equals(that.inn) : that.inn != null) return false;
        if (companyType != null ? !companyType.equals(that.companyType) : that.companyType != null) return false;
        if (ogrn != null ? !ogrn.equals(that.ogrn) : that.ogrn != null) return false;
        if (egrulDate != null ? !egrulDate.equals(that.egrulDate) : that.egrulDate != null) return false;
        if (country != null ? !country.equals(that.country) : that.country != null) return false;
        if (fioHead != null ? !fioHead.equals(that.fioHead) : that.fioHead != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (phone != null ? !phone.equals(that.phone) : that.phone != null) return false;
        if (eMail != null ? !eMail.equals(that.eMail) : that.eMail != null) return false;
        if (www != null ? !www.equals(that.www) : that.www != null) return false;
        if (isResident != null ? !isResident.equals(that.isResident) : that.isResident != null) return false;
        return securities != null ? securities.equals(that.securities) : that.securities == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (nameFull != null ? nameFull.hashCode() : 0);
        result = 31 * result + (nameShort != null ? nameShort.hashCode() : 0);
        result = 31 * result + (inn != null ? inn.hashCode() : 0);
        result = 31 * result + (companyType != null ? companyType.hashCode() : 0);
        result = 31 * result + (ogrn != null ? ogrn.hashCode() : 0);
        result = 31 * result + (egrulDate != null ? egrulDate.hashCode() : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + (fioHead != null ? fioHead.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (eMail != null ? eMail.hashCode() : 0);
        result = 31 * result + (www != null ? www.hashCode() : 0);
        result = 31 * result + (isResident != null ? isResident.hashCode() : 0);
        result = 31 * result + (securities != null ? securities.hashCode() : 0);
        return result;
    }


}

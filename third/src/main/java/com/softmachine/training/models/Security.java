
package com.softmachine.training.models;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class Security {

    @SerializedName("id")
    private Long id;
    @SerializedName("code")
    private String code;
    @SerializedName("name_full")
    private String nameFull;
    @SerializedName("cfi")
    private String cfi;
    @SerializedName("date_to")
    private String dateTo;
    @SerializedName("state_reg_date")
    private String stateRegDate;
    @SerializedName("state")
    private State state;
    @SerializedName("currency")
    private Currency currency;


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

    public String getCfi() {
        return cfi;
    }

    public void setCfi(String cfi) {
        this.cfi = cfi;
    }

    public String getDateTo() {
        return dateTo;
    }

    public void setDateTo(String dateTo) {
        this.dateTo = dateTo;
    }

    public String getStateRegDate() {
        return stateRegDate;
    }

    public void setStateRegDate(String stateRegDate) {
        this.stateRegDate = stateRegDate;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "Security{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", nameFull='" + nameFull + '\'' +
                ", cfi='" + cfi + '\'' +
                ", dateTo='" + dateTo + '\'' +
                ", stateRegDate='" + stateRegDate + '\'' +
                ", state=" + state +
                ", currency=" + currency +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Security security = (Security) o;
        return Objects.equals(id, security.id) &&
                Objects.equals(code, security.code) &&
                Objects.equals(nameFull, security.nameFull) &&
                Objects.equals(cfi, security.cfi) &&
                Objects.equals(dateTo, security.dateTo) &&
                Objects.equals(stateRegDate, security.stateRegDate) &&
                Objects.equals(state, security.state) &&
                Objects.equals(currency, security.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, code, nameFull, cfi, dateTo, stateRegDate, state, currency);
    }
}

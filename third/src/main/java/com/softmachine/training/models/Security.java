
package com.softmachine.training.models;

import com.google.gson.annotations.SerializedName;

import java.time.LocalDate;
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
    private LocalDate dateTo;
    @SerializedName("state_reg_date")
    private LocalDate stateRegDate;
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

    public void setDateTo(LocalDate dateTo) {
        this.dateTo = dateTo;
    }

    public LocalDate getDateTo() {
        return dateTo;
    }

    public LocalDate getStateRegDate() {
        return stateRegDate;
    }

    public void setStateRegDate(LocalDate stateRegDate) {
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

        if (id != null ? !id.equals(security.id) : security.id != null) return false;
        if (code != null ? !code.equals(security.code) : security.code != null) return false;
        if (nameFull != null ? !nameFull.equals(security.nameFull) : security.nameFull != null) return false;
        if (cfi != null ? !cfi.equals(security.cfi) : security.cfi != null) return false;
        if (dateTo != null ? !dateTo.equals(security.dateTo) : security.dateTo != null) return false;
        if (stateRegDate != null ? !stateRegDate.equals(security.stateRegDate) : security.stateRegDate != null)
            return false;
        if (state != null ? !state.equals(security.state) : security.state != null) return false;
        return currency != null ? currency.equals(security.currency) : security.currency == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (nameFull != null ? nameFull.hashCode() : 0);
        result = 31 * result + (cfi != null ? cfi.hashCode() : 0);
        result = 31 * result + (dateTo != null ? dateTo.hashCode() : 0);
        result = 31 * result + (stateRegDate != null ? stateRegDate.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (currency != null ? currency.hashCode() : 0);
        return result;
    }
}

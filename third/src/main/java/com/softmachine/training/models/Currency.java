
package com.softmachine.training.models;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class Currency {

    @SerializedName("id")
    private Long id;
    @SerializedName("code")
    private String code;
    @SerializedName("name_short")
    private String nameShort;
    @SerializedName("name_full")
    private String nameFull;


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

    public String getNameShort() {
        return nameShort;
    }

    public void setNameShort(String nameShort) {
        this.nameShort = nameShort;
    }

    public String getNameFull() {
        return nameFull;
    }

    public void setNameFull(String nameFull) {
        this.nameFull = nameFull;
    }

    @Override
    public String toString() {
        return "Currency{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", nameShort='" + nameShort + '\'' +
                ", nameFull='" + nameFull + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Currency currency = (Currency) o;
        return Objects.equals(id, currency.id) &&
                Objects.equals(code, currency.code) &&
                Objects.equals(nameShort, currency.nameShort) &&
                Objects.equals(nameFull, currency.nameFull);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, code, nameShort, nameFull);
    }
}

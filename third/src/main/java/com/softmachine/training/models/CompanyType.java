
package com.softmachine.training.models;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;


public class CompanyType {

    @SerializedName("id")
    private Long id;
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
        return "CompanyType{" +
                "id=" + id +
                ", nameShort='" + nameShort + '\'' +
                ", nameFull='" + nameFull + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CompanyType that = (CompanyType) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(nameShort, that.nameShort) &&
                Objects.equals(nameFull, that.nameFull);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nameShort, nameFull);
    }
}

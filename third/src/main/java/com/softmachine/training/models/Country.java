
package com.softmachine.training.models;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;


public class Country {

    @SerializedName("id")
    private Long id;
    @SerializedName("code")
    private String code;
    @SerializedName("name")
    private String name;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return Objects.equals(id, country.id) &&
                Objects.equals(code, country.code) &&
                Objects.equals(name, country.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, code, name);
    }
}

package com.kovrizhkin.spring.boot.model.dto;

import java.util.Objects;

public class PortDto {

    private long id;

    private String name;

    private String country;

    public PortDto() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PortDto portDto = (PortDto) o;
        return id == portDto.id && Objects.equals(name, portDto.name) && Objects.equals(country, portDto.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, country);
    }
}

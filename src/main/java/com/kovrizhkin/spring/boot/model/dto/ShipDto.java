package com.kovrizhkin.spring.boot.model.dto;

import java.util.Objects;

public class ShipDto {
    private Long id;

    private String name;

    private String country;

    private PortDto port;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public PortDto getPort() {
        return port;
    }

    public void setPort(PortDto port) {
        this.port = port;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShipDto shipDto = (ShipDto) o;
        return Objects.equals(id, shipDto.id) && Objects.equals(name, shipDto.name) && Objects.equals(country, shipDto.country) && Objects.equals(port, shipDto.port);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, country, port);
    }
}

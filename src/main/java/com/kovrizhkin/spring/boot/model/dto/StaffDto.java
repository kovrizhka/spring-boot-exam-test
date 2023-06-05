package com.kovrizhkin.spring.boot.model.dto;

import java.util.Objects;
import java.util.Set;

public class StaffDto {
    private Long id;
    private String name;
    private String post;

    private Set<ShipDto> ships;

    public StaffDto() {
    }

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

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public Set<ShipDto> getShips() {
        return ships;
    }

    public void setShips(Set<ShipDto> ships) {
        this.ships = ships;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StaffDto staffDto = (StaffDto) o;
        return Objects.equals(id, staffDto.id) && Objects.equals(name, staffDto.name) && Objects.equals(post, staffDto.post);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, post);
    }
}

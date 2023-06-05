package com.kovrizhkin.spring.boot.model.entities;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "staff")
public class StaffEntity {

    @Id
    @Column
    private Long id;

    @Column
    private String name;

    @Column
    private String post;

    @ManyToMany(mappedBy = "staff")
    private Set<ShipEntity> ships;

    public StaffEntity() {
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

    public Set<ShipEntity> getShips() {
        return ships;
    }

    public void setShips(Set<ShipEntity> ships) {
        this.ships = ships;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StaffEntity that = (StaffEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(post, that.post);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, post);
    }
}

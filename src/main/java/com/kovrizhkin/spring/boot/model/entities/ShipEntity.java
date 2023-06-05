package com.kovrizhkin.spring.boot.model.entities;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "ship")
public class ShipEntity {
    @Id
    @Column
    private Long id;
    @Column
    private String name;
    @Column
    private String country;
    @ManyToOne
    @JoinColumn(name = "port_id")
    private PortEntity port;

    @ManyToMany()
    @JoinTable(name = "task",
            joinColumns = @JoinColumn(name = "ship_id"),
            inverseJoinColumns = @JoinColumn(name = "staff_id"))
    private Set<StaffEntity> staff;

    public ShipEntity() {
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public PortEntity getPort() {
        return port;
    }

    public void setPort(PortEntity port) {
        this.port = port;
    }

    public Set<StaffEntity> getStaff() {
        return staff;
    }

    public void setStaff(Set<StaffEntity> staff) {
        this.staff = staff;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShipEntity that = (ShipEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(country, that.country) && Objects.equals(port, that.port);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, country, port);
    }
}

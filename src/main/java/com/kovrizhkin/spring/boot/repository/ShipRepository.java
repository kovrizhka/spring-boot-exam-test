package com.kovrizhkin.spring.boot.repository;

import com.kovrizhkin.spring.boot.model.entities.ShipEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShipRepository extends JpaRepository<ShipEntity, Long> {

}

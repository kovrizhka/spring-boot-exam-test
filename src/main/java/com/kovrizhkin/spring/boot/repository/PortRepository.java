package com.kovrizhkin.spring.boot.repository;

import com.kovrizhkin.spring.boot.model.entities.PortEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PortRepository extends JpaRepository<PortEntity, Long> {
}

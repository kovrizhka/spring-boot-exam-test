package com.kovrizhkin.spring.boot.repository;

import com.kovrizhkin.spring.boot.model.entities.StaffEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffRepository extends JpaRepository<StaffEntity, Long> {
}

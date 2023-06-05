package com.kovrizhkin.spring.boot.service;

import com.kovrizhkin.spring.boot.model.dto.StaffDto;

import java.util.List;

public interface StaffService {
    StaffDto create(StaffDto staff);

    List<StaffDto> findAll();

    StaffDto findById(long id);

    StaffDto update(StaffDto staff);

    StaffDto delete(long id);
}

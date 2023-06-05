package com.kovrizhkin.spring.boot.service;

import com.kovrizhkin.spring.boot.model.dto.PortDto;

import java.util.List;

public interface PortService {
    PortDto create(PortDto port);

    List<PortDto> findAll();

    PortDto findById(long id);

    PortDto update(PortDto port);

    PortDto delete(long id);
}

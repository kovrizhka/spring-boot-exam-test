package com.kovrizhkin.spring.boot.service;

import com.kovrizhkin.spring.boot.model.dto.ShipDto;

import java.util.List;

public interface ShipService {
    ShipDto create(ShipDto ship);

    List<ShipDto> findAll();

    ShipDto findById(long id);

    ShipDto update(ShipDto ship);

    ShipDto delete(long id);
}

package com.kovrizhkin.spring.boot.service.impl;

import com.kovrizhkin.spring.boot.exeption.NotFoundValueException;
import com.kovrizhkin.spring.boot.mapper.ShipMapper;
import com.kovrizhkin.spring.boot.model.dto.ShipDto;
import com.kovrizhkin.spring.boot.repository.ShipRepository;
import com.kovrizhkin.spring.boot.service.ShipService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShipServiceImpl implements ShipService {
    private final ShipRepository shipRepository;
    private final ShipMapper shipMapper;

    public ShipServiceImpl(ShipRepository shipRepository, ShipMapper shipMapper) {
        this.shipRepository = shipRepository;
        this.shipMapper = shipMapper;
    }

    @Override
    public ShipDto create(ShipDto ship) {
        shipRepository.save(shipMapper.toEntity(ship));
        return ship;
    }

    @Override
    public List<ShipDto> findAll() {
        return shipMapper.toDtoList(shipRepository.findAll());
    }

    @Override
    public ShipDto findById(long id) {
        return shipMapper.toDto(shipRepository.findById(id)
                .orElseThrow(() -> new NotFoundValueException(ShipDto.class, "id", id)));
    }

    @Override
    public ShipDto update(ShipDto ship) {
        Long id = ship.getId();
        shipRepository.findById(id)
                .orElseThrow(() -> new NotFoundValueException(ShipDto.class, "id", id));
        return shipMapper.toDto(shipRepository.save(shipMapper.toEntity(ship)));
    }

    @Override
    public ShipDto delete(long id) {
        ShipDto shipDTO = shipMapper.toDto(shipRepository.findById(id)
                .orElseThrow(() -> new NotFoundValueException(ShipDto.class, "id", id)));
        shipRepository.deleteById(id);
        return shipDTO;
    }
}

package com.kovrizhkin.spring.boot.mapper;

import com.kovrizhkin.spring.boot.model.dto.PortDto;
import com.kovrizhkin.spring.boot.model.entities.PortEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = ShipMapper.class)
public interface PortMapper {
    PortEntity toEntity(PortDto portDTO);

    PortDto toDto(PortEntity portEntity);

    List<PortEntity> toEntityList(List<PortDto> dtos);

    List<PortDto> toDtoList(List<PortEntity> entitys);
}
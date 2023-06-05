package com.kovrizhkin.spring.boot.mapper;

import com.kovrizhkin.spring.boot.model.dto.ShipDto;
import com.kovrizhkin.spring.boot.model.entities.ShipEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring", uses = {PortMapper.class})
public interface ShipMapper {

    ShipMapper SHIP_MAPPER = Mappers.getMapper(ShipMapper.class);

    @Mappings({
            @Mapping(source = "port", target = "port")
    })
    ShipEntity toEntity(ShipDto shipDTO);

    @Mappings({
            @Mapping(source = "port", target = "port")
    })
    ShipDto toDto(ShipEntity shipEntity);

    List<ShipEntity> toEntityList(List<ShipDto> dtos);

    List<ShipDto> toDtoList(List<ShipEntity> entitys);

}

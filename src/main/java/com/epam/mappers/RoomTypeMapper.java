package com.epam.mappers;

import com.epam.dto.RoomTypeDTO;
import com.epam.model.RoomType;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public abstract class RoomTypeMapper {
    public abstract RoomTypeDTO typeToTypeDTO(RoomType type);

    public abstract List<RoomTypeDTO> typesToTypesDTO(List<RoomType> types);

    public abstract RoomType typeDTOToType(RoomTypeDTO type);

    public abstract List<RoomType> typeDTOsToTypes(List<RoomTypeDTO> types);
}

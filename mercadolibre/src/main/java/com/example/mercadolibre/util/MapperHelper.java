package com.example.mercadolibre.util;

import com.example.mercadolibre.dto.BaseDto;
import com.example.mercadolibre.entity.BaseEntity;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class MapperHelper implements IMapperHelper<BaseEntity, BaseDto>{

//    @Autowired
//    ModelMapper modelMapper;
//
//    @Override
//    public BaseDto mapToDTO(BaseEntity baseEntity, BaseDto dto) {
//        return modelMapper.map(baseEntity, dto.getClass());
//    }
//
//    @Override
//    public BaseEntity mapToEntity(BaseDto dto, BaseEntity baseEntity) {
//        return modelMapper.map(dto, baseEntity.getClass());
//    }

    @Autowired
    ObjectMapper modelMapper;

    @Override
    public BaseDto mapToDTO(BaseEntity baseEntity, BaseDto dto) {
        return modelMapper.convertValue(baseEntity, dto.getClass());
    }

    @Override
    public BaseEntity mapToEntity(BaseDto dto, BaseEntity baseEntity) {
        return modelMapper.convertValue(dto, baseEntity.getClass());
    }
}

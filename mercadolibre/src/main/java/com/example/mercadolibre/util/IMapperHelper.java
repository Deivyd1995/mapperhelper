package com.example.mercadolibre.util;

import com.example.mercadolibre.dto.BaseDto;
import com.example.mercadolibre.entity.BaseEntity;

public interface IMapperHelper<T, X> {

     BaseDto mapToDTO(T t, X x);

     BaseEntity mapToEntity(X x , T t);

}

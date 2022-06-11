package com.example.mercadolibre.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PerroDto extends BaseDto {

    private String nombre;
    private int edad;

    public PerroDto() {
    }
}

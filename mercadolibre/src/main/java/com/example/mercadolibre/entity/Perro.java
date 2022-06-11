package com.example.mercadolibre.entity;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Perro extends BaseEntity {

    private String nombre;
    private int edad;

}

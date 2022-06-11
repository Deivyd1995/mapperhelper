package com.example.mercadolibre.entity;

import com.example.mercadolibre.util.IBaseDto;
import lombok.*;

import javax.persistence.*;

@Entity
@Table
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor


public abstract class BaseEntity implements IBaseDto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

}

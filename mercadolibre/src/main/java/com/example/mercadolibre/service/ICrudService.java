package com.example.mercadolibre.service;

import java.util.Set;

public interface ICrudService<T> {

    T findById(Long id);
    T create(T t);
    void deleteById(Long id);
    T update(T t) ;
    Set<T> findAll();

}

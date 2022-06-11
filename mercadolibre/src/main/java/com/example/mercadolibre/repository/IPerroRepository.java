package com.example.mercadolibre.repository;

import com.example.mercadolibre.entity.Perro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPerroRepository extends JpaRepository<Perro, Long> {
}

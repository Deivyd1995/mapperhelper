package com.example.mercadolibre.service.impl;


import com.example.mercadolibre.dto.PerroDto;
import com.example.mercadolibre.entity.Perro;
import com.example.mercadolibre.repository.IPerroRepository;
import com.example.mercadolibre.service.IPerroService;
import com.example.mercadolibre.util.MapperHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PerroService implements IPerroService{

    @Autowired
    MapperHelper mapperHelper;
    @Autowired
    IPerroRepository perroRepository;

    Perro perrito = new Perro();

    @Override
    public PerroDto findById(Long id) {
        return null;
    }

    @Override
    public PerroDto create(PerroDto perroDto) {
       perrito = (Perro) mapperHelper.mapToEntity(perroDto, perrito);
       return (PerroDto) mapperHelper.mapToDTO(perroRepository.save(perrito), perroDto);
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public PerroDto update(PerroDto perroDto) {
        return null;
    }

    @Override
    public Set<PerroDto> findAll() {
        return null;
    }
}

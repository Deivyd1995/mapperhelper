package com.example.mercadolibre.controller;

import com.example.mercadolibre.dto.PerroDto;
import com.example.mercadolibre.service.impl.PerroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/perro")
public class PerroController {

    @Autowired
    PerroService perroService;

    @PostMapping("/save")
    public ResponseEntity<?> guardarPerro(@RequestBody PerroDto perroDto){
        PerroDto perroDto1= perroService.create(perroDto);
       return new ResponseEntity<>(perroDto1, HttpStatus.OK);
    }

}

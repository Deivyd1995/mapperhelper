package com.example.mercadolibre;


import com.example.mercadolibre.util.MapperHelper;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MercadolibreApplication {

	@Bean
	public ModelMapper modelMapper(){
		return new ModelMapper();
	}
	@Bean
	public MapperHelper mapperHelper(){
		return new MapperHelper();
	}

	public static void main(String[] args) {
		SpringApplication.run(MercadolibreApplication.class, args);
	}

}

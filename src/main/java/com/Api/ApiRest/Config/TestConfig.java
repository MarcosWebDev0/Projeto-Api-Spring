package com.Api.ApiRest.Config;

import java.time.LocalDate;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.Api.ApiRest.Repositories.UserRepository;
import com.Api.ApiRest.Repositories.VeiculoRepository;
import com.Api.ApiRest.entities.Pessoa;
import com.Api.ApiRest.entities.Veiculo;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private VeiculoRepository veiculoRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Pessoa p1 = new Pessoa(null, "Marcos", "25525525522", LocalDate.of(1998, 6, 7), "123456789");
		Pessoa p2 = new Pessoa(null, "Maria", "25525525578", LocalDate.of(1991, 10, 25), "987654321");
		Pessoa p3 = new Pessoa(null, "Gabriela", "25525525595", LocalDate.of(2000, 1, 15), "147258369");
		
		Veiculo v1 = new Veiculo(null, "Voyage", "Sedan", "ABC123", 2010, 2011, p3);
		Veiculo v2 = new Veiculo(null, "Onix", "Sedan", "ZYQ987", 2016, 2016, p1);
		Veiculo v3 = new Veiculo(null, "Gol", "G5", "ASD456", 2011, 2012, p1);
		
		userRepository.saveAll(Arrays.asList(p1, p2, p3));
		veiculoRepository.saveAll(Arrays.asList(v1,v2,v3));
	}
}

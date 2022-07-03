package com.Api.ApiRest.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Api.ApiRest.Repositories.VeiculoRepository;
import com.Api.ApiRest.entities.Veiculo;

@Service
public class VeiculoService {
	
	@Autowired
	private VeiculoRepository repository;
	
	public List<Veiculo> findAll() {
		return repository.findAll();
	}
	
	public Veiculo findById(Long id) {
		Optional<Veiculo> obj = repository.findById(id);
		return obj.get();
	}
}

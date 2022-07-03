package com.Api.ApiRest.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Api.ApiRest.Repositories.VagaRepository;
import com.Api.ApiRest.entities.Vaga;

@Service
public class VagaService {
	
	@Autowired
	private VagaRepository repository;
	
	public List<Vaga> findAll() {
		return repository.findAll();
	}
	
	public Vaga findById(Long id) {
		Optional<Vaga> obj = repository.findById(id);
		return obj.get();
	}
}

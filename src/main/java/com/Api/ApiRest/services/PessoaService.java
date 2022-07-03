package com.Api.ApiRest.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Api.ApiRest.Repositories.PessoaRepository;
import com.Api.ApiRest.entities.Pessoa;

@Service
public class PessoaService {
	
	@Autowired
	private PessoaRepository repository;
	
	public List<Pessoa> findAll() {
		return repository.findAll();
	}
	
	public Pessoa findById(Long id) {
		Optional<Pessoa> obj = repository.findById(id);
		return obj.get();
	}
	
	public Pessoa insert(Pessoa obj) {
		return repository.save(obj);
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
	
	
	public Pessoa update(Long id, Pessoa obj) {
		Pessoa entity = repository.getReferenceById(id);
		updateData(entity,obj);
		return repository.save(entity);
	}

	private void updateData(Pessoa entity, Pessoa obj) {
		entity.setNome(obj.getNome());
		entity.setCpf(obj.getCpf());
		entity.setNascimento(obj.getNascimento());
		entity.setTelefone(obj.getTelefone());
		
	}
}

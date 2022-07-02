package com.Api.ApiRest.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Api.ApiRest.Repositories.UserRepository;
import com.Api.ApiRest.entities.Pessoa;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<Pessoa> findAll() {
		return repository.findAll();
	}
	
	public Pessoa findById(Long id) {
		Optional<Pessoa> obj = repository.findById(id);
		return obj.get();
	}
}

package com.Api.ApiRest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Api.ApiRest.entities.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{


}

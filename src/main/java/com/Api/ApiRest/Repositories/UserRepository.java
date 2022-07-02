package com.Api.ApiRest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Api.ApiRest.entities.Pessoa;

public interface UserRepository extends JpaRepository<Pessoa, Long>{


}

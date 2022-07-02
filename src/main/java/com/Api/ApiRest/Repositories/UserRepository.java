package com.Api.ApiRest.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Api.ApiRest.entities.Pessoa;

public interface UserRepository extends JpaRepository<Pessoa, Long>{


}

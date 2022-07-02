package com.Api.ApiRest.Resources;

import java.time.LocalDate;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Api.ApiRest.entities.Pessoa;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<Pessoa> findAll() {
		Pessoa u = new Pessoa(1L, "Maria", "03680853092", LocalDate.now(), "992984130");
		return ResponseEntity.ok().body(u);
	}
}

package com.empoderatech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empoderatech.entity.Usuaria;
import com.empoderatech.service.UsuariaService;

@RestController
@RequestMapping("/api")
public class UsuariaController {
	
	@Autowired
	private UsuariaService service;
	
	@PostMapping("/register")
	public ResponseEntity<Usuaria> register(@RequestBody Usuaria usuaria) {
		Usuaria savedUsuaria = service.register(usuaria);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedUsuaria);
	}
	
	
}

package com.empoderatech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empoderatech.entity.Usuaria;
import com.empoderatech.repositories.UsuariaRepository;

@Service
public class UsuariaService {
	
	@Autowired
	private UsuariaRepository repository;
	
	@Autowired
	private EmailService service;
	
	public UsuariaService(UsuariaRepository repository, EmailService service) {
		super();
		this.repository = repository;
		this.service = service;
	}

	public Usuaria register(Usuaria usuaria) {
		Usuaria savedUsuaria = repository.save(usuaria);
		service.sendSimpleMessage(usuaria.getEmail());
		return savedUsuaria;
	}
	
}

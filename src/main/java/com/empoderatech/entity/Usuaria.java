package com.empoderatech.entity;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Usuaria implements Serializable {
	

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue (strategy = GenerationType.UUID)
	private String id;
	
	private String nome;
	
	private String sobrenome;
	
	private Integer idade;
	
	private Integer celular;
	
	private String cpf;
	
	private LocalDate nascimento;
	
	private String escolaridade;
	
	private String cidade;
	
	private String email;
	
	public Usuaria() {
		
	}

	public Usuaria(String id, String nome, String sobrenome, Integer idade, Integer celular, String cpf,
			LocalDate nascimento, String escolaridade, String cidade, String email) {
		super();
		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.idade = idade;
		this.celular = celular;
		this.cpf = cpf;
		this.nascimento = nascimento;
		this.escolaridade = escolaridade;
		this.cidade = cidade;
		this.email = email;
	}
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Integer getCelular() {
		return celular;
	}

	public void setCelular(Integer celular) {
		this.celular = celular;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public LocalDate getNascimento() {
		return nascimento;
	}

	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}

	public String getEscolaridade() {
		return escolaridade;
	}

	public void setEscolaridade(String escolaridade) {
		this.escolaridade = escolaridade;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	
}

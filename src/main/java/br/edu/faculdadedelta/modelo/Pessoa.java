package br.edu.faculdadedelta.modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


@Entity //Especifica que essa classe é uma entidade
public class Pessoa implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id //Define qual atributo será a chave primaria da tabela
	@GeneratedValue(strategy = GenerationType.AUTO) //Serve para gerar automaticamente um valor para a chave primaria. 
	private Long id;
	
	
	@NotNull(message = "O Campo nome é obrigatorio!")// O tipo não pode ser nulo
	@NotEmpty(message = "O Campo nome está vazio!")// O tipo não pode ser vasio
	private String nome;
	
	
	
	@NotNull(message = "O Campo sobrenome é obrigatorio")
	@NotEmpty(message = "O Campo sobrenome está vazio!")
	private String sobrenome;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
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
	
	
	
}

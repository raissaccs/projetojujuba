package com.jujuba.jujubab.model;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;


@Entity 

public class materiaPrima {
	
	@NotBlank
	private String nome;
	
	@NotBlank 
	private Double valor;
	
	@NotBlank
	private Double quantidade;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public Double getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Double quantidade) {
		this.quantidade = quantidade;
	}


}

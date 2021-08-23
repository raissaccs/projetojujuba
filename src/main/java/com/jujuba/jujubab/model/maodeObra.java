package com.jujuba.jujubab.model;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;

@Entity
public class maodeObra {
	
	@NotBlank
	private Double valor;

	@NotBlank
	private Double horas;

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Double getHoras() {
		return horas;
	}

	public void setHoras(Double horas) {
		this.horas = horas;
	}

}

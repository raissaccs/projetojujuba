package com.jujuba.jujubab.model;

import javax.persistence.Entity;

@Entity
public class maodeobra {

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

private Double valor;
  
  private Double horas;
	
}

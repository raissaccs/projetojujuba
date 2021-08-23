package com.jujuba.jujubab.model;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;

@Entity
public class lucro {
	
	@NotBlank
	private Integer lucro;

	public Integer getLucro() {
		return lucro;
	}

	public void setLucro(Integer lucro) {
		this.lucro = lucro;
	}

}

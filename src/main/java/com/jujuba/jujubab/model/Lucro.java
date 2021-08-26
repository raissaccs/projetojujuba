package com.jujuba.jujubab.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;



@Entity
@Table(name="TB_LUCRO")
public class Lucro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@NotBlank
	private Integer lucro;

	public Integer getLucro() {
		return lucro;
	}

	public void setLucro(Integer lucro) {
		this.lucro = lucro;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}

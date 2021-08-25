package com.jujuba.jujubab.service;

import java.util.List;

import com.jujuba.jujubab.model.Lucro;

public interface LucroService {
	
	List<Lucro> findAll();
	Lucro findById(long id);
	Lucro save(Lucro lucro);
	
}

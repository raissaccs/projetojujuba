package com.jujuba.jujubab.service;

import java.util.List;

import com.jujuba.jujubab.model.MateriaPrima;

public interface MateriaPrimaService {
	
	List<MateriaPrima> findAll();
	MateriaPrima findById(long id);
	MateriaPrima save(MateriaPrima materiaPrima); 

}

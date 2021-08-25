package com.jujuba.jujubab.service;

import java.util.List;

import com.jujuba.jujubab.model.MaodeObra;

public interface MaodeobraService {
	
	List<MaodeObra> findAll();
	MaodeObra findById(long id);
	MaodeObra save(MaodeObra maodeObra);
}

package com.jujuba.jujubab.service.serviceimpl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jujuba.jujubab.model.MaodeObra;
import com.jujuba.jujubab.repository.MaodeObraRepository;
import com.jujuba.jujubab.service.MaodeobraService;

@Service
public class MaodeObraServiceImpl implements MaodeobraService {

	@Autowired
	MaodeObraRepository maoDeObraRepository;
	
	@Override
	public List<MaodeObra> findAll() {
		// TODO Auto-generated method stub
		return maoDeObraRepository.findAll();
		
	}

	@Override
	public MaodeObra findById(long id) {
		// TODO Auto-generated method stub
		return maoDeObraRepository.findById(id).get();
	}

	@Override
	public MaodeObra save(MaodeObra maodeObra) {
		// TODO Auto-generated method stub
		return maoDeObraRepository.save(maodeObra);
	}

}

package com.jujuba.jujubab.service.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jujuba.jujubab.model.Lucro;
import com.jujuba.jujubab.repository.LucroRepository;
import com.jujuba.jujubab.service.LucroService;

@Service
public class LucroServiceImpl implements LucroService{
	
	@Autowired
	LucroRepository lucroRepository;

	@Override
	public List<Lucro> findAll() {
		// TODO Auto-generated method stub
		return lucroRepository.findAll();
	}

	@Override
	public Lucro findById(long id) {
		// TODO Auto-generated method stub
		return lucroRepository.findById(id).get();
	}

	@Override
	public Lucro save(Lucro lucro) {
		// TODO Auto-generated method stub
		return lucroRepository.save(lucro);
	}
	
	

}

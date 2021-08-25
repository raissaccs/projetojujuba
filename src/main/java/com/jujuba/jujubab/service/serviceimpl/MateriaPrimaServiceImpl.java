package com.jujuba.jujubab.service.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jujuba.jujubab.model.MateriaPrima;
import com.jujuba.jujubab.repository.MateriaPrimaRepository;
import com.jujuba.jujubab.service.MateriaPrimaService;

@Service
public class MateriaPrimaServiceImpl implements MateriaPrimaService {

	@Autowired
	MateriaPrimaRepository materiaPrimaRepository;  
	
	@Override
	public List<MateriaPrima> findAll() {
		// TODO Auto-generated method stub
		return materiaPrimaRepository.findAll();
	}

	@Override
	public MateriaPrima findById(long id) {
		// TODO Auto-generated method stub
		return materiaPrimaRepository.findById(id).get();
	}

	@Override
	public MateriaPrima save(MateriaPrima materiaPrima) {
		// TODO Auto-generated method stub
		return materiaPrimaRepository.save(materiaPrima);
	}

}

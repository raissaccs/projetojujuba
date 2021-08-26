package com.jujuba.jujubab.utils;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

//import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jujuba.jujubab.repository.MaodeObraRepository;

import com.jujuba.jujubab.model.MaodeObra;

@Component
public class DummyData {

	@Autowired 
	MaodeObraRepository maodeObraRepository;
	
	//@PostConstruct
	public void saveMaodeObra() {
		List<MaodeObra> lista = new ArrayList<>();
		MaodeObra maodeObra1 = new MaodeObra();
		maodeObra1.setValor(10.00);
		maodeObra1.setHoras(Time.valueOf("1:20"));
		
		lista.add(maodeObra1);
		
		for(MaodeObra maodeObra: lista) {
			MaodeObra maodeObraSaved = maodeObraRepository.save(maodeObra);
			System.out.println(maodeObraSaved.getId());
		}
	}
}

package com.jujuba.jujubab.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.jujuba.jujubab.model.MaodeObra;

@Repository
public interface MaodeObraRepository extends JpaRepository<MaodeObra, Long>{

	
}

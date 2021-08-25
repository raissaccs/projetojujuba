package com.jujuba.jujubab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jujuba.jujubab.model.Lucro;

@Repository
public interface LucroRepository extends JpaRepository<Lucro, Long> {

}

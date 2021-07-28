package com.vic.teste.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vic.teste.domain.Categoria;

@Repository

public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{

}

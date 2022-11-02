package com.bononi.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bononi.principal.Cadastro;

@Repository
public interface CadastroRepository extends JpaRepository<Cadastro, Integer> {

	@Query(value= "SELECT*FROM cadastro", nativeQuery = true)
	List<Cadastro> findAllCadastro();
	@Query(value = "SELECT*FROM cadastro where id = ?", nativeQuery = true)
	Cadastro findAllCadastro(Integer idcadastro);
}
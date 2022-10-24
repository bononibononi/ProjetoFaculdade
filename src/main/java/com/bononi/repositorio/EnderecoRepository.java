package com.bononi.repositorio;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bononi.principal.Endereco;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {

	@Query(value = "SELECT*FROM endereco", nativeQuery = true)
	List<Endereco> findAllenderecos();
	@Query(value = "SELECT*FROM endereco where id = ?", nativeQuery = true)
	Endereco findAllById(Integer idendereco);
	
	
	
}
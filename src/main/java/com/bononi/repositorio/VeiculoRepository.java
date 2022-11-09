package com.bononi.repositorio;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bononi.principal.Veiculo;


@Repository
public interface VeiculoRepository extends JpaRepository<Veiculo, Integer> {

	@Query(value = "SELECT*FROM veiculo", nativeQuery = true)
	List<Veiculo> findAllVeiculos();
	
	@Query(value = "SELECT*FROM veiculo where id =?", nativeQuery = true)
	Optional<Veiculo> findById(Integer idveiculo);

	Optional<Veiculo> save(Optional<Veiculo> veiculo);
	

	
}
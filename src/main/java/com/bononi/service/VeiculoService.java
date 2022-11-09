package com.bononi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bononi.principal.Veiculo;
import com.bononi.repositorio.VeiculoRepository;

@Service
public class VeiculoService {

	@Autowired
	private VeiculoRepository repositorio;
	
	public List<Veiculo> findAll(){
		List<Veiculo> list = repositorio.findAllVeiculos();
		return list;
	}
	
	public Optional<Veiculo> findById(Integer idveiculo) {
		Optional<Veiculo> veiculo = repositorio.findById(idveiculo);
				return veiculo;
	}
	
	public Optional<Veiculo> addveiculo(Optional<Veiculo> vei){
		return repositorio.save(vei);
	}
	
	public void deleteVeiculo(Integer idveiculo) {
		repositorio.deleteById(idveiculo);
	}
	
	public Optional<Veiculo> updateVeiculo (Veiculo veic) {
		Optional<Veiculo> vei = findById(veic.getId());
		veic.setAcessorios(veic.getAcessorios());
		return repositorio.save(vei);
	}
}
package com.bononi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bononi.principal.Cadastro;
import com.bononi.repositorio.CadastroRepository;

@Service
public class CadastroService {
	
	@Autowired
	private CadastroRepository repositorio;
	
	public List<Cadastro> findAll(){
		return repositorio.findAll();
	}
	
	public Cadastro findById(Integer idcadastro) {
		Cadastro cad = repositorio.findAllCadastro(idcadastro);
		return cad;
	}

	public Cadastro addcadastro(Cadastro cad){
		return repositorio.save(cad);
	}
	
	public void deletecadastro(Integer idcadastro) {
		repositorio.deleteById(idcadastro);	 					
	}
	
	public Cadastro updatecadastro(Cadastro cadastro) {
		Cadastro cadas = findById(cadastro.getId()); 
		cadas.setNome(cadastro.getNome());
		cadas.setEndereco(cadastro.getEndereco());
		cadas.setAtivo(cadastro.getAtivo());
		return repositorio.save(cadas);
	}	
}
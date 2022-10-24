package com.bononi.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bononi.principal.Endereco;
import com.bononi.repositorio.EnderecoRepository;

@Service
public class EnderecoService {

	@Autowired
	private EnderecoRepository repositorio;
	
	public List<Endereco> findAll(){
		return repositorio.findAll();
	}
	
	public Endereco findById(Integer idendereco) {
		Endereco endereco = repositorio.findAllById(idendereco);
		return endereco;
	}
	
	public Endereco addendereco(Endereco idendereco){
		return repositorio.save(idendereco);
	}
	
	public void deleteendereco(Integer idendereco) {
		System.out.println(idendereco);
	    System.out.println("deleteendendereco");
		repositorio.deleteById(idendereco);
		 						// verificar possível erro
	}
	
	public Endereco updateendereco(Endereco endereco) {
		Endereco endere = findById(endereco.getId()); 
		endereco.setId(endereco.getId());
		endereco.setLogradouro(endereco.getLogradouro());
		endereco.setNumero(endereco.getNumero());
		endereco.setComplemento(endereco.getComplemento());
		endereco.setBairro(endereco.getBairro());
		endereco.setCep(endereco.getCep());
		endereco.setBairro(endereco.getBairro());
		endereco.setCidade(endereco.getCidade());
		endereco.setEstado(endereco.getEstado());
		return repositorio.save(endere);
	}
}
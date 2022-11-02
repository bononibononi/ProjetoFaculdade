package com.bononi.resource;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bononi.principal.Cadastro;
import com.bononi.principal.DTO.CadastroDTO;
import com.bononi.service.CadastroService;

@RestController
@RequestMapping(value = "/cadastro")
public class CadastroResource {
	
	@Autowired
	private CadastroService servico;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<CadastroDTO>> findAll(){
		List<Cadastro> list = servico.findAll();
		List<CadastroDTO> listcadDTO = list.stream().map(u -> new CadastroDTO(u)).collect(Collectors.toList());
				return ResponseEntity.ok().body(listcadDTO);
	}
	
	@RequestMapping(value = "/{idcadastro}", method = RequestMethod.GET)
	public ResponseEntity<?> findById(@PathVariable Integer idcadastro){
		Cadastro cadastro = servico.findById(idcadastro);
				return ResponseEntity.ok().body(cadastro);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<?> addcadastro(@RequestBody Cadastro cadas){
		System.out.println(cadas);
		Cadastro cadastro = servico.addcadastro(cadas);
		return ResponseEntity.ok().body(cadastro);
	}
	
	@RequestMapping(value = "/{idcadastro}", method = RequestMethod.DELETE)
	public void deletecadastro(@PathVariable Integer idcadastro) {
		servico.deletecadastro(idcadastro);
	}
	
	@RequestMapping(value = "/{idcadastro}", method = RequestMethod.PUT)
	public ResponseEntity<?> updatecadastro(
								@PathVariable Integer idcadastro, 
								@RequestBody Cadastro cad){
		cad.setId(idcadastro);
		Cadastro cadastro = servico.updatecadastro(cad);
		return ResponseEntity.ok().body(cadastro);
	}
}
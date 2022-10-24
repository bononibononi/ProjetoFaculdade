package com.bononi.resource;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bononi.principal.Endereco;
import com.bononi.service.EnderecoService;

@RestController
@RequestMapping(value = "/endereco")
public class EnderecoResource {

	@Autowired
	private EnderecoService servico;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<?> findAll(){
		List<Endereco> list = servico.findAll();
				return ResponseEntity.ok().body(list);
	}
	
	@RequestMapping(value = "/{idendereco}", method = RequestMethod.GET)
	public ResponseEntity<?> findById(@PathVariable Integer idendereco){
		Endereco endereco = servico.findById(idendereco);
				return ResponseEntity.ok().body(endereco);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<?> addendereco(@RequestBody Endereco endere){
		Endereco endereco = servico.addendereco(endere);		// possível erro
		return ResponseEntity.ok().body(endereco);
	}
	
	@RequestMapping(value = "/{idendereco}", method = RequestMethod.DELETE)
	public void deleteEndereco(@PathVariable Integer idendereco) {
		servico.deleteendereco(idendereco);
	}
	
	@RequestMapping(value = "/{idendereco}", method = RequestMethod.PUT)
	public ResponseEntity<?> updateendereco(
								@PathVariable Integer idendereco, 
								@RequestBody Endereco endere){
		endere.setId(idendereco);
		Endereco endereco = servico.updateendereco(endere);
		return ResponseEntity.ok().body(endereco);
	}
}
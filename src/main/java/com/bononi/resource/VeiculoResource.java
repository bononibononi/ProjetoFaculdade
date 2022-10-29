package com.bononi.resource;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bononi.aluguel.Veiculo;
import com.bononi.principal.DTO.VeiculoDTO;
import com.bononi.service.VeiculoService;

@RestController
@RequestMapping(value = "/veiculo")
public class VeiculoResource {

	@Autowired
	private VeiculoService servico;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<VeiculoDTO>> findAll(){
		List<Veiculo> list = servico.findAll();
		List<VeiculoDTO> listveicDTO = list.stream().map(veic -> new VeiculoDTO(veic)).collect(Collectors.toList());
				return ResponseEntity.ok().body(listveicDTO);			
	}
	
	@RequestMapping(value = "/{idveiculo}", method = RequestMethod.GET)
	public ResponseEntity<?> findById(@PathVariable Integer idveiculo){
		Optional<Veiculo> veiculo = servico.findById(idveiculo);
				return ResponseEntity.ok().body(veiculo);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<?> addVeiculo(@RequestBody Optional<Veiculo> vei){
		Optional<Veiculo> veiculo = servico.addveiculo(vei);
				return ResponseEntity.ok().body(veiculo);
	}
	
	@RequestMapping(value = "/{idveiculo}", method = RequestMethod.DELETE)
	public void deleteVeiculo(@PathVariable Integer idveiculo) {
				servico.deleteVeiculo(idveiculo);
	}
	
	@RequestMapping(value = "/{idveiculo}", method = RequestMethod.PUT)
	public ResponseEntity<?> updateVeiculo(
										@PathVariable Integer idveiculo,
										@RequestBody Veiculo vei){
		vei.setId(idveiculo);
		Optional<Veiculo> veicu = servico.updateVeiculo(vei);
		return ResponseEntity.ok().body(veicu);
	}
}
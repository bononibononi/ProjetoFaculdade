package com.bononi.resource;

import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bononi.principal.Usuario;
import com.bononi.principal.DTO.UsuarioDTO;
import com.bononi.principal.DTO.UsuarioNewDTO;
import com.bononi.service.UsuarioService;

@RestController
@RequestMapping(value = "/usuario")
public class UsuarioResource {

	@Autowired
	private UsuarioService servico;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<UsuarioDTO>> findAll(){
		List<Usuario> list = servico.findAll();
		List<UsuarioDTO> listusuDTO = list.stream().map(u -> new UsuarioDTO(u)).collect(Collectors.toList());
				return ResponseEntity.ok().body(listusuDTO);
	}
	
	@RequestMapping(value = "/{idusuario}", method = RequestMethod.GET)
	public ResponseEntity<?> findById(@PathVariable Integer idusuario){
		Usuario usuario = servico.findById(idusuario);
				return ResponseEntity.ok().body(usuario);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<?> addusuario(@Valid @RequestBody UsuarioNewDTO usu1){
		Usuario usua = new Usuario(usu1);
		Usuario usuario = servico.addusuario(usua);
		return ResponseEntity.ok().body(usuario);
	}
			
	@RequestMapping(value = "/{idusuario}", method = RequestMethod.DELETE)
	public void deleteusuario(@PathVariable Integer idusuario) {
		servico.deleteusuario(idusuario);
	}
	
	@RequestMapping(value = "/{idusuario}", method = RequestMethod.PUT)
	public ResponseEntity<?> updateusuario(
								@PathVariable Integer idusuario, @Valid
								@RequestBody UsuarioDTO usu1){
		usu1.setId(idusuario);
		Usuario usua = new Usuario(usu1);
		Usuario usuario = servico.updateusuario(usua);
		return ResponseEntity.ok().body(usuario);
	}
}
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

import com.bononi.principal.Usuario;
import com.bononi.principal.DTO.UsuarioDTO;
import com.bononi.service.UsuarioService;

@RestController
@RequestMapping(value = "/usuario")
public class UsuarioResource {

	@Autowired
	private UsuarioService servico;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<UsuarioDTO>> findAll(){
		List<Usuario> list = servico.findAll();
		List<UsuarioDTO> listDTO = list.stream().map(u -> new UsuarioDTO(u)).collect(Collectors.toList());
				return ResponseEntity.ok().body(listDTO);
	}
	
	@RequestMapping(value = "/{idusuario}", method = RequestMethod.GET)
	public ResponseEntity<?> findById(@PathVariable Integer idusuario){
		Usuario usuario = servico.findById(idusuario);
				return ResponseEntity.ok().body(usuario);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<?> addusuario(@RequestBody Usuario usu){
		System.out.println(usu);
		Usuario usuario = servico.addusuario(usu);
		return ResponseEntity.ok().body(usuario);
	}
	
	@RequestMapping(value = "/{idusuario}", method = RequestMethod.DELETE)
	public void deleteusuario(@PathVariable Integer idusuario) {
		servico.deleteusuario(idusuario);
	}
	
	@RequestMapping(value = "/{idusuario}", method = RequestMethod.PUT)
	public ResponseEntity<?> updateusuario(
								@PathVariable Integer idusuario, 
								@RequestBody Usuario usu){
		usu.setId(idusuario);
		Usuario usuario = servico.updateusuario(usu);
		return ResponseEntity.ok().body(usuario);
	}
}
package com.bononi.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bononi.principal.Usuario;
import com.bononi.repositorio.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository repositorio;
	
	public List<Usuario> findAll(){
		return repositorio.findAll();
	}
	
	public Usuario findById(Integer idusuario) {
		Usuario usuario = repositorio.findAllUsuario(idusuario);
		return usuario;
	}
	
	public Usuario addusuario(Usuario usu){
		return repositorio.save(usu);
	}
	
	public void deleteusuario(Integer idusuario) {
		repositorio.deleteById(idusuario);
		 					// verificar possível erro
	}
	
	public Usuario updateusuario(Usuario usuario) {
		Usuario usu = findById(usuario.getId()); 
		usu.setNome(usuario.getNome());
		usu.setEmail(usuario.getEmail());
		usu.setSenha(usuario.getSenha());
		return repositorio.save(usu);
	}	
}
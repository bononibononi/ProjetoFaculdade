package com.bononi.repositorio;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bononi.principal.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

	@Query(value = "SELECT*FROM usuario", nativeQuery = true)
	List<Usuario> findAllUsuarios();
	@Query(value = "SELECT*FROM usuario where id = ?", nativeQuery = true)
	Usuario findAllUsuario(Integer idusuario);
	Usuario findByEmail(String email);
	
	
	
}
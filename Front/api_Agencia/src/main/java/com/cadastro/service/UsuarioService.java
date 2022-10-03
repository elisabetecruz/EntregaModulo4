package com.cadastro.service;

import com.cadastro.model.entity.Usuario;

import antlr.collections.List;


public interface UsuarioService {

	Usuario saveUsuario(Usuario Usuario);
	java.util.List<Usuario> getAllusuario();
	Usuario getUsuarioById(long id);
	Usuario updateUsuario(Usuario usuario, long id);
	void deleteUsuario(long id);
}

package com.cadastro.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cadastro.model.entity.Usuario;
import com.cadastro.repositories.UsuarioReporitory;

@Service
public abstract  class UsuarioServiceImpl implements com.cadastro.service.UsuarioService {

	@Autowired
	private UsuarioReporitory Usuariorepository;
	@Override
	public Usuario saveUsuario(Usuario Usuario) {
		return Usuariorepository.save(Usuario);
	}

	@Override
	public List<Usuario> getAllusuario() {
		return Usuariorepository.findAll();
	}

	@Override
	public Usuario getUsuarioById(long id) {
		return Usuariorepository.findById(id).orElseThrow();
		
	}

	@Override
	public  Usuario  updateUsuario ( Usuario   Usuario , long id) { 
		
		 Usuario  UsuarioExistente =  Usuariorepository.findById(id).orElseThrow();
		
		 UsuarioExistente.setNome( Usuario.getNome());
		 UsuarioExistente.setNome( Usuario.getNome());
		
		
		 Usuariorepository.save( UsuarioExistente);
		return  UsuarioExistente;
	}
	@Override
	public void deleteUsuario(long id) {
		Usuariorepository.findById(id).orElseThrow();

         Usuariorepository.deleteById(id);
}
		
	}

	
	 

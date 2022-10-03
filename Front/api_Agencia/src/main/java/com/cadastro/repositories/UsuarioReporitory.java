package com.cadastro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cadastro.model.entity.Usuario;

@Repository
public interface UsuarioReporitory extends JpaRepository<Usuario, Long> {

	

}

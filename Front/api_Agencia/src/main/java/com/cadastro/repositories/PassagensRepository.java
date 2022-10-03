package com.cadastro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cadastro.model.entity.Passagens;

public interface PassagensRepository extends JpaRepository<Passagens, Long> {

}

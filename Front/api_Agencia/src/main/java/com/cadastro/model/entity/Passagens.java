package com.cadastro.model.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

import com.cadastro.model.enums.StatusPassagens;

@Entity
@Table (name = "Passagens")
public class Passagens {
  
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column
	private BigDecimal preco;
	
	@JoinColumn (name = "id_usuario")
	@ManyToOne
	private Usuario  usuario;
	
	@Column
	private  String telefonepassageiro;
	
	@Column (name =" stats")
	@Enumerated (value = EnumType.STRING)
	private StatusPassagens  tipo;
	
	@Column(name = "data_passagens")
	@Convert(converter = Jsr310JpaConverters.LocalDateConverter.class)
	private LocalDate Datapassagem;
	
}

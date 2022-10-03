package Modelo;

import java.math.BigDecimal;

public class Passagens {

	private int id_passagens;
	private BigDecimal preco;
	private boolean quantidade;
	private String destinos;
	
	public Passagens() {
		
	}

	public Passagens(int id_passagens, BigDecimal preco, boolean quantidade, String destinos) {
		super();
		this.id_passagens = id_passagens;
		this.preco = preco;
		this.quantidade = quantidade;
		this.destinos = destinos;
	}

	public int getId_passagens() {
		return id_passagens;
	}

	public void setId_passagens(int id_passagens) {
		this.id_passagens = id_passagens;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public boolean getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(boolean quantidade) {
		this.quantidade = quantidade;
	}

	public String getDestinos() {
		return destinos;
	}

	public void setDestinos(String destinos) {
		this.destinos = destinos;
	}

	
}

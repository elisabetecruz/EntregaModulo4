package Modelo;

import java.util.List;

public class Hotel{
	
	private int id_hotel;
	private String cnpj;
	private String endereco;
	private String telefone;
	
	public Hotel(){
		
	}

	public Hotel(int id_hotel, String cnpj, String endereco, String telefone) {
		super();
		this.id_hotel = id_hotel;
		this.cnpj = cnpj;
		this.endereco = endereco;
		this.telefone = telefone;
	}

	public int getId_hotel() {
		return id_hotel;
	}

	public void setId_hotel(int id_hotel) {
		this.id_hotel = id_hotel;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public void add(List<Hotel> hotel) {
		return ;
		
	}
	
}


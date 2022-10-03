package Modelo;

import java.util.List;

import Dao.clienteDao;
import crud.ClienteCrud;

public class Cliente {

	
	private int id_cliente;
	private String nome_cliente;
	private String telefone_cliente;
	private String endereco_cliente;
	private String cpf_cliente;
	
	public Cliente() {
		
	}

	public Cliente(int id_cliente, String nome_cliente, String telefone_cliente, String endereco_cliente,
			String cpf_cliente) {
		super();
		this.id_cliente = id_cliente;
		this.nome_cliente = nome_cliente;
		this.telefone_cliente = telefone_cliente;
		this.endereco_cliente = endereco_cliente;
		this.cpf_cliente = cpf_cliente;
	}

	public Cliente(int id, String nome) {
		// TODO Auto-generated constructor stub
	}

	public Cliente(String nome, String telefone, String endereco, String cpf) {
		
	}

	public int getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}

	public String getNome_cliente() {
		return nome_cliente;
	}

	public void setNome_cliente(String nome_cliente) {
		this.nome_cliente = nome_cliente;
	}

	public String getTelefone_cliente() {
		return telefone_cliente;
	}

	public void setTelefone_cliente1(String string) {
		this.telefone_cliente = string;
	}

	public String getEndereco_cliente() {
		return endereco_cliente;
	}

	public void setEndereco_cliente(String endereco_cliente) {
		this.endereco_cliente = endereco_cliente;
	}

	public String getCpf_cliente() {
		return cpf_cliente;
	}

	public void setCpf_cliente(String cpf_cliente) {
		this.cpf_cliente = cpf_cliente;
	}

	public void addAll(List<Cliente> asList) {
		
		
	}

	public Cliente get(int i) {
		
		return null;
	}

	public int size() {
		
		return 0;
	}

	public void add(Cliente cliente1) {
		
		
	}

	public void deleteByid(int posicao) {
		
		
	}

	public ClienteCrud[] getNome_cliente1() {
		
		return null;
	}

	public void setTelefone_cliente(String string) {
		
		
	}

	public static void setId(int int1) {
		
		
	}

	public static void setNome(String string) {
		
		
	}

	public static void setTelefone(String string) {
		
		
	}

	public static void setEndereco(String string) {
	
		
	}

	public static void setCpf(String string) {
		
		
	}

	public static void update(clienteDao clienteDao) {
		
		
	}
	
}

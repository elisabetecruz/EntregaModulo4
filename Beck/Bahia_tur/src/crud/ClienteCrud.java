package crud;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Dao.clienteDao;
import Modelo.Cliente;




public class ClienteCrud {
  
	 private static final String get = null;

	public static void main(String[] args) {
		 
		   Dao.clienteDao clienteDao = clienteDao();
		   Scanner s = new Scanner(System.in);
		   
		   int opcao = 0;
		   int posicao = 0;
		   
		   int id =0;
		   String nome = "";
		   String nome1 = "";
		   String telefone = "";
		   String endereco = "";
		   String cpf = "";
		   
		   
		   
		   
		   
		   // MENU
		   
		   do {
			   System.out.print("---CRUD  CLIENTE---");
			   System.out.print("-1- Cadastro de cliente-");
			   System.out.print("-2-Consulta de cliente-");
			   System.out.print("-3-Atualizar de cliente-");
			   System.out.print("-4-Deletar  cliente-"); 
			   System.out.print("-5-Buscar por id -"); 
			   System.out.print("-0-Sair-");
			   opcao = s.nextInt();
			   s.nextLine();
			   
			   
			   switch (opcao) {
			   case 1:
				   // CREATE
				   System.out.println("Digite o nome do cliente");
				   nome = s.nextLine();
				   System.out.println( "Digite o telefone");
				   nome = s.nextLine();
				   System.out.println( "Digite endereco:");
				   nome = s.nextLine();
				   System.out.println( "Digite o cpf:");
				   nome = s.nextLine();
				   System.out.println( "Digite o id do cliente:");
                   id = s.nextInt();
                   s.nextLine();
                   
				  
				   
				  
				   System.out.println(" Cadastrado /n");
				   break;
			   case 2:
				   // READ
				   for (Cliente a : clienteDao.getCliente()) {
					   System.out.println("Id: " + a.getId_cliente());
					}
				   System.out.println(" * Consulta finalizada *");
				   break;
				   
			   case 3:
				 //Update
				   System.out.println("Digite o Id do cliente: ");
				    posicao = s.nextInt();
				   System.out.println("Digite o nome ");
				   nome1 = s.nextLine();
				   System.out.println("Digite o telefone ");
				   telefone = s.nextLine();
				   System.out.println("Digite o endereco ");
				   endereco = s.nextLine();
				   System.out.println("Digite o cpf ");
				   cpf = s.nextLine();
				   System.out.println("Digite o id do cliente");
				   id = s.nextInt();
				   s.nextLine();
				   
				   clienteDao = new Dao.clienteDao();
				   Cliente.update(clienteDao);
				   System.out.println("Atualizado");
				   break;
			   case 4:
				 //DELITE
				   System.out.println(" Digite o id do cliente:");
				   posicao = s.nextInt();
				   clienteDao.deliteById(posicao);
				   System.out.println("* Cliente excluido*");
				   break;
			   case 5:
				   // Buscar por ID
				   System.out.println("Digite o id do cliente");
				  posicao = s.nextInt();
				  clienteDao = clienteDao.ClienteById(posicao);
				   
				  
				System.out.println("Id:" + getId() + "Nome:" +   getNome() );
				  break;
				   default:
					   System.out.println(opcao != 0 ? "/n opcao é invalida, tente novamente/n": "");
					   break;
			   }
			   }while(opcao != 0);
			   s.close();
			   System.out.println(" Finalizado");
}


		        
				   

	private static void ClienteById(int posicao) {
		// TODO Auto-generated method stub
		
	}





	private static String getNome() {
		
		return null;
	}





	





	private static String getId() {
		// TODO Auto-generated method stub
		return null;
	}





	private static clienteDao clienteDao() {
		// TODO Auto-generated method stub
		return null;
	}





	private void setCpf_cliente(Object cpf) {
		// TODO Auto-generated method stub
		
	}

	private void setEndereco_cliente(Object endereco) {
		// TODO Auto-generated method stub
		
	}

	private void setTelefone_cliente(Object telefone) {
		// TODO Auto-generated method stub
		
	}

	private void deleteByid(int posicao) {
		// TODO Auto-generated method stub
		
	}

	private String getId_cliente() {
		// TODO Auto-generated method stub
		return null;
	}

	private ClienteCrud[] getcliente() {
		// TODO Auto-generated method stub
		return null;
	}

	private void setNome_cliente(String nome) {
		// TODO Auto-generated method stub
		
	}


		
	}

 



	
  
	
	


	



package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Connection.connectionMysql;
import Modelo.Cliente;

public class clienteDao {
	

	static Connection conn = null;
	static PreparedStatement pstm = null;
	
	public static void save(Cliente cliente) {
	String sql = "INSERT INTO " + "Cliente (nome_cliente, telefone_cliente, endereco_cliente, cpf)" + "VALUES(?),(?), (?),(?)";
		
		
		try {
			conn = connectionMysql.CreateconnectionMysql();
			pstm = conn.prepareStatement(sql);
			pstm.setString(1 , getNome());
			//pstm.setString(2, getCliente());
			pstm.setString(3, getEndereco_cliente());
			pstm.setString(4, getCpf_cliente());
			pstm.execute();
		} catch (Exception e) { 
			e.printStackTrace();
		}finally {
			try {
				if(pstm != null ) {
					pstm.close();
					}
				if(conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
		private static String getCpf_cliente() {
		// TODO Auto-generated method stub
		return null;
	}
		private static String getEndereco_cliente() {
		// TODO Auto-generated method stub
		return null;
	}
		private static String getNome() {
		// TODO Auto-generated method stub
		return null;
	}
		//READ
		public static List<Cliente> getCliente(){
			String sql = "SELECT * FROM cliente";
			
			List<Cliente> cliente = new ArrayList<Cliente>();
			//Connection conn = null;
			//PreparedStatement pstm = null;
			
			ResultSet rset = null;
			
			
			try {
				conn = connectionMysql.CreateconnectionMysql();
				
				pstm = conn.prepareStatement(sql);
				
				rset = pstm.executeQuery();
				
				while (rset.next()) {
					Cliente cliente1 = new Cliente();
					
					
					
					//cliente1.setId_cliente(rset.getInt("id_cliente"));
					cliente1.setNome_cliente(rset.getString("nome_cliente"));
					cliente1.setTelefone_cliente(rset.getString("telefone_cliente"));
					cliente1.setEndereco_cliente(rset.getString("endereco_cliente"));
					cliente1.setCpf_cliente(rset.getString("cpf"));
					 
					
					
				}
			} catch (Exception e ) {
			e.printStackTrace();
		} finally {
			try {
				if (rset != null) {
					rset.close();
				}
				if (pstm != null) {
					rset.close();
				}
				if (conn != null) {
					conn.close();
				}
			
			} catch (Exception e ) {
				e.printStackTrace();
			}
				
			}
		
			return  cliente;
		}
			
		//UPDATE
		public static void update(clienteDao clienteDao) {
			String sql = "UPDATE Cliente SET nome_cliente, telefone_cliente, endereco_cliente,cpf = ? WHERE id_cliente, nome_cliente, telefone_cliente, endereco_cliente,cpf = ?,?,?,? ";
			
			
			
			try {
				conn = connectionMysql.CreateconnectionMysql();
				pstm = conn.prepareStatement(sql);
				
				pstm.setString(1, getNome_Cliente());
				pstm.setString(2, getTelefone_cliente());
				pstm.setString(3, getEndereco_cliente());
				pstm.setString(4, getCpf_cliente());
				
			
				pstm.execute();
				
			}catch (Exception e) {
				e.printStackTrace();
			}finally {
				try {
					if (pstm != null) {
						pstm.close();
					}
					if (conn != null) {
						conn.close();
					}
				
				}catch (Exception e) {
					e.printStackTrace();
			}
			
	}

}
		private static String getNome_Cliente() {
			
			return null;
		}
		private static String getTelefone_cliente() {
			
			return null;
		}
		//DELITE
		public static void deliteById(int id) {
			String sql = "DELETE FROM cliente WHERE id_cliente,nome_cliente,tefefone_cliente,endereço_cliente,cpf = ? ? ? ? ?";
			
			
			try {
				conn = connectionMysql.CreateconnectionMysql();
				pstm = conn.prepareStatement(sql);
				
				pstm.setInt(1, id);
				pstm.execute();
				
			}catch (Exception e) {
				e.printStackTrace();
			}finally {
				try {
					if (pstm != null) {
						pstm.close();
					}
					if (conn != null) {
						conn.close();
					}
				
				}catch (Exception e) {
					e.printStackTrace();
			}
		}
	}
public  Cliente getClienteById(int id) {
	String sql = "SELECT * /n" + "FROM cliente AS 1/n" + "WERE id_cliente = ?;";
	
	Cliente cliente = new Cliente();
	
	ResultSet rset = null;
	
	try { 
		
		conn = connectionMysql.CreateconnectionMysql();
		
		pstm = conn.prepareStatement(sql);
		pstm.setInt(1, id);
		rset = pstm.executeQuery();
		rset.next();
		
		Cliente.setId(rset.getInt("id_cliente"));
		Cliente.setNome(rset.getString("nome_cliente"));
		Cliente.setTelefone(rset.getString("telefone_cliente"));
		Cliente.setEndereco(rset.getString("endereco_cliente"));
		Cliente.setCpf(rset.getString("cpf_cliente"));
		
	} catch (Exception e) {
		e.printStackTrace();
	}finally {
		try {
			if (pstm != null) {
				pstm.close();
			}
			if (conn != null) {
				conn.close();
			}
		
		}catch (Exception e) {
			e.printStackTrace();
	}
	
}
		return cliente;
    }
    



			
	
		public Cliente getClienteById1(int posicao) {
		
			return null;
		}
		public clienteDao ClienteById(int posicao) {
			// TODO Auto-generated method stub
			return null;
		}
		
		}
		
		
		


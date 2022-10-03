package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Connection.connectionMysql;
import Modelo.Cliente;
import Modelo.Passagens;

public class PassagensDao {
private static final List<Passagens> passagens = null;



public void save( Passagens passagem) {

	String sql = "INSERT INTO passagens " + "(preco, quantidade, destinos)" +" VALUES (?), (?),(?)";


	Connection conn = null;
	PreparedStatement pstm = null;
	
	try {
		conn = connectionMysql.CreateconnectionMysql();
		pstm = conn.prepareStatement(sql);
		
		pstm.setBigDecimal(1,passagem.getPreco());
		pstm.setString(2, passagem.getDestinos());
		pstm.setBoolean(3, passagem.getQuantidade());
		pstm.execute();
		
	}catch(Exception e) {
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


	//READ
	public List<Passagens> getpassagens(){
		String sql = "SELECT * FROM passagens";
		
		List<Passagens> cliente = new ArrayList<Passagens>();
		Connection conn = null;
		PreparedStatement pstm = null;
		
		ResultSet rset = null;
		try {
			conn = connectionMysql.CreateconnectionMysql();
			
			pstm = conn.prepareStatement(sql);
			
			rset = pstm.executeQuery();
			
			while (rset.next()) {
				Passagens passageiro = new Passagens();
				
				passageiro .setId_passagens(rset.getInt("id_passagens"));
				passageiro .setPreco(rset.getBigDecimal("preco"));
				passageiro .setQuantidade(rset.getBoolean("quantidade"));
				passageiro .setDestinos(rset.getString("destinos"));
				
				((List<Passagens>) passageiro).add(passageiro);
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
		return passagens;
	}
	
	//UPDATE
	public void update(Passagens passagens) {
		String sql = "UPDATE Passagens SET passagens = ? WHERE id_passagens = ? ";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			conn = connectionMysql.CreateconnectionMysql();
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, passagens.getId_passagens());
			pstm.setBigDecimal(2, passagens.getPreco());
			pstm.setBoolean(3,(passagens.getQuantidade()));
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
	//DELITE
			public static void deliteById(int id) {
				String sql = "DELETE FROM passagens WHERE id_passagens = ?";
				
				Connection conn = null;
				PreparedStatement pstm = null;
				
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
}
				
				
		

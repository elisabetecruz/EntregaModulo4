package Dao;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Connection.connectionMysql;
import Modelo.Cliente;
import Modelo.Pacotes;

public class pacotesDao{
	public void save( Pacotes pacote) {
		
		String sql = "INSERT INTRO " + "pacotes (precos ,quantidade,destino) " + "VALUES (?), (?), (?)(?)," ;
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			conn = connectionMysql.CreateconnectionMysql();
			pstm = conn.prepareStatement(sql);
			
			pstm.setString(1, pacote.getServisos());
			pstm.setBigDecimal(2,pacote.getPrecos());
			pstm.execute();
		}catch (Exception e) { 
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
		public List<Pacotes> getPacotes(){
			String sql = "SELECT * FROM pacotes";
			
			List<Pacotes> pacotes = new ArrayList<Pacotes>();
			Connection conn = null;
			PreparedStatement pstm = null;
			
			ResultSet rset = null;
			//return null;
			
			try {
				conn = connectionMysql.CreateconnectionMysql();
				
				pstm = conn.prepareStatement(sql);
				
				rset = pstm.executeQuery();
				while (rset.next()) {
					Pacotes pacotes1 = new Pacotes();
					
					pacotes1.setId_pacotes(rset.getInt("Id_pacotes"));
					pacotes1.setPrecos(rset.getBigDecimal("preco"));
					pacotes1.setQuantidade(rset.getBoolean("quantidade"));
					pacotes1.setDestinos(rset.getString("destinos"));
					
					pacotes.add(pacotes1);
					
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
			
				return  pacotes;
		}
		//UPDATE
				public void update(Pacotes pacotes) {
					String sql = "UPDATE Pacotes SET preco, quantidade, destino = ? WHERE id_pacotes, preco, quantidade, destino = ? ,?, ?,?";
					
					Connection conn = null;
					PreparedStatement pstm = null;

					try {
						conn = connectionMysql.CreateconnectionMysql();
						pstm = conn.prepareStatement(sql);
						pstm.setInt(1,pacotes.getId_pacotes());
						pstm.setBigDecimal(2, pacotes.getPrecos());
						pstm.setBoolean(3, pacotes.getQuantidade());
						pstm.setString(4, pacotes.getDestinos());
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
						String sql = "DELETE FROM pacotes WHERE id_pacotes, precos, quantidades, destinos = ?, ?,?,?";
						
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
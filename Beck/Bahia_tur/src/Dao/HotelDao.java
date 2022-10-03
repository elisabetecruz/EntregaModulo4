package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Connection.connectionMysql;
import Modelo.Cliente;
import Modelo.Hotel;

public class HotelDao {
	static void save(Hotel hotel) {
		String sql = "INSERT INTO "+ "Hotel(cnpj, endereco, telefone " + " VALUES (?),(?),(?)";
		

		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			conn = connectionMysql.CreateconnectionMysql();
			pstm = conn.prepareStatement(sql);
			
			pstm.setString(1, hotel.getCnpj());
			pstm.setString(2, hotel.getEndereco());
			pstm.setString(3, hotel.getTelefone());
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
	//READ
			public List<Hotel> getHotel(){
				String sql = "SELECT * FROM hotel";
				
				List<Hotel> hotel = new ArrayList<Hotel>();
				Connection conn = null;
				PreparedStatement pstm = null;
				
				ResultSet rset = null;
				
				try {
					conn = connectionMysql.CreateconnectionMysql();
					
					pstm = conn.prepareStatement(sql);
					
					rset = pstm.executeQuery();
					
					while (rset.next()) {
						Hotel hotel1 = new Hotel();
						
						hotel1.setId_hotel(rset.getInt("Id_hotel"));
						hotel1.setTelefone(rset.getString("telefone"));
						hotel1.setCnpj(rset.getString("cnpj"));
						hotel1.setEndereco(rset.getString("endereco"));
						
						hotel1.add(hotel);
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
		
			
			return  hotel;
		}
			
		//UPDATE
		public void update(Hotel hotel) {
			String sql = "UPDATE Hotel SET cnpj,telefone,endereco = ? WHERE id_hotel,   = ?, ?,?,? ";
			
			Connection conn = null;
			PreparedStatement pstm = null;

			try {
				conn = connectionMysql.CreateconnectionMysql();
				pstm = conn.prepareStatement(sql);
				
				pstm.setInt(1, hotel.getId_hotel());
				pstm.setString(2, hotel.getCnpj());
				pstm.setString(3, hotel.getEndereco());
				pstm.setString(4, hotel.getTelefone());
				
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
					String sql = "DELETE FROM hotel  WHERE id_hotel,cnpj ,tefefone,endereço,= ? ? ? ? ?";
					
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
					
					
			

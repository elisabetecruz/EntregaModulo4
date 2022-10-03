package Connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class connectionMysql{
	
	public static Connection CreateconnectionMysql() throws Exception{
		
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bahia_tur?user=root&password=12596");
		
		return connection;
	}
		 public static void main(String[] args) throws Exception{
			 Connection con = CreateconnectionMysql();
			 if (con != null) {
				   System.out.println(con + "/n****conexao bem sucedida****/n");
			       con.close();
			   }
		
	}
}
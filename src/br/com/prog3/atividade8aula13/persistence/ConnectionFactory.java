package br.com.prog3.atividade8aula13.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public static Connection getConnection(){
		String driver = "org.postgresql.Driver";
		String user = "postgres";
		String senha = "root";
		String url = "jdbc:postgresql://127.0.0.1:5432/aula13";
		Connection conn = null;
		try{
			Class.forName(driver);
			conn = (Connection) DriverManager.getConnection(url,user,senha);
			System.out.println("Conexao com o Banco realizada.");
		}catch(ClassNotFoundException | SQLException ex){
			System.err.println(ex.getMessage());
		}
		
		return conn;
	}
	
	public static void close(Connection conn){
		try{
			conn.close();
		}catch(SQLException e){
			System.out.println("error.");
		}
	}
}

package contaEmBanco.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	private static Connection conexao;
	
	// Inicio Getter and Setters
	public Connection getConexao() {
		return conexao;
	}

	public static void setConexao(Connection conexao) {
		Conexao.conexao = conexao;
	}
	// Fim Getter and Setters

	public Connection obterConexao() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // Carrega o Driver do MySQL
			conexao = DriverManager.getConnection("jdbc:mysql://localhost/Banco_DGW", "root", ""); // instanciando																				// um objeto de																							// conexao
			return conexao;
		} catch (ClassNotFoundException e) {
			System.out.println("Driver do banco de dados não encontrado"); // Classe.forName meio que obriga a usar try
																			// catch ja que ela está procurando um driver insformado como String por parametro
			return null;
		} catch (SQLException e) {
			System.out.println("Ocorreu um erro ao acessar o banco: " + e.getMessage()); // Existe uma série de erros que possam impedir de acessar o banco,
			return null;																			  // DriverManger obriga a usar um catch para apresentar um erro caso ele aconteça.		
		}
	}
}

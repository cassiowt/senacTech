package com.senac.banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoMySQL {
        private static final String URL = "jdbc:mysql://localhost:3306/senac";
        private static final String USER = "root";
        private static final String PASSWORD = "senha";
	private static Connection conexao;

	public static Connection getConnection() {
		try {
			// testa se a conexao ja foi criada e a devolve.
			if (conexao != null && (!conexao.isClosed()))
				return conexao;
			/*
			 * se a conexao nao foi criada, configurar driver, usuario e senha
			 * do banco e entao retornar a conexao.
			 */
			Class.forName("com.mysql.cj.jdbc.Driver");
			conexao = DriverManager.getConnection(URL, USER, PASSWORD);
			return conexao;
		} catch (SQLException e) {
			System.err.println("Erro ao conectar: " + e.getMessage());
		} catch (ClassNotFoundException e) {
			System.err.println("Driver não encontrado!");
		}
		return null;
	}

	public static void main(String[] args) {
		System.out.print("Abrindo conexão com DB...");
		Connection c = ConexaoMySQL.getConnection();
		System.out.println("OK");
	}
}
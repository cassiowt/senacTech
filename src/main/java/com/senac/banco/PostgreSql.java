package banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgreSql {
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
			Class.forName("org.postgresql.Driver");
			conexao = DriverManager.getConnection("jdbc:postgresql://localhost/postgres", "postgres","postgres");
			return conexao;
		} catch (SQLException e) {
			System.err.println("Erro ao conectar: " + e.getMessage());
		} catch (ClassNotFoundException e) {
			System.err.println("Driver não encontrado!");
		}
		return null;
	}

	public static void main(String[] args) throws SQLException {
		System.out.print("Abrindo conexão com DB...");
		Connection c = PostgreSql.getConnection();
		System.out.println("OK");
		
		;
	}
}
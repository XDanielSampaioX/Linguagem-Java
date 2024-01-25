package contaEmBanco.servicos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import contaEmBanco.Interface.OperacaoBanco;
import contaEmBanco.dao.Conexao;

public class ConsultarRegistro implements OperacaoBanco {

	static Scanner entrada = new Scanner(System.in);
	Conexao conexao = new Conexao();
	int numeroConta;

	@Override
	public void executar() {
		conexao.obterConexao();

		System.out.println("Informe o número da conta que deseja procurar");
		numeroConta = Integer.parseInt(entrada.next().replace("\n", ""));

		ResultSet rsConsulta = procurarRegistro(numeroConta);

		try {
			if (!rsConsulta.next()) { // Verifica se não há resultados
				System.out.println("Conta não encontrada.");
			} else {
				do {
					String nomeBanco = rsConsulta.getString("nome");
					int numeroContaBanco = rsConsulta.getInt("numeroConta");
					double saldoBanco = rsConsulta.getDouble("saldo");

					System.out.println("nome: " + nomeBanco + "\nNúmero da conta: " + numeroContaBanco
							+ "\nSaldo disponível: " + saldoBanco);
				} while (rsConsulta.next());
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	ResultSet procurarRegistro(int numeroConta) {
		String sql = "SELECT * FROM CLIENTE WHERE numeroConta = ?";
		PreparedStatement preparedStatement; // Variável para operação no banco usando parâmetro de substituição "?"
		try {
			preparedStatement = conexao.getConexao().prepareStatement(sql);
			preparedStatement.setInt(1, numeroConta);
			return preparedStatement.executeQuery(); // Retorna um ResultSet
		} catch (SQLException e) {
			System.out.println("Comando SQL inválido: " + e.getMessage());
			return null;
		}
	}
}

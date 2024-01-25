package contaEmBanco.servicos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import contaEmBanco.Interface.OperacaoBanco;
import contaEmBanco.dao.Conexao;

public class ContasCadastradas implements OperacaoBanco {
	Conexao conexao = new Conexao();

	@Override
	public void executar() {
		try {
			conexao.obterConexao();
			Statement consulta = conexao.getConexao().createStatement();
			ResultSet resultSet = consulta.executeQuery("select * from CLIENTE;");
			while (resultSet.next()) {
				if (resultSet.isBeforeFirst()) { //isBeforeFist verifica se o ResultSet está vazio.
					System.out.println("Nenhum registro encontrado");
				} else {
					double numeroConta = resultSet.getDouble("numeroConta");
					System.out.println("Número da conta: " + numeroConta);
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
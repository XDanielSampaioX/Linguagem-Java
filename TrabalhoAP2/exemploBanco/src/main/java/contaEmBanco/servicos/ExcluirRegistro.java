package contaEmBanco.servicos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import contaEmBanco.Interface.OperacaoBanco;
import contaEmBanco.dao.Conexao;

public class ExcluirRegistro implements OperacaoBanco {

    static Scanner entrada = new Scanner(System.in);
    Conexao conexao = new Conexao();
    int numeroConta;

    @Override
    public void executar() {
        conexao.obterConexao();

        System.out.println("Informe o numero da conta que deseja remover");
        numeroConta = Integer.parseInt(entrada.next().replace("\n", ""));

        if (excluirRegistro(numeroConta)) {
            System.out.println("Conta excluída com sucesso.");
        } else {
            System.out.println("Conta não encontrada ou ainda possui saldo.");
        }
    }

    boolean excluirRegistro(int numeroConta) {
        String sqlConsultar = "SELECT saldo FROM CLIENTE WHERE numeroConta = ?";
        String sqlExcluir = "DELETE FROM CLIENTE WHERE numeroConta = ?";
        
        double saldoBanco = 0;
        PreparedStatement preparedStatementConsultar;
        PreparedStatement preparedStatementExcluir;
        ResultSet resultSet;

        try {
            preparedStatementConsultar = conexao.getConexao().prepareStatement(sqlConsultar);
            preparedStatementConsultar.setInt(1, numeroConta);
            resultSet = preparedStatementConsultar.executeQuery();
            
            if (resultSet.next()) {
                saldoBanco = resultSet.getDouble("saldo");
                if (saldoBanco > 0) {
                    System.out.println("Para encerrar a conta é necessário realizar o saque inteiro do saldo");
                    return false;
                } else {
                    preparedStatementExcluir = conexao.getConexao().prepareStatement(sqlExcluir);
                    preparedStatementExcluir.setInt(1, numeroConta);
                    return preparedStatementExcluir.executeUpdate() > 0;
                }
            } else {
                System.out.println("Conta não encontrada.");
                return false;
            }
        } catch (SQLException e) {
            System.out.println("Comando SQL inválido: " + e.getMessage());
            return false;
        }
    }
}

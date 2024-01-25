package contaEmBanco.servicos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import contaEmBanco.Interface.OperacaoBanco;
import contaEmBanco.dao.Conexao;

public class Deposito implements OperacaoBanco{

    static Scanner entrada = new Scanner(System.in);
    Conexao conexao = new Conexao();

    public void executar() {
        conexao.obterConexao();

        System.out.println("Informe o número da conta para realizar o depósito: ");
        int numeroConta = Integer.parseInt(entrada.next());

        ResultSet rsConsulta = procurarRegistro(numeroConta);

        try {
            if (!rsConsulta.next()) {
                System.out.println("Conta não encontrada.");
            } else {
                double saldo = rsConsulta.getDouble("saldo");
                System.out.println("Saldo atual: " + saldo);

                System.out.println("Informe o valor para depósito: ");
                double deposito = Double.parseDouble(entrada.next());

                if (saqueRealizado(numeroConta, deposito, saldo)) {
                    System.out.println("Depósito realizado com sucesso.");
                    System.out.println("Novo saldo: " + (saldo + deposito));
                } else {
                    System.out.println("Saque não realizado.");
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private ResultSet procurarRegistro(int numeroConta) {
        String sql = "SELECT * FROM CLIENTE WHERE numeroConta = ?";
        PreparedStatement preparedStatement;

        try {
            preparedStatement = conexao.getConexao().prepareStatement(sql);
            preparedStatement.setInt(1, numeroConta);
            return preparedStatement.executeQuery();
        } catch (SQLException e) {
            System.out.println("Comando SQL inválido: " + e.getMessage());
            return null;
        }
    }

    private boolean saqueRealizado(int numeroConta, double deposito, double saldo) {
        if (deposito <= 0) {
            System.out.println("Valor de depósito tem que ser maior que zero");
            return false;
        } else {
            String sql = "UPDATE CLIENTE SET saldo = ? WHERE numeroConta = ?";

            try {
                PreparedStatement preparedStatement = conexao.getConexao().prepareStatement(sql);
                preparedStatement.setDouble(1, saldo + deposito);
                preparedStatement.setInt(2, numeroConta);

                int linhasAfetadas = preparedStatement.executeUpdate();

                if (linhasAfetadas > 0) {
                    return true;
                } else {
                    return false;
                }
            } catch (SQLException e) {
                System.out.println("Erro ao realizar o deposito: " + e.getMessage());
                return false;
            }
        }
    }
}

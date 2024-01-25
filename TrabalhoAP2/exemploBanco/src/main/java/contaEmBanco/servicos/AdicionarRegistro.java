package contaEmBanco.servicos;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import contaEmBanco.Interface.OperacaoBanco;
import contaEmBanco.dao.Conexao;

public class AdicionarRegistro implements OperacaoBanco {

    static Scanner entrada = new Scanner(System.in);
    Conexao conexao = new Conexao();
    Conta conta;
    String nome;
    double valorDeposito;

    @Override
    public void executar() {
        conexao.obterConexao();

        System.out.println("Informe a nome do titular da conta: ");
        nome = entrada.next().toUpperCase();

        if (nome != null && !nome.isEmpty()) {
            System.out.println("Informe o valor para depósito: ");
            valorDeposito =  entrada.nextDouble();

            if (valorDeposito >= 0) {
                conta = new Conta(nome, valorDeposito);

                if (adicionarRegistro(conta.getNomeCliente(), conta.getNumeroConta(), conta.getSaldoConta())) {
                    System.out.println("Conta adicionada com sucesso.");
                } else {
                    System.out.println("Registro não adicionado.");
                }
            } else {
                System.out.println("Valor de depósito inválido. Deve ser maior que zero.");
            }
        } else {
            System.out.println("Nome inválido. Deve ser informado.");
        }
    }

    boolean adicionarRegistro(String nome, int numeroConta, double valorDepositado) {
        String sql = "INSERT INTO CLIENTE (nome, numeroConta, saldo) VALUES (?, ?, ?)";
        PreparedStatement preparedStatement;
        try {
            preparedStatement = conexao.getConexao().prepareStatement(sql);
            preparedStatement.setString(1, nome);
            preparedStatement.setInt(2, numeroConta);
            preparedStatement.setDouble(3, valorDepositado);
            return preparedStatement.executeUpdate() > 0; // Retorna verdadeiro se pelo menos uma linha foi atualizada
        } catch (SQLException e) {
            System.out.println("Erro ao adicionar o registro: " + e.getMessage());
            return false;
        }
    }
}

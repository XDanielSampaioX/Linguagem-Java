package exercicios.TrabalhoAP1.contaEmBanco;

import java.util.ArrayList;

public class CadastroDeContas {

    private ArrayList<Conta> contas;
    private int qtdeContas;

    // Getters e Setters
    public ArrayList<Conta> getConta() {
        return contas;
    }

    public void setConta(ArrayList<Conta> conta) {
        this.contas = conta;
    }

    public int getQtdeContas() {
        return qtdeContas;
    }

    public void setQtdeContas(int qtdeContas) {
        this.qtdeContas = qtdeContas;
    }

    // Métodos StringBuilder ou Construtor
    public CadastroDeContas() {
        this.qtdeContas = 10;
        this.contas = new ArrayList<Conta>(qtdeContas);
    }

    public CadastroDeContas(int qtdeContas) {
        if (qtdeContas < 5) {
            System.out.println("A quantidade de contas deve ser pelo menos 5");
        } else {
            this.qtdeContas = qtdeContas;
            this.contas = new ArrayList<>(qtdeContas);
        }
    }

    public void adicionar(Conta conta) {
        if (contas.size() < qtdeContas) {
            contas.add(conta);
            System.out.println("Conta criada com sucesso");
            conta.setStatus(true);
        } else {
            System.out.println("Falha ao criar conta"); // se o valor ultrapassar o valor informado de contas
        }
    }

    public void exibirTodos() {
        for (int i = 0; i < contas.size(); i++) { // Percorre toda a lista
            System.out.println(contas.get(i));
        }
    }

    public void procurar(int numeroConta) {
        for (int i = 0; i < contas.size(); i++) { // Percorre toda a lista
            if (numeroConta == contas.get(i).getNumeroConta()) { // Comnpara o valor recebido com o valor cadastrado
                System.out.println(contas.get(i)); // exibe a conta procurada
                return; // Quando encontrar o valor, o laço se encerra
            }
        }
        System.out.println("Conta não encontrada");
    }

    public void excluir(int numeroConta) {
        for (int i = 0; i < contas.size(); i++) { // Percorre toda a lista
            if (numeroConta == contas.get(i).getNumeroConta()) { // Comnpara o valor recebido com o valor cadastrado
                System.out.println("Conta removida com sucesso!");
                contas.remove(i); // exibe a conta removida
                return; // Quando encontrar o valor, o laço se encerra
            }
        }
        System.out.println("Conta não encontrada");
    }

    public void qtdCadastradas() {
        if (contas.size() == 1) {
            System.out.println("Existe " + contas.size() + " conta cadastrada");
        } else {
            System.out.println("Existem " + contas.size() + " contas cadastradas");
        }
    }

}

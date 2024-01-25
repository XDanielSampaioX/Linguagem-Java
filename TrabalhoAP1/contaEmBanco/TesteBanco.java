package exercicios.TrabalhoAP1.contaEmBanco;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteBanco {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String desejaContinuar = "S"; // Inicializa com "S" para entrar no loop

		CadastroDeContas conta1 = null;

		try {
			System.out.println("Escolha uma das opções: ");
			System.out.println("1- Informar quantidade de contas a serem cadastradas: ");
			System.out.println("2 ou superior- Cadastrar no máximo 10 contas");
			int opcaoQtdContas = entrada.nextInt();
			conta1 = (opcaoQtdContas == 1) ? criarContaComQuantidade(entrada) : criarContaPadrao();
		} catch (InputMismatchException e) {
			System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
		}

		while (desejaContinuar.equals("S")) {
			Menu(); // Exibe o menu a cada iteração do loop
			int opcao = entrada.nextInt();
			entrada.nextLine(); // Consumir a quebra de linha após a entrada do número

			switch (opcao) {
			case 1:
				System.out.println("Informe o nome do cliente:");
				String nomeCliente = entrada.nextLine();
				System.out.println("Informe seu saldo:");
				double saldo = entrada.nextDouble();
				Conta minhaConta1 = new Conta(nomeCliente, saldo);
				conta1.adicionar(minhaConta1);
				break;
			case 2:
				System.out.println("Dados de usuários:");
				conta1.exibirTodos();
				System.out.println("***Busca Finalizada***");
				break;
			case 3:
				System.out.println("Informe qual conta deseja procurar:");
				int numeroConta = entrada.nextInt();
				conta1.procurar(numeroConta);
				break;
			case 4:
				System.out.println("Informe qual conta deseja excluir:");
				int numeroContaExcluir = entrada.nextInt();
				conta1.excluir(numeroContaExcluir);
				break;
			case 5:
				System.out.println("***Quantidade de Contas Criadas: ");
				conta1.qtdCadastradas();
				break;
			case 6:
				desejaContinuar = "N"; // Sai do programa
				break;
			default:
				System.out.println("Opção inválida. Tente novamente.");
				break;
			}

			System.out.println("Deseja Continuar (S/N) ?");
			desejaContinuar = entrada.next().toUpperCase(); // Converte para maiúsculas
		}

		entrada.close(); // Fecha o scanner quando não for mais necessário
	}

	static void Menu() {
		System.out.println("** Menu de Opção **");
		System.out.println("(1) -> Abrir Conta");
		System.out.println("(2) -> Banco de Dados Cadastrados");
		System.out.println("(3) -> Procurar Conta");
		System.out.println("(4) -> Excluir Conta");
		System.out.println("(5) -> Quantidade de Contas Cadastradas");
		System.out.println("(6) -> Sair do Programa");
	}

	static CadastroDeContas criarContaPadrao() {
		return new CadastroDeContas();
	}

	static CadastroDeContas criarContaComQuantidade(Scanner entrada) {
		System.out.println("Informe a quantidade de contas a serem cadastradas: ");
		int qtdContas = entrada.nextInt();
		return new CadastroDeContas(qtdContas);
	}
}

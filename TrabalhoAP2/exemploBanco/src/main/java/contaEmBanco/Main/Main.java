package contaEmBanco.Main;

import java.util.Scanner;

import contaEmBanco.Interface.OperacaoBanco;
import contaEmBanco.servicos.AdicionarRegistro;
import contaEmBanco.servicos.ConsultarRegistro;
import contaEmBanco.servicos.ContasCadastradas;
import contaEmBanco.servicos.Deposito;
import contaEmBanco.servicos.ExcluirRegistro;
import contaEmBanco.servicos.Saque;

public class Main {

	public static void main(String[] args) {
		menu();
	}

	public static void menu() {
		Scanner entrada = new Scanner(System.in);
		OperacaoBanco operacao = null;
		int opcao = 0;

		while (opcao != 7) {
			System.out.println("** Menu de Opção **");
			System.out.println("(1) -> Abrir Conta");
			System.out.println("(2) -> Contas Cadastrados");
			System.out.println("(3) -> Procurar Conta");
			System.out.println("(4) -> Excluir Conta");
			System.out.println("(5) -> Saque");
			System.out.println("(6) -> Depósito");
			System.out.println("(7) -> Sair do Programa");

			try {
					opcao = Integer.parseInt(entrada.next().replace("\n", ""));
					switch (opcao) {
			
					case 1:
						operacao = new AdicionarRegistro();
						break;
					case 2:
						operacao = new ContasCadastradas();
						break;
					case 3:
						operacao = new ConsultarRegistro();
						break;
					case 4:
						operacao = new ExcluirRegistro();
						break;
					case 5:
						operacao = new Saque();
						break;
					case 6:
						operacao = new Deposito();
						break;
					case 7:
						System.out.println("Saindo do programa.");
						break;
					default:
						System.out.println("Opção inválida. Tente novamente.");
						operacao = null;
						break;
					}

					if (operacao != null) {
						operacao.executar(); // Mova a chamada para dentro do switch
					}
				}
			catch (NumberFormatException e) {
				System.out.println("O valor informado não é um número válido. Tente novamente.");
			}
		}

		entrada.close();
	}

}

package fundamentos.Exercicios;

import java.util.Scanner;

public class QuadraCubo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite um numero: ");
		double numero = entrada.nextDouble();
		
		double quad = Math.pow(numero, 2);
		System.out.println("O n�mero informado ao quadrado �: ");
		System.out.println(quad);
		
		double cubo = Math.pow(numero, 3);
		System.out.println("O n�mero informado ao cubo �: ");
		System.out.println(cubo);
		
		entrada.close();
	}
}

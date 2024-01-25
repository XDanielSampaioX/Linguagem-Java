package exercicios.ExAP1.MaiorNumero;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Comparar comparar = new Comparar();
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o primeiro número");
		comparar.setNum1(entrada.nextInt());
		System.out.println("Digite o segundo número");
		comparar.setNum2(entrada.nextInt());
		System.out.println("Digite o terceiro número");
		comparar.setNum3(entrada.nextInt());

		comparar.maiorEntre(comparar.getNum1(), comparar.getNum2(), comparar.getNum3());
		
		entrada.close();
	}
}

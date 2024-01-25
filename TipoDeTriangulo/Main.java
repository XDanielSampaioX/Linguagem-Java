package exercicios.ExAP1.TipoDeTriangulo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Comparar comparar = new Comparar();
		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe o valor do 1° lado: ");
		comparar.setLado1(entrada.nextDouble());

		System.out.println("Informe o valor do 2° lado: ");
		comparar.setLado2(entrada.nextDouble());
		
		System.out.println("Informe o valor do 3° lado: ");
		comparar.setLado3(entrada.nextDouble());

		comparar.definirTriangulo(comparar.getLado1(), comparar.getLado2(), comparar.getLado3());
		
		entrada.close();
	}

}

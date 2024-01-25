package exercicios.ExAP1.Poligono;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Poligono ex6 = new Poligono();

		Scanner entrada = new Scanner(System.in);

		System.out.println("Entre com o número de lados: ");
		ex6.setNumLados(entrada.nextInt());
		
		System.out.println(ex6.calculaArea());
			
		entrada.close();
	}
}

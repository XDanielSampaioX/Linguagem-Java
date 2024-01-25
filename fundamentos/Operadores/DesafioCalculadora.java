package fundamentos.Operadores;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite o primeiro n�mero: ");
		double numero1 = entrada.nextDouble();
		
		System.out.println("Digite o segundo n�mero: ");
		double numero2 = entrada.nextDouble();
		
		System.out.println("Informe a opera��o");
		String op = entrada.next();
		
		// L�gica
		double resultado = "+".equals(op) ? numero1 + numero2 : 0;
		resultado = "-".equals(op) ? numero1 - numero2 : resultado;
		resultado = "*".equals(op) ? numero1 * numero2 : resultado;
		resultado = "/".equals(op) ? numero1 / numero2 : resultado;
		resultado = "%".equals(op) ? numero1 % numero2 : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f",
				numero1, op , numero2, resultado);
		
		entrada.close();
	}
}

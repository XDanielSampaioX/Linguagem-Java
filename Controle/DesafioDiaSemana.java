package Controle;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um dia da semana: ");
		String dia = entrada.next().toUpperCase();
		
		/* N�O USAR == QUANDO FOR COMPARAR STRINGS,
		 / USE EQUALSIGNORECASE !!!
		 */
		
		System.out.println();
		
		if (dia.equalsIgnoreCase("domingo")){
			System.out.print("1");
		} else if (dia.equalsIgnoreCase("Segunda")) {
			System.out.print("2");
		} else if (dia.equalsIgnoreCase("Ter�a")) {
		System.out.print("3");
		} else if (dia.equalsIgnoreCase("Quarta")) {
			System.out.print("4");
		} else if (dia.equalsIgnoreCase("Quinta")) {
			System.out.print("5");
		} else if (dia.equalsIgnoreCase("Sexta")) {
			System.out.print("6");
		} else if (dia.equalsIgnoreCase("S�bado")){
			System.out.println("7");
		} else {
			System.out.println("Op��o inv�lida");
		}
	
		entrada.close();
	}
}

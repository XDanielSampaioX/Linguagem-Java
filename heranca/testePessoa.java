package exercicios.heranca;

import java.util.Scanner;

public class testePessoa {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String nome = entrada.next();
		String sobrenome = entrada.next();
		int idade = entrada.nextInt();
		long cpf = entrada.nextLong();
		int numeroCracha = entrada.nextInt();
		
		
		Pessoa daniel = new Professor(nome, sobrenome, idade, cpf, numeroCracha);
		
		
		System.out.println(daniel);
		
		entrada.close();
	}
	
	
}

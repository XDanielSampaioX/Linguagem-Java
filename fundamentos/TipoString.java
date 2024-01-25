package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		System.out.println("Ol� pessoal".charAt(2)); //localiza qual letra est� no quadrante
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		
		System.out.println(s.toLowerCase().startsWith("boa")); /* Transforma em tudo min�sculo ;
		Inicia com; Verdadeiro ou falso */
		
		System.out.println(s.toUpperCase().endsWith("TARDE")); /*Transforma tudo em letra mai�scula;
		Termina com ; verdadeiro ou Falso.*/
		
		System.out.println(s.length()); //Quantos caracteres tem.
		
		System.out.println(s.equals("boa tarde")); //pergunta se � igual; Verdadeiro ou falso.
		
		System.out.println(s.equalsIgnoreCase("boa tarde")); /* Ignora qualquer
		caractere e escreve a palavra; Verdadeiro ou falso */
		
		System.out.println("\n"); // Pular linha
		
		var nome = "Daniel";
		var sobrenome = "Sampaio";
		var idade = 24;
		var salario = 1389.895;
		
		/* String pode ser expressa de v�rias formas, concatenando ou escrevendo %d (inteiro)
		%s (frases), e %f (flutuantes)*/
		
		String maisUmafrase = "Nome: " + nome + "\nSobrenome: "
				+ sobrenome + "\nIdade: " + idade +
				"\nSalario: " + salario + "\n\n";
		System.out.println(maisUmafrase);
		
		System.out.printf("O senhor %s %s tem %d anos e ganha R$%.2f.",
				nome , sobrenome, idade , salario);
		String frase = String.format("\nO senhor %s %s tem %d anos e ganha R$%.2f.",
				nome , sobrenome, idade , salario);
		System.out.println(frase);
		
		System.out.println("\n");
		
		System.out.println("Franse qualquer".contains("qual")); //Se cont�m; Verdadeiro ou falso
		System.out.println("Franse qualquer".indexOf("qual")); //Apartir de onde se inicia
		System.out.println("Franse qualquer".substring(7)); //Come�a apartir de qual letra
		System.out.println("Franse qualquer".substring(7,11)); /*Come�a apartir de qual letra e
		termina antes de onde demilita*/
	}
}

package colecoes;

import java.util.HashSet;


public class Hash {

	public static void main(String[] args) {
		
		HashSet <Usuario> usuarios= new HashSet <Usuario> ();
		
		usuarios.add(new Usuario ("Pedro"));
		usuarios.add(new Usuario ("Ana"));
		usuarios.add(new Usuario ("Guilherme"));
		
		boolean resultado= usuarios.contains(new Usuario("Guilherme"));
		System.out.println(resultado); 
		
		// Caso o Hash n�o tenha sido implementado, o codigo acima retornar�
		// falso, pois sem o Hash ele sub-entende que a compara��o n�o tem o mesmmo tamanho.
	}
}

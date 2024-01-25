package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet ();
		
		conjunto.add(1.2); // double-> Double
		conjunto.add(true); // booblean-> Boolean
		conjunto.add("Teste"); // String
		conjunto.add(1); // Int-> Integer
		conjunto.add('x'); // char-> Caractere
		
		conjunto.add("teste");
		conjunto.add('x');
		
		System.out.println("Tamanho �: " + conjunto.size());
		System.out.println("Tamanho �: " + conjunto.size());
		
		System.out.println(conjunto.remove("teste"));
		System.out.println(conjunto.remove("Teste"));
		System.out.println(conjunto.remove('x'));

		System.out.println("Tamanho �: " + conjunto.size());
		System.out.println("Tamanho �: " + conjunto.size());

		System.out.println("Tamanho �: " + conjunto.contains('x'));
		System.out.println("Tamanho �: " + conjunto.contains(1));
		System.out.println("Tamanho �: " + conjunto.contains(true));
		
		Set nums= new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		//conjunto.addAll(nums); // Uni�o entre dois conjuntos
		conjunto.retainAll(nums);
		System.out.println(conjunto);
		
		conjunto.clear();
		System.out.println(conjunto);
	}
}
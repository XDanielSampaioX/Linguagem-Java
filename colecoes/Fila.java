package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<>();

		// Offer e Add-> Adicionam elementos na fila

		// Diferen�a � o comportamento
		// quando a fila est� cheia !
		fila.add("Ana"); // Retorna false
		fila.offer("Bia"); // Lan�a uma excess�o
		fila.offer("Carlos");
		fila.offer("Daniel");
		fila.offer("Rafaela");
		fila.offer("Gui");

		// Peak e Element-> obter o proximo elementos
		// da fila (sem remover)

		// Diferen�a � o comportamento ocorre
		// quando a fila est� vazia !
		System.out.println(fila.peek()); // retorna NULL
		System.out.println(fila.peek());
		System.out.println(fila.element());
		System.out.println(fila.element()); // Lan�a uma excess�o

		// Poll e Remove-> obter o proximo elemento
		// da fila e remove
		
		// Diferen�a � o comportamento ocorre
		// quando a fila est� vazia !
		System.out.println(fila.poll()); // Retorna NULL
		System.out.println(fila.remove()); // Lan�a excess�o
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		
		// fila.size();
		// fila.clear ();
		// fila.isEmpty();
		
		// fila.contains(...); 
	}
}

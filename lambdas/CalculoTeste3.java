package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {

	public static void main(String[] args) {
		
		// int -> Double: Não permite
		// double-> Double: Permite
		
		BinaryOperator<Double> calc= (x, y) ->{return x+y;}; // interface funcional ja existente
		System.out.println(calc.apply(2.0,3.0));
		
		calc= (x, y) -> x*y; // lambda explicita
		System.out.println(calc.apply(2.0, 3.0));

		BinaryOperator<Integer> calc2= (x, y) ->{return x+y;};
		System.out.println(calc2.apply(2,3));
		
		calc= (x, y) -> x*y; 
		System.out.println(calc2.apply(2, 3));
		
//		System.out.println(calc.legal()); // retorna string
//		System.out.println(Calculo.muitoLegal()); //estatico
	}
}

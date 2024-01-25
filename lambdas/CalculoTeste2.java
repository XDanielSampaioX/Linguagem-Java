package lambdas;

public class CalculoTeste2 {

	public static void main(String[] args) {
		
		Calculo calc= (x, y) ->{return x+y;}; // lambda implicita // Somente é possivel se for a unica abstrata
		System.out.println(calc.executar(2,3));
		
		calc= (x, y) -> x*y; // lambda explicita
		System.out.println(calc.executar(2, 3));
		
		System.out.println(calc.legal()); // retorna string
		System.out.println(Calculo.muitoLegal()); //estatico
	}
}

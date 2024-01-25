package exercicios.geometria;

public class Main {
public static void main(String[] args) {
	Quadrado quadrado = new Quadrado();
	Circulo circulo = new Circulo();

	quadrado.lado = 5;
	System.out.println("A area do quadrado é: " + quadrado.calcularArea()); 

	circulo.raio = 5;
	System.out.println("A area do circulo é: " + circulo.calcularArea()); 
}
}

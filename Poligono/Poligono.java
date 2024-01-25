package exercicios.ExAP1.Poligono;

import java.util.Scanner;

public class Poligono {

	private int numLados;
	private double base, altura;
	private double area;
	Scanner entrada = new Scanner(System.in);

	public int getNumLados() {
		return numLados;
	}

	public void setNumLados(int numLados) {
		this.numLados = numLados;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public String calculaArea() {
		if (this.numLados <= 2) {
			System.out.println("NÃO É UM POLÍGONO");
		} else if (this.numLados == 3) {
			System.out.println("É um Triângulo");
			System.out.println("Informa a base do Triângulo: ");
			this.base = entrada.nextDouble();

			System.out.println("Informa a altura do Triângulo: ");
			this.altura = entrada.nextDouble();
			System.out.println(this.altura);

			this.area = this.base * this.altura / 2;
		} else if (this.numLados == 4) {
			System.out.println("É um Quadrado");
			System.out.println("Informa o valor da lateral do Quadrado: ");
			this.base = this.altura = entrada.nextDouble();

			this.area = this.base * this.altura;
		} else if (this.numLados == 5) {
			System.out.println("É um Pentagono");
		} else {
			System.out.println("Polígono não identificado");
		}
		return "Sua área é: " + this.area;
	}
}

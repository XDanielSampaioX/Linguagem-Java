package exercicios.ingresso;

public class Ingresso {
	
	private double valorIngresso;

	public double getValorIngresso() {
		return valorIngresso;
	}

	public void setValorIngresso(double valorIngresso) {
		this.valorIngresso = valorIngresso;
	}
	
	public void imprimeValor () {
		System.out.println(getValorIngresso());
	}
}

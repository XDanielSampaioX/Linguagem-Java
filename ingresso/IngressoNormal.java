package exercicios.ingresso;

public class IngressoNormal extends Ingresso {

	double valorIngressoNormal;

	public double getValorIngressoNormal() {
		return valorIngressoNormal;
	}

	public void setValorIngressoNormal(double valorIngressoNormal) {
		this.valorIngressoNormal = valorIngressoNormal;
	}
	
	public IngressoNormal(double valorIngrssoNormal) {
		this.valorIngressoNormal = valorIngrssoNormal;
	}
	
	@Override
	public void imprimeValor() {
		System.out.println(getValorIngressoNormal());
	}

	public void imprimeTipoDeIngresso() {
		System.out.println("Ingresso normal");
	}

}

package exercicios.ingresso;

public class IngressoVip extends Ingresso {

	double valorIngressoVip;

	
	public double getValorIngressoVip() {
		return valorIngressoVip;
	}
	
	public void setValorIngressoVip (double valorIngressoVip) {
		this.valorIngressoVip = valorIngressoVip * 0.5 + valorIngressoVip;		
	}
	
	public IngressoVip (double valorIngressoVip) {
		setValorIngressoVip(valorIngressoVip);
	}

}

package exercicios.ingresso;

public class CamaroteSuperior extends IngressoVip {

	public CamaroteSuperior(double valorIngressoVip) {
		super(valorIngressoVip);
	}
	
	@Override
	public void imprimeValor() {
		System.out.println(getValorIngressoVip());
	}
}

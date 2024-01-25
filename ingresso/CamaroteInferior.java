package exercicios.ingresso;

public class CamaroteInferior extends IngressoVip {

	public CamaroteInferior(double valorIngressoVip) {
		super(valorIngressoVip);
	}

	String localizacao = "Camarote inferior";

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}


	@Override
	public void imprimeValor() {
		System.out.println(getValorIngressoVip());
	}
}

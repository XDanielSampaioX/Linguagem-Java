package exercicios.imovel;

public class NovoImovel extends Imovel {

	private double precoAdicional;

	public double getPrecoAdicional() {
		return precoAdicional;
	}

	public void setPrecoAdicional(double precoAdicional) {
		this.precoAdicional = precoAdicional;
	}

	public NovoImovel(String endereco, double precoAdicional) {
		super(endereco,precoAdicional + precoAdicional * 0.3);
	}

}

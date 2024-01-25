package exercicios.imovel;

public class VelhoImovel extends Imovel {
	private double precoDesconto;

	public double getPrecoAdicional() {
		return precoDesconto;
	}

	public void setPrecoAdicional(double precoDesconto) {
		this.precoDesconto = precoDesconto;
	}

	public VelhoImovel(String endereco, double precoDesconto) {
		super(endereco, precoDesconto - precoDesconto * 0.3);
	}
}

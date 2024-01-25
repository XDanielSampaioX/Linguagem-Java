package exercicios.heranca;

public class Professor extends Pessoa {
	
	private int numeroCracha;

	public Professor(String nome, String sobreNome, int idade, long cpf, int numeroCracha) {
		super(nome, sobreNome, idade, cpf);
		this.numeroCracha = numeroCracha;
	}
	
	
	
	public int getNumeroCracha() {
		return numeroCracha;
	}



	public void setNumeroCracha(int numeroCracha) {
		this.numeroCracha = numeroCracha;
	}



	@Override
	public String toString () {
		return getNome() + " " + getSobreNome() + " " + getIdade() + " " + getCpf() + " " + getNumeroCracha() + " ";
	}
}

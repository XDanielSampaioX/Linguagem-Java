package exercicios.heranca;

public class Pessoa {

	private String nome;
	private String sobreNome;
	private int idade;
	private long cpf;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public Pessoa(String nome, String sobreNome, int idade, long cpf) {
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.idade = idade;
		this.cpf = cpf;
	}
}

package exercicios.heranca;

public class Aluno extends Pessoa {

	int numeroMatricula;

	public Aluno(String nome, String sobreNome, int idade, long cpf, int numeroMatricula) {
		super(nome, sobreNome, idade, cpf);
		this.numeroMatricula = numeroMatricula;
	}
}

package exercicios.pessoa;

public class TestePessoa {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa("Daniel", "Sampaio", 18, 97, 1.79);
		Pessoa pessoa2 = new Pessoa("Marcio", "Fonseca", 36, 85.0, 1.78);
		Pessoa pessoa3 = new Pessoa("Dayorrane", "Sampaio", 27, 97.0, 1.75);
		
		// @Pessoa 1;
		System.out.println("Sou " + pessoa1.getNome() + " " + pessoa1.getSobrenome() +
				", tenho " + pessoa1.getIdade() + " anos, e possuo " + pessoa1.getPeso() +
				" kg" + " e altura " + pessoa1.getAltura() + " m");
		
		pessoa1.engordar(10);
		pessoa1.emagrecer(10);
		pessoa1.envelhecer();
		
		
		// @Pessoa 2;
		System.out.println("\nSou " + pessoa2.getNome() + " " + pessoa2.getSobrenome() +
				", tenho " + pessoa2.getIdade() + " anos, e possuo " + pessoa2.getPeso() +
				" kg" + " e altura " + pessoa2.getAltura() + " m");
		
		pessoa2.engordar(0.0);
		pessoa2.emagrecer(10);
		pessoa2.envelhecer();
		System.out.println(pessoa2.getAltura());
		

		// @Pessoa 3;
		System.out.println("\nSou " + pessoa3.getNome() + " " + pessoa3.getSobrenome() +
				", tenho " + pessoa3.getIdade() + " anos, e possuo " + pessoa3.getPeso() +
				" kg" + " e altura " + pessoa2.getAltura() + " m");
		
		pessoa3.engordar(0.0);
		pessoa3.emagrecer(10);
		pessoa3.envelhecer();
		System.out.println(pessoa2.getIdade());
		
	}
}

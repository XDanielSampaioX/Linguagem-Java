package exercicios.pessoa; 

public class Pessoa {

	private String nome;
	private String sobrenome;
	private double peso;
	private double altura;
	private int idade;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	Pessoa(String nome, String sobrenome, int idade, double peso, double altura) {

		this.nome = nome;
		this.sobrenome = sobrenome;
		this.idade = idade;
		this.peso = peso;
		this.altura = altura;
	}

	public void engordar(double engordou) {
		this.peso += engordou;
		double imc = this.peso / Math.pow(this.altura, 2);

		if (this.idade >= 18 && this.idade < 60) {
			System.out.println("Pela sua idade, você estê na categoria de IMC adulto");
			if (imc < 18.5) {
				System.out.println("Você está abaixo do peso");
			} else if (imc == 18.5 || imc <= 24.9) {
				System.out.println("Você está no peso ideal");
			} else if (imc == 25 || imc <= 29.9) {
				System.out.println("Você está com sobrepeso");
			} else if (imc == 30 || imc <= 34.9) {
				System.out.println("Você está com obesidade");
			} else if (imc == 35 || imc <= 39.9) {
				System.out.println("Você está com obesidade ||");
			} else if (imc >= 40) {
				System.out.println("Você está com obesidade |||");
			}
		} else if (this.idade >= 60) {
			System.out.println("Pela sua idade, você está na categoria de IMC idoso");
			if (imc <= 21.9) {
				System.out.println("Você está abaixo do peso");
			} else if (imc == 22 || imc <= 26.9) {
				System.out.println("Você está no peso ideal");
			} else if (imc >= 27) {
				System.out.println("Você está com sobrepeso");
			}
		} else if (this.idade <= 12) {
			System.out.println("Pela sua idade, você está na categoria de IMC crianêa");
			if (imc <= 14) {
				System.out.println("Você está abaixo do peso");
			} else if (imc == 14 || imc <= 22.9) {
				System.out.println("Você está no peso ideal");
			} else if (imc == 23 || imc <= 26.9) {
				System.out.println("Você está com sobrepeso");
			} else if (imc >= 27) {
				System.out.println("Você está com obesidade");
			}
		}
	}

	public void emagrecer(double emagreceu) {
		if (this.peso - emagreceu <= 0) {
			System.out.println("Seu peso não pode ser zero, e nem emagrecer para menos do seu peso atual");
		} else {
			this.peso -= emagreceu;
			double imc = this.peso / Math.pow(this.altura, 2);

			if (this.idade >= 18 && this.idade < 60) {
				System.out.println("Pela sua idade, você está na categoria de IMC adulto");
				if (imc < 18.5) {
					System.out.println("Você está abaixo do peso");
				} else if (imc == 18.5 || imc <= 24.9) {
					System.out.println("Você está no peso ideal");
				} else if (imc == 25 || imc <= 29.9) {
					System.out.println("Você está com sobrepeso");
				} else if (imc == 30 || imc <= 34.9) {
					System.out.println("Você está com obesidade");
				} else if (imc == 35 || imc <= 39.9) {
					System.out.println("Você está com obesidade ||");
				} else if (imc >= 40) {
					System.out.println("Você está com obesidade |||");
				}
			} else if (this.idade >= 60) {
				System.out.println("Pela sua idade, você está na categoria de IMC idoso");
				if (imc <= 21.9) {
					System.out.println("Você está abaixo do peso");
				} else if (imc == 22 || imc <= 26.9) {
					System.out.println("Você está no peso ideal");
				} else if (imc >= 27) {
					System.out.println("Você está com sobrepeso");
				}
			} else if (this.idade <= 12) {
				System.out.println("Pela sua idade, você está na categoria de IMC crianêa");
				if (imc <= 14) {
					System.out.println("Você está abaixo do peso");
				} else if (imc == 14 || imc <= 22.9) {
					System.out.println("Você está no peso ideal");
				} else if (imc == 23 || imc <= 26.9) {
					System.out.println("Você está com sobrepeso");
				} else if (imc >= 27) {
					System.out.println("Você está com obesidade");
				}
			}
		}
	}

	public void envelhecer() {
		++this.idade;
	}
}

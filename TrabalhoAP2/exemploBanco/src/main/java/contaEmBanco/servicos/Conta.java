package contaEmBanco.servicos;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Conta {

	private String nomeCliente;
	private int numeroConta;
	private double saldoConta;
	

	// Getters e Setters

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public double getSaldoConta() {
		return saldoConta;
	}

	public void setSaldoConta(double saldoConta) {
		this.saldoConta = saldoConta;
	}

	public Conta(String nomeCliente,double saldoConta) {
		this.nomeCliente = nomeCliente;
		this.numeroConta = gerarNumeroContaUnico();
		this.saldoConta = saldoConta;
	}
	
	private int gerarNumeroContaUnico() {
        Set<Integer> numerosDeConta = new HashSet<>();
        Random random = new Random();

        while (true) {
            int numero = 10000 + random.nextInt(90000); // Gera números entre 10000 e 99999
            if (!numerosDeConta.contains(numero)) { // verifica se o numero se repete
                numerosDeConta.add(numero); // armazena o numero unico no HashSet
                return numero;
            }
        }
	}
}

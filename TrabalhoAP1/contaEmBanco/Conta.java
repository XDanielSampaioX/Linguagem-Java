package exercicios.TrabalhoAP1.contaEmBanco;

import java.util.Random;

public class Conta {

    private int numeroConta;
    private double saldoConta;
    private String nomeCliente;
    private boolean status;

    // Getters e Setters
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

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Conta(String nomeCliente, double saldoConta) {
        this.numeroConta = new Random().nextInt(64) * 128;
        this.nomeCliente = nomeCliente;
        this.saldoConta = saldoConta;
        this.status = false;
    }

    @Override
    public String toString() {
        return "Nome cliente: " + nomeCliente + "nº conta: " + numeroConta + ", Saldo: " + saldoConta + " ,Status: " + this.status;
    }
}

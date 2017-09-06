package br.com.caelum.contas.modelo;

public class Conta {

	private String titular;
	private int numero;
	private double saldo;

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public void saca(double valor) throws SaldoInsuficienteException {
		if (valor < 0) {
			throw new IllegalArgumentException("Valor negativo!");
		}

		if (saldo <= valor) {
			throw new SaldoInsuficienteException("Saldo insuficiente!");
		}

		this.saldo -= valor;
	}
}

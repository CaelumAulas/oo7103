package br.com.caelum.contas.modelo;

/**
 * Classe que gerencia as contas do sistema
 * 
 * @author Lucas Felix
 *
 */
public class Conta {

	private String titular;
	private int numero;
	private String agencia;
	private double saldo;
	private String dataDeAbertura;

	public Conta(String titular) {
		this.titular = titular;
	}

	public Conta() {
	}

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

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getDataDeAbertura() {
		return dataDeAbertura;
	}

	public void setDataDeAbertura(String dataDeAbertura) {
		this.dataDeAbertura = dataDeAbertura;
	}

	/**
	 * Metodo que recupera o saldo da conta
	 * 
	 * @return O valor do saldo
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * Método que deposita um valor no saldo
	 * 
	 * @param valor O valor a ser depositado
	 */
	public void deposita(double valor) {
		this.saldo += valor;
	}

	// comentario
	public void saca(double valor) {

		if (this.saldo >= valor) {
			this.saldo -= valor;

		}
	}
}

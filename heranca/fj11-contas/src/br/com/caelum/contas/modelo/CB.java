package br.com.caelum.contas.modelo;

public class CB {

	private double total;
	
	public void adiciona(Funcionario alguem) {
		total += alguem.getBonificacao();
	}
	
	public double getTotal() {
		return total;
	}
}

package br.com.caelum.contas.modelo;

public class Secretario extends Funcionario {

	private String telefone;
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getTelefone() {
		return telefone;
	}

	@Override
	public double getBonificacao() {
		return 1000;
	}
}

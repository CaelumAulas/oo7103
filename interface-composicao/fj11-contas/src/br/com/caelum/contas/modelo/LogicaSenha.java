package br.com.caelum.contas.modelo;

public class LogicaSenha {

	private String senha;
	
	public boolean fazAutenticacao(String senha) {
		if(senha == this.senha) {
			return true;
		}
		
		return false;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
}

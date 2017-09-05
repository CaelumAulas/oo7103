package br.com.caelum.contas.modelo;

public abstract class FuncionarioComSenha extends Funcionario {

	private String senha;
	
	public boolean autentica(String senha) {
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

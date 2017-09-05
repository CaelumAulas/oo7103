package br.com.caelum.contas.modelo;

public class Gerente extends Funcionario implements Autenticavel {

	private LogicaSenha logicaSenha = new LogicaSenha();

	@Override
	public double getBonificacao() {
		return 10000;
	}

	@Override
	public boolean autentica(String senha) {
		return this.logicaSenha.fazAutenticacao(senha);
	}

	public String getSenha() {
		return logicaSenha.getSenha();
	}

	public void setSenha(String senha) {
		logicaSenha.setSenha(senha);
	}

}

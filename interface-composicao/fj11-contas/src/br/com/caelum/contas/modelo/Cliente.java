package br.com.caelum.contas.modelo;

public class Cliente implements Autenticavel {

	private String nome;
	private LogicaSenha logicaSenha = new LogicaSenha();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public boolean autentica(String senha) {
		boolean retorno = logicaSenha.fazAutenticacao(senha);
		return retorno;
	}

	public String getSenha() {
		return logicaSenha.getSenha();
	}

	public void setSenha(String senha) {
		logicaSenha.setSenha(senha);
	}
}

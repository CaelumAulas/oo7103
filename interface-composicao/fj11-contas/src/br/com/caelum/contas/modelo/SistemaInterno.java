package br.com.caelum.contas.modelo;

public class SistemaInterno {

	public void login(Autenticavel alguem) {
		
		String senha = "blah";// receber do teclado
		if(alguem.autentica(senha)) {
			System.out.println("Legal, senha correta");
		}
	}
}

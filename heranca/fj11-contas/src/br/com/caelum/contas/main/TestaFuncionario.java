package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.CB;
import br.com.caelum.contas.modelo.Funcionario;
import br.com.caelum.contas.modelo.Gerente;
import br.com.caelum.contas.modelo.Secretario;

public class TestaFuncionario {

	public static void main(String[] args) {
		
		Funcionario joao = new Funcionario();
		joao.setNome("Joao");
		joao.setSalario(1500);
		
		Funcionario jose = new Gerente();
		jose.setNome("José");
		jose.setSalario(5000);
		// jose.setSenha("123");
				
		Funcionario jeferson = new Secretario();
		jeferson.setSalario(4500);
		
		CB cb = new CB();
		cb.adiciona(joao);
		cb.adiciona(jose);
		cb.adiciona(jeferson);
		
		System.out.println(cb.getTotal());
	}
}

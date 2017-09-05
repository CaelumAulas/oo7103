package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Cliente;
import br.com.caelum.contas.modelo.Funcionario;
import br.com.caelum.contas.modelo.Gerente;
import br.com.caelum.contas.modelo.Secretario;
import br.com.caelum.contas.modelo.SistemaInterno;

public class TestaFuncionario {

	public static void main(String[] args) {
		
		Funcionario joao = new Secretario();
		joao.setNome("Joao");
		joao.setSalario(1500);
		
		Gerente jose = new Gerente();
		jose.setNome("José");
		jose.setSalario(5000);
		jose.setSenha("798");
					
		Cliente ana = new Cliente();
		ana.setNome("Ana");
		
		SistemaInterno si = new SistemaInterno();
		si.login(jose);
		si.login(ana);
		
		System.out.println(jose.getSenha());
	}
}

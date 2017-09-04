package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Conta;

public class TestaConta {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.setTitular("Rafael");
		conta.deposita(500.5);
		conta.saca(300.5);
		
		short s = 100;
		
		int a = 10;
		int b = a++;
		
		System.out.println(b);
		System.out.println(a);
		
		System.out.println(conta.getSaldo());
	}
}

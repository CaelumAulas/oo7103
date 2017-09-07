package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Conta;

public class Teste {

	public static void main(String[] args) {

		Conta c1 = new Conta();
		c1.setTitular("Ana");
		c1.deposita(1500);
			
		Conta c2 = new Conta();
		c2.setTitular("Ana");
		c2.deposita(1500);
		
		if (c1.equals(c2)) {
			System.out.println("Iguais");
		} else {
			System.out.println("Diferentes");
		}
	}
}

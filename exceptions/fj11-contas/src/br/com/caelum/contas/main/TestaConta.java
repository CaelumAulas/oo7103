package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.CaixaEletronico;
import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.SaldoInsuficienteException;

public class TestaConta {

	public static void main(String[] args) {
		CaixaEletronico cx = new CaixaEletronico();

		Conta contaAna = new Conta();
		contaAna.setTitular("Ana");
		contaAna.setNumero(123);
		contaAna.deposita(1500);

		Conta contaJeferson = new Conta();
		contaJeferson.setTitular("Jeferson");
		contaJeferson.setNumero(567);
		contaJeferson.deposita(1000);

		double valor = 20000;

		try {
			contaJeferson.saca(valor);
			cx.emite(valor);
		} catch (SaldoInsuficienteException e) {
			System.err.println(e.getMessage());
		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}

		System.out.println("Saldo final: " + contaJeferson.getSaldo());
		System.out.println("Até logo!");

	}

}

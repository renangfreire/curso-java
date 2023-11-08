package com.renan.cursojava.exercicios25;

public class TesteContaCorrente {

	public static void main(String[] args) {

		ContaCorrente contaRenan = new ContaCorrente();
		contaRenan.nmConta = 546;
		contaRenan.saldo = 240;
		contaRenan.contaEspecial = true;
		contaRenan.limite = 400;
		
		
		System.out.println("Voce possui um saldo de R$" + contaRenan.saldo);
		contaRenan.situacaoLimite();
		
		
		contaRenan.saque(200);
		System.out.println("Voce possui um saldo de R$" + contaRenan.saldo);
		
		contaRenan.deposito(210);
		System.out.println("Voce possui um saldo de R$" + contaRenan.saldo);
		
		contaRenan.saque(300);
		System.out.println("Voce possui um saldo de R$" + contaRenan.saldo);

		
	}

}

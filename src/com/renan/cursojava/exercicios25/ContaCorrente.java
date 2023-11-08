package com.renan.cursojava.exercicios25;

public class ContaCorrente {
	int nmConta;
	double saldo;
	boolean contaEspecial;
	double limite;
	
	void situacaoLimite() {
		System.out.printf("Cliente possui um limite de R$ %.2f \n", limite);
	}
	
	void saque(double valorRetirado) {
		if(saldo < valorRetirado) {
			System.out.println("Sem saldo, safado");
			return;
		}
		saldo -= valorRetirado;
		System.out.printf("Saque de R$ %.2f realizado com sucesso \n", valorRetirado);
		return;
	}
	
	void deposito(double valorDepositado) {
		saldo += valorDepositado;
		System.out.printf("Deposito no Valor de R$ %.2f realizado com sucesso \n", valorDepositado);
	}
	
	double consultaSaldo() {
		return saldo;
	}
}

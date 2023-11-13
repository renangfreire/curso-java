package com.renan.cursojava.exercicios28;

public class TestarContaCorrente {

	public static void main(String[] args) {

		ContaCorrente conta1 = new ContaCorrente();
		
		conta1.depositarDinheiro(2000);
		
		conta1.getSaldo();
		
		conta1.realizarSaque(500);
		conta1.getSaldo();
		
		conta1.realizarSaque(2000);
		conta1.getSaldo();
		
		
	}

}

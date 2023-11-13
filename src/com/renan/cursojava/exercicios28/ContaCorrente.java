package com.renan.cursojava.exercicios28;


public class ContaCorrente {
	private int numeroConta;
	private double saldo;
	private boolean contaEspecial;
	private double limite;
	
	
	public ContaCorrente() {
		this.numeroConta = this.gerarNovaConta();
		this.saldo = 0;
		this.contaEspecial = false;
		this.limite = 200;
	}
	
	// GET AND SETTERS
	
	public int getNumeroConta() {
		return numeroConta;
	}
	
	public void setNumeroConta(int numero) {
		this.numeroConta = numero;
	}
	
	public void getSaldo() {
		System.out.printf("O saldo da sua conta e R$ %.2f \n", this.saldo);
	}
	
	public boolean isContaEspecial() {
		return contaEspecial;
	}
	
	public void setContaEspecial(boolean contaEspecial) {
		this.contaEspecial = contaEspecial;
	}
	
	public double getLimite() {
		return limite;
	}
	
	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	// METHODS
	
	private int gerarNovaConta() {		
		
		int conta = (int) Math.round(Math.random() * 1000000);
		
		return conta;
	}
	
	public void realizarSaque(double valorSaque) {
		if(this.saldo <= valorSaque) {
			System.out.println("Saque não aprovado!");
			return;
		}
		System.out.printf("Saque de R$ %.2f aprovado com sucesso, realizando saque \n", valorSaque);
		this.saldo -= valorSaque;
	}
	
	public void depositarDinheiro(double valorDeposito) {
		if(valorDeposito <= 0) {
			System.out.println("Valor inválido");
			return;
		}
		this.saldo += valorDeposito;
		System.out.printf("Valor de R$ %.2f, foi depositado com sucesso \n", valorDeposito);
	}
	
	
}

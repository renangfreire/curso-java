package com.renan.cursojava.exercicios13;

import java.util.Scanner;

public class CalculadoraSalario {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		byte horasTrabalhadas, quantDiasTrabalhados;
		double salarioHora, salarioTotal;
		
		System.out.println("Quanto você recebe por hora?");
		salarioHora = scan.nextDouble();
		
		System.out.println("Quantas horas você trabalha por dia?");
		horasTrabalhadas = scan.nextByte();
		
		System.out.println("Quantos dias você trabalhou esse mês?");
		quantDiasTrabalhados = scan.nextByte();
		
		salarioTotal = (horasTrabalhadas * quantDiasTrabalhados) * salarioHora;
		
		System.out.println("Esse mês seu salário é de: " + salarioTotal);
		
	}

}

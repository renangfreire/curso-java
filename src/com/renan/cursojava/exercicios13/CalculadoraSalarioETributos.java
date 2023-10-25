package com.renan.cursojava.exercicios13;

import java.util.Scanner;

public class CalculadoraSalarioETributos {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int horasTrabalhadas;
		double salarioHora, salarioBruto, impostoRenda, inss, sindicato, descontosTotal, salarioLiquido;
		
		System.out.println("Bem vindo a calculadora de renda mensal, considerando já os tributos.");
		System.out.println("Quantas horas você trabalhou nesse mes?");
		horasTrabalhadas = scan.nextInt();
		
		System.out.println("Quanto você recebe por hora trabalhada?");
		salarioHora = scan.nextDouble();
		
		salarioBruto = horasTrabalhadas * salarioHora;
		//Calculando Tributos
		impostoRenda = salarioBruto * 0.11;
		inss = salarioBruto * 0.08;
		sindicato = salarioBruto * 0.05;
		descontosTotal = impostoRenda + inss + sindicato;
		
		salarioLiquido = salarioBruto - descontosTotal;
		
		System.out.printf("O seu salario bruto de %.2f, aplicando os tributos, liquido fica de %.2f", salarioBruto, salarioLiquido);
		System.out.println("O total dos descontos e de: " + descontosTotal);
		System.out.println("O imposto sobre a renda foi de:  " + impostoRenda);
		System.out.println("O INSS foi de: " + inss);
		System.out.println("O sindicato foi de: " + sindicato);
		
		scan.close();
		
		
	}
}

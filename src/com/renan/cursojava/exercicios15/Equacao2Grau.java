package com.renan.cursojava.exercicios15;

import java.util.Scanner;

public class Equacao2Grau {

	public static void main(String[] args) {
		//Objetivo => fazer o calculo da mesma forma que o prof Gaspar ensina
		//Sem Delta e com prevenção a erros.
		
		Scanner scan = new Scanner(System.in);
		
		double entA, entB, entC;
		double varA, varB, varC, varBNegative = 0, result1, result2;
		
		
		System.out.println("Bem vindo a calculadora de equacao de segundo grau!");
		System.out.println("Digite o valor de A");
		entA = scan.nextDouble();
		
		if(entA == 0) {
			System.out.println("Isso não é uma equação de segundo grau!");
			return;
		}
		
		System.out.println("Digite o valor de B");
		entB = scan.nextDouble();
		
		System.out.println("Digite o valor de C");
		entC = scan.nextDouble();	
		
		varA = entA;
		varB = entB;
		varC = entC;
		
		if(varA != 1) {
			varB/= entA;
			varC /= entA;
			varA = 1;
		}
		
		if(varB < 0) {
			varBNegative = varB;
			varB *= -1;
		}
		
		if(varB/2 == Math.sqrt(varC)) {
			double result = Math.sqrt(varC);
			
			System.out.println("A equação só possui uma resposta => x = " + result);
			
		} else if(varB/2 > Math.sqrt(varC) || varC < 0) {
			double rightCalc = Math.sqrt(Math.pow((varB/2), 2) - varC);
			
			if(varBNegative < 0) {
				result1 = varB/2 + rightCalc;
				result2 = varB/2 - rightCalc;
			} else {
				result1 = -varB/2 + rightCalc;
				result2 = -varB/2 - rightCalc;
			}
			
			System.out.printf("A equação possui duas raízes: \nx1 = %.2f \nx2 = %.2f", result1, result2);
			
		} else {
			System.out.println("A equacao não possui raizes reais.");
		}
		
		scan.close();
	}

}

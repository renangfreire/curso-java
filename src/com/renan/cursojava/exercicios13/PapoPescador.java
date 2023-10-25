package com.renan.cursojava.exercicios13;

import java.util.Scanner;

public class PapoPescador {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double pesoLimite = 50;
		double pesoPescado, limiteExcedido, multa;
		
		System.out.println("Quantos quilos foram pescados hoje?");
		pesoPescado = scan.nextDouble();
		
		if(pesoPescado > pesoLimite) {
			limiteExcedido = pesoPescado - pesoLimite;
			multa = limiteExcedido * 4;
			
			System.out.printf("Hoje voc excedeu o peso em %.2f kg, e recebeu uma multa de R$ %.2f", limiteExcedido, multa);
		} else {
			System.out.println("Hoje estamos dentro do limite do regulamento, tenha um Bom dia!");
		}

		scan.close();
	
	}
}

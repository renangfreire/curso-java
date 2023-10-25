package com.renan.cursojava.exercicios13;

import java.util.Scanner;

public class LojaTintas {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		
		double metrosQuadrados, valorTotal;
		int tintasNecessarias;
		int lataLitros = 18;
		double valorLata = 80;
		double coberturaTintaLata = 54; // Quantos m uma luta pinta
		
		System.out.println("Quantos metros você deseja pintar?");
		metrosQuadrados = (int) Math.ceil(scan.nextDouble());
		
		tintasNecessarias = (int) Math.ceil(metrosQuadrados / coberturaTintaLata);
		valorTotal = tintasNecessarias * valorLata;
		
		System.out.printf("Para pintar uma area de %.0f metros quadrados \nvoce precisara de no minimo %d latas de tinta. \nsaindo um total de R$ %.2f", metrosQuadrados, tintasNecessarias, valorTotal);
		
	}

}

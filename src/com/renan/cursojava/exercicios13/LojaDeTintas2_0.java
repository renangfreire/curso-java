package com.renan.cursojava.exercicios13;

import java.util.Scanner;

public class LojaDeTintas2_0 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double litrosNecessarios;
		int metrosPintar;
		int coberturaTinta = 6; //Cobertura por L Tinta
		int valorLata = 80, valorGalao = 25;
		double volumeLata = 18, volumeGalao = 3.5;
		double coberturaLata = coberturaTinta * volumeLata; // 108
		double coberturaGalao = coberturaTinta * volumeGalao; // 21
		
		System.out.println("Quantos metros voce deseja pintar?");
		metrosPintar = (int) Math.ceil(scan.nextDouble());
		
		double latasNecessarias = metrosPintar / coberturaLata;
		int latasInt = (int) latasNecessarias;

		
		if(latasNecessarias > latasInt) {
			double areaRestante = (latasNecessarias - latasInt) * coberturaLata;
			int galoesNecessarios =  (int) Math.ceil(areaRestante / coberturaGalao);
			
			if(galoesNecessarios >= 3) {
				latasInt++;
				
				double valorTotal = latasInt * valorLata;
				
				System.out.printf("Compensa mais voce somente pegar latas sendo %d latas, totalizando R$ %.2f", latasInt, valorTotal);
			} else {
				double valorTotal = (latasInt * valorLata) + (galoesNecessarios * valorGalao);
				
				System.out.printf("Sera necessarios voce pegar %d latas e %d galoes, totalizando R$ %.2f", latasInt, galoesNecessarios, valorTotal);
			}
			
		} else {
			double valorTotal = latasInt * valorLata;
			System.out.printf("Voce precisara de somente %d latas, totalizando R$ %.2f", latasInt, valorTotal);
		}
		
		scan.close();	
	}
}

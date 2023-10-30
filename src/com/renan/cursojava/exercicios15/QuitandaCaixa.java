package com.renan.cursojava.exercicios15;

import java.util.Scanner;

public class QuitandaCaixa {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		double precoMorango = 2.5, precoMaca = 1.8;
		double descontoMorango = 0.2, descontoMaca = 0.3;
		double descontoCompra = 0.1; // desconto sob compra => 10%
		
		double pesoMorango, pesoMaca, valorTotal = 0, pesoTotal = 0, valorMaca = 0, valorMorango = 0;
		
		System.out.println("Bem-vindo a Quitanda Joãozitos");
		System.out.println("Você comprou Morango? Se sim, quantos kgs? 0 = não");
		pesoMorango = scan.nextDouble();
		
		System.out.println("Você comprou Maça? Se sim, quantos kgs? 0 = Não");
		pesoMaca = scan.nextDouble();
		
		if(pesoMorango > 0) {
			pesoTotal += pesoMorango;
			if(pesoMorango > 5) {
				valorMorango = pesoMorango * (precoMorango - descontoMorango);
				valorTotal += valorMorango;
			} else {
				valorMorango = pesoMorango * precoMorango;
				valorTotal += valorMorango;
			}
		}
		if(pesoMaca > 0) {
			pesoTotal += pesoMaca;
			if(pesoMaca > 5) {
				valorMaca = pesoMaca * (precoMaca - descontoMaca);
				valorTotal += valorMaca;
			} else {
				valorMaca = pesoMaca * precoMaca;
				valorTotal += valorMaca;
			}
		}
		
		if(pesoTotal < 0) {
			System.out.println("Obrigado pela prefêrencia, até logo");
			return;
		}
		
		
		if(pesoTotal >= 8 || valorTotal > 25.00) {
			valorTotal -= (valorTotal*descontoCompra);
		}
		
		System.out.println("Recibo da compra: \n");
		if(pesoMaca > 0) {
			System.out.printf("Você comprou %.2f kgs de Maça, totalizando: R$ %.2f \n", pesoMaca, valorMaca);
		}
		if(pesoMorango > 0) {
			System.out.printf("Voce comprou %.2f kgs de Morango, totalizando: R$ %.2f \n", pesoMorango, valorMorango);
		}
		
		System.out.printf("A compra totalizou %.2f kgs, totalizando: R$ %.2f \n", pesoTotal, valorTotal);
	}

}

package com.renan.cursojava.exercicios15;

import java.util.Scanner;

public class PostoDescontos {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		
		double precoAlcool = 1.90;
		double precoGasolina = 2.5;
		double litrosAbastecer, valorTotal, desconto, valorDesconto;
		double descontoAbaixo20G = 0.04, descontoAcima20G = 0.06;
		double descontoAbaixo20A = 0.03, descontoAcima20A = 0.05;
		char escolhaUser;
		
		System.out.println("Bem vindo ao posto do Muringa");
		System.out.println("Qual combustível deseja colocar hoje? - G = Gasolina ou A = Alcool");
		escolhaUser = scan.next().trim().toUpperCase().charAt(0);
		
		switch(escolhaUser) {
		case 'G':
			System.out.println("Estamos com uma promoção: abaixo de 20 litros 4% de desconto e acima de 20 são 6%.");
			System.out.println("Quantos litros deseja abastecer?");
			litrosAbastecer = scan.nextDouble();
			
			if(litrosAbastecer < 0) {
				System.out.println("Valor incorreto, tente novamente!");
				break;
			}
			
			valorTotal = (litrosAbastecer * precoGasolina);
			
			if(litrosAbastecer > 20) {
				desconto = valorTotal * descontoAcima20G;
				valorDesconto = valorTotal - desconto;
				System.out.printf("Com o desconto de %.0f%% saiu R$ %.2f", (descontoAcima20G * 100), valorDesconto);
			} else {
				desconto = valorTotal * descontoAbaixo20G;
				valorDesconto = valorTotal - desconto;
				System.out.printf("Com o desconto de %.0f%% saiu R$ %.2f", (descontoAbaixo20A * 100), valorDesconto);
			}
			
			break;
		case 'A':
			System.out.println("Estamos com uma promoção: abaixo de 20 litros 3% de desconto e acima de 20 são 5%.");
			System.out.println("Quantos litros deseja abastecer?");
			litrosAbastecer = scan.nextDouble();
			
			if(litrosAbastecer < 0) {
				System.out.println("Valor incorreto, tente novamente!");
				break;
			}
			
			valorTotal = (litrosAbastecer * precoAlcool);
			
			if(litrosAbastecer > 20) {
				desconto = valorTotal * descontoAcima20A;
				valorDesconto = valorTotal - desconto;
				System.out.printf("Com o desconto de %.0f%% saiu R$ %.2f", (descontoAcima20A * 100), valorDesconto);
			} else {
				desconto = valorTotal * descontoAbaixo20A;
				valorDesconto = valorTotal - desconto;
				System.out.printf("Com o desconto de %.0f%% saiu R$ %.2f", (descontoAbaixo20A * 100), valorDesconto);
			}
			
			break;
		default:
			System.out.println("Opção invalida!, tente novamente");
			break;
		}
		
	}

}

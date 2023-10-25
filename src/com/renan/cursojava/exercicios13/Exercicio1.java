package com.renan.cursojava.exercicios13;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// Os exercicios 1,2,3 são muito fáceis puxei do 4 pra cima
		
		
		Scanner scan = new Scanner(System.in);
		
		double metros, cm;
		
		System.out.println("Bem vindo ao conversor de Metros para cm.");
		System.out.println("Digite quantos metros deseja converter: ");
		metros = scan.nextDouble();
				
		cm = metros * 100;
		
		System.out.println(metros + " metros São " + cm + " centimetros");
		
	}

}

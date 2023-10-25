package com.renan.cursojava.exercicios13;

import java.util.Scanner;

public class CalcularAreaCirculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		double raioCirculo, areaCirculo;
		
		System.out.println("Qual o valor do Raio do circulo");
		raioCirculo = scan.nextDouble();
		
		areaCirculo = Math.PI * Math.pow(raioCirculo, 2);

		System.out.println("O valor da area do circulo é: " + areaCirculo);
		
	}


}

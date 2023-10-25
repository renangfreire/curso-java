package com.renan.cursojava.exercicios13;

import java.util.Scanner;

public class CalcularAreaQuadrado {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		
		double ladoQuadrado, areaQuadrado, dobroArea;
		
		System.out.println("Digite o valor do lado do quadrado: ");
		ladoQuadrado = scan.nextDouble();
		
		
		areaQuadrado = Math.pow(ladoQuadrado, 2);
		dobroArea = areaQuadrado * 2;

		System.out.println("A Area do quadrado é: " + areaQuadrado + " \nE o dobro dessa area é: " + dobroArea);
		
		scan.close();	
	}

}

package com.renan.cursojava.exercicios20;

import java.util.Scanner;

public class ScanOddOrEven {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[][] matrizM = new int[3][3];
		int odd = 0;
		int even = 0;
		
		for(int i = 0; i < matrizM.length; i++) {
			for(int j = 0; j < matrizM.length; j++) {
				System.out.println("Digite um numero inteiro!");
				matrizM[i][j] = scan.nextInt();
			}
		}
		
		for(int i = 0; i < matrizM.length; i++) {
			for(int j = 0; j < matrizM.length; j++) {
				System.out.print(matrizM[i][j] + " ");
				if(matrizM[i][j] % 2 == 0) {
					even++;
				} else {
					odd++;
				}
			}
			System.out.println("");
		}
		
		System.out.println("Quantidade de numeros pares: " + even);
		System.out.println("Quantidade de numeros impares: " + odd);
		
	}

}

package com.renan.cursojava.exercicios19;

import java.util.Scanner;

public class OrdenarNumeros {

	public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	
	int[] vetors = new int[10];
	
	for(int i = 0; i < vetors.length; i++) {
		System.out.println("Digite um numero inteiro");
		vetors[i] = scan.nextInt();
	}
	
	for(int j = 0; j < vetors.length; j++) {
		int aux;
		if(j > vetors.length-1) break;
		for(int i = 0; i < vetors.length; i++) {
			if(vetors[j] < vetors[i]) {
					aux = vetors[i];
					vetors[i] = vetors[j];
					vetors[j] = aux;
			} else {
				continue;
			}
		}
	}
	
	for(int num : vetors) {
		System.out.println(num);
	}
	
	scan.close();
	
	}

}

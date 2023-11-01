package com.renan.cursojava.exercicios19;

public class DescobrirVetorParOuImpar {

	public static void main(String[] args) {

		int[] vetorA = {100, 400, 518, 9872, 711, 871, 905, 671, 403, 257, 651};
		int[] vetorImpar = new int[vetorA.length];
		int[] vetorPar = new int[vetorA.length];
		
		int countPar = 0; // Como não temos o metodo push igual o js, fiz isso. 
		int countImpar = 0;
		
		for(int num: vetorA) {
			if(num % 2 == 0) {
				vetorPar[countPar] = num;
				countPar++;
			} else {
				vetorImpar[countImpar] = num;
				countImpar++;
			}
		}
		
		for(int i = 0; i < vetorA.length; i++) { 
			if(vetorPar[i] == 0 && vetorImpar[i] == 0) break;
			
			System.out.println(i+1 + " Numero Par: " + vetorPar[i]);
			System.out.println(i+1 + " Numero Impar: " + vetorImpar[i] + "\n");
		}
	}

}

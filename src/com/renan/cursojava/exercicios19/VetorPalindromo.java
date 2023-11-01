package com.renan.cursojava.exercicios19;

public class VetorPalindromo {

	public static void main(String[] args) {

		int[] vetorNaoPalindromo = {242, 101, 6776, 98789, 312, 901, 5, 2, 0, 1};
		int[] vetorPalindromo = {101, 454, 98789, 99999, 0, 0, 99999, 98789, 454, 101};
		
		int aux = 0;
		for(int i = 0; i < vetorNaoPalindromo.length; i++) {
			int lastElement = (vetorNaoPalindromo.length-1) - i;
			if(vetorNaoPalindromo[i] == vetorNaoPalindromo[lastElement]) {
				aux++;
			}
			
			if(aux == 5) {
				System.out.println("Esse vetor e um palindromo");
			} else if(i == vetorNaoPalindromo.length-1){
				System.out.println("nao e um panlindromo");
			}
		}
		
		aux = 0;
		for(int i = 0; i < vetorPalindromo.length; i++) {
			int lastElement = (vetorPalindromo.length-1) - i;
			if(vetorPalindromo[i] == vetorPalindromo[lastElement]) {
				aux++;
			}
			
			if(aux == 5) {
				System.out.println("Esse vetor e um palindromo");
				break;
			} else if(i == vetorPalindromo.length-1){
				System.out.println("nao e um panlindromo");
			}
		}
	}

}

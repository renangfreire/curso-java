package com.renan.cursojava.exercicios19;

public class SequenciaFibonacci {

	public static void main(String[] args) {

		int[] sequencia = new int[20];
		sequencia[1] = 1; // inicialização
		
		for(int i = 0; i < sequencia.length; i++) {
			if(i > 1) {
				sequencia[i] = sequencia[i-1] + sequencia[i-2];	
			}
		} 
		
		for(int num : sequencia) {
			System.out.println(num);
		}
	}

}

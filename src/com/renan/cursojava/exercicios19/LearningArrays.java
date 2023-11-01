package com.renan.cursojava.exercicios19;

public class LearningArrays {

	public static void main(String[] args) {

		int[] a = {1, 4};
		int[] b = new int[2];
		
		
		b[0] = 1;
		b[1] = 4;
		
		System.out.println(a[0]);
		
		for(int nm : a) {
			System.out.println(nm); // For quando quero só o conteudo
		}
		
		for(int i = 0; i < a.length; i++) { // For quando quero o index...
			System.out.println(i + " Index"); 
			System.out.println(a[i]);
		}
	}

}

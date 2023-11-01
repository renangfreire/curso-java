package com.renan.cursojava.exercicios20;

public class LearningMatrizes {

	public static void main(String[] args) {

		int[][] matrizM = new int[4][4];
		
		for(int i = 0; i < matrizM.length; i++) {
			for(int j = 0; j < matrizM[i].length; j++) {
				matrizM[i][j] = (int) (Math.random() * 100);
			}
		}
		
		int greatNumber = 0;
		for(int i = 0; i < matrizM.length; i++) {
			for(int j = 0; j < matrizM[i].length; j++) {
				if(greatNumber < matrizM[i][j]) greatNumber = matrizM[i][j];
			}
		}
		
		System.out.println("O maior numero da matriz e: " + greatNumber + "\n");
		
		for(int i = 0; i < matrizM.length; i++) {
			for(int j = 0; j < matrizM[i].length; j++) {
				System.out.print(matrizM[i][j] + " ");
			}
			System.out.println();
		}
	}

}

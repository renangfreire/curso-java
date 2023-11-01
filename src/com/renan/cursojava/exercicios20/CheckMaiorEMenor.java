package com.renan.cursojava.exercicios20;

public class CheckMaiorEMenor {

	public static void main(String[] args) {

		int[][] matrizM = new int[10][10];
		
		for(int i = 0; i < matrizM.length; i++){
			for(int j = 0; j < matrizM[i].length; j++) {
				matrizM[i][j] = (int) (Math.random() * 100);
			}
		}
		int[][] colValues = new int[10][2];
		for(int i = 0; i < matrizM.length; i++) {
			int auxMenor = 100, auxMaior = 0;
			for(int j = 0; j < matrizM[i].length; j++) {
				if(auxMenor > matrizM[i][j]) {
					auxMenor = matrizM[i][j];
				}
				if(auxMaior < matrizM[i][j]) {
					auxMaior = matrizM[i][j];
				}
			}
			colValues[i][0] = auxMenor;
			colValues[i][1] = auxMaior;
		}
		
		for(int i = 0; i < colValues.length; i++) {
				System.out.println("O menor valor da coluna " + i + " e: "+ colValues[i][0]);
				System.out.println("O maior valor da coluna " + i + " e: "+ colValues[i][1]);
		}
		
	}

}

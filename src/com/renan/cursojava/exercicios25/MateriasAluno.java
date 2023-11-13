package com.renan.cursojava.exercicios25;

public class MateriasAluno {
	String nomeMateria;
	double[] notas = new double[3];
	
	public MateriasAluno(String nmMateria) {
		nomeMateria = nmMateria;
	}
	
	
	double mediaFinal() {
		double media = 0;
		
		for(double nota : notas) {
			media += nota;
			
		}
		
		media /= notas.length;
		
		return media;
	};
}

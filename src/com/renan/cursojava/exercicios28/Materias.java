package com.renan.cursojava.exercicios28;

class Materias {
	String nomeMateria;
	String siglaMateria;
	int[] notas;
	boolean statusMateria;
	
	Materias(String nomeMateria, String siglaMateria){
		this.nomeMateria = nomeMateria;
		this.notas = new int[3];
		this.siglaMateria = siglaMateria;
		this.statusMateria = false;
		for (int i = 0; i < notas.length; i++) {
			notas[i] = 0;
		}
	}
	
	public int[] getNotas() {
		return this.notas;
	}
	
	public void setNotas(int[] notas) {
		this.notas = notas;
	}
	
	
}

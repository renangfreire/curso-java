package com.renan.cursojava.exercicios25;

public class Aluno {
	String nome;
	int matricula;
	String cursoMatriculado;
	
	MateriasAluno logica = new MateriasAluno("Logica");
	MateriasAluno ingles1 = new MateriasAluno("Ingles 1");
	MateriasAluno algoritmos = new MateriasAluno("Algoritmos");
	
	MateriasAluno[] materias = {logica, ingles1, algoritmos};

	
	void pesquisarNotasAluno(String materiaPesquisada){
		for(MateriasAluno materia : materias) {
			if(materiaPesquisada != materia.nomeMateria) continue;
			System.out.println("As notas do Aluno: " + nome);
			System.out.println("Segue lista:");
			for(double nota : materia.notas) {
				if(nota == 0) {
					System.out.println("Nota não postada");
				}
				System.out.println("Nota: " + nota);
			}
		}
	}
	
	double pesquisaMediaAluno(String materia) {
		return 0.0;
	}
	
	void postarMediasAluno(String materia, double[] notas) {
		
	}
	
}

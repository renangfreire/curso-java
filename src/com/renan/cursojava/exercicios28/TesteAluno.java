package com.renan.cursojava.exercicios28;

public class TesteAluno {

	public static void main(String[] args) {

		Aluno aluno1 = new Aluno("Renan", "ADS");
		int[] notasAluno1 = {10, 6, 5};
		int[] notas2Aluno1 = {5, 5, 5};
		
		aluno1.getMateriasMatriculadas();
		aluno1.postNotasAluno(notasAluno1, "MADS");
		aluno1.postNotasAluno(notas2Aluno1, "ADMG");
		
		aluno1.getNotasAluno("MADS");
		aluno1.getMediaAluno("MADS");
		aluno1.getStatusMateria("MADS");
		
		System.out.println("---------------------------");
		
		aluno1.getNotasAluno("ADMG");
		aluno1.getMediaAluno("ADMG");
		aluno1.getStatusMateria("ADMG");
		
	}

}

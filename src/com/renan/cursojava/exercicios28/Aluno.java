package com.renan.cursojava.exercicios28;

public class Aluno {

	private String nomeAluno;
	private int matricula;
	private String cursoMatriculado;
	private Materias[] materias ;
	private boolean statusAluno;
	
	public Aluno(String nomeAluno,String cursoMatriculado) {
		this.nomeAluno = nomeAluno;
		this.statusAluno = false;
		switch(cursoMatriculado) {
		case "ADS": 
			this.createAlunoADS();
		break;
		default: System.out.println("Erro");
		}
	}
	
	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCursoMatriculado() {
		return cursoMatriculado;
	}

	public void setCursoMatriculado(String cursoMatriculado) {
		this.cursoMatriculado = cursoMatriculado;
	}

	public boolean isStatusAluno() {
		return statusAluno;
	}

	public void setStatusAluno(boolean statusAluno) {
		this.statusAluno = statusAluno;
	}
	
	
	private void createAlunoADS() {
		Materias matematicaDiscreta = new Materias("Matematica Discreta", "MADS");
		Materias ingles1 = new Materias("Ingles 1", "ING1");
		Materias admGeral = new Materias("Administracao Geral", "ADMG");
		
		this.materias = new Materias[]{matematicaDiscreta, ingles1, admGeral};
	}
	
	public void getMateriasMatriculadas() {
		for(Materias materia : this.materias) {
			System.out.println("Aluno matriculado em " + materia.nomeMateria + " - Sigla: " + materia.siglaMateria);
		}
	}
	
	public void postNotasAluno(int[] notas, String siglaMateria) {
		for(Materias materia : this.materias) {
			if(materia.siglaMateria != siglaMateria) continue;
			
			materia.notas = notas;
			System.out.println("Notas postadas com sucesso!");
		}
	}
	
	public void getNotasAluno(String siglaMateria) {
		for(Materias materia: this.materias) {
			if(materia.siglaMateria != siglaMateria) continue;
			
			System.out.println("Notas do aluno na materia de " + materia.nomeMateria);
			
			for(int i = 0; i < materia.notas.length; i++) {
				System.out.println("Nota: " + materia.notas[i]);
			}
			
			System.out.println("Fim!");
		}
		
	}
	
	public void getMediaAluno(String siglaMateria) {	
		for(Materias materia : this.materias) {
			if(materia.siglaMateria != siglaMateria) continue;
			
			double totalNotas = 0;
			
			System.out.printf("Calculando Media em %s... \n", materia.nomeMateria);
			
			for(int i = 0; i < materia.notas.length; i++) {
				totalNotas+= materia.notas[i];
			}
			
			if(totalNotas == 0) {
				System.out.println("Erro, nenhuma nota foi postada ainda!");
				break;
			}
			
			double media = totalNotas / materia.notas.length;
			materia.statusMateria = media > 6 ? true : false;
			
			System.out.printf("Media total do Aluno em %s e igual a %.1f \n", materia.nomeMateria, media);
		}
	}
	
	public double getMediaAluno(String siglaMateria, boolean statusMessage) {	
		for(Materias materia : this.materias) {
			if(materia.siglaMateria != siglaMateria) continue;
			
			double totalNotas = 0;
			
			for(int i = 0; i < materia.notas.length; i++) {
				totalNotas+= materia.notas[i];
			}
			
			double media = totalNotas / materia.notas.length;
			materia.statusMateria = media > 6 ? true : false;
			
			if(statusMessage == false) return media;
		}
		return 0.0;
	}
	
	public void getStatusMateria(String siglaMateria) {
		for(Materias materia : this.materias){
			if(siglaMateria != materia.siglaMateria) continue;
			
			System.out.println("Verificando status na materia");
			if(getMediaAluno(siglaMateria, false) == 0) {
				System.out.println("Por enquanto reprovado, possivelmente as notas dessa materia ainda nao foram postadas!");
				break;
			}	
			
			
			String statusMateria = materia.statusMateria ? "Aprovado" : "Reprovado";
			
			System.out.printf("O aluno, na materia de %s esta %s \n", materia.nomeMateria, statusMateria);
		}
	}
}

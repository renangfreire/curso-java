package com.renan.cursojava.exercicios24;

public class Mercado {

	public static void main(String[] args) {

		Lampada lampada = new Lampada();
		
		Livro responsabilidadeExtrema = new Livro();
		responsabilidadeExtrema.autor = "Jocko Willink & Leif babin";
		responsabilidadeExtrema.editora = "Alta Books";
		responsabilidadeExtrema.idadeMin = 0;
		responsabilidadeExtrema.idioma = "Portugues";
		responsabilidadeExtrema.numPags = 354;
		responsabilidadeExtrema.preco = 66.40;
		responsabilidadeExtrema.sinopse = "Gigante";
		
		System.out.println(lampada.emEstoque);
		
		System.out.println(responsabilidadeExtrema.preco);
		System.out.println(responsabilidadeExtrema.emprestado);
		
	}

}

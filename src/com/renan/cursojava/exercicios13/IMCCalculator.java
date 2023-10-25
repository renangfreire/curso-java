package com.renan.cursojava.exercicios13;

import javax.swing.JOptionPane;

public class IMCCalculator {

	public static void main(String[] args) {
		// Dei uma pesquisada aqui e não encontrei uma faixa que seria considera peso ideal... vou usar uma margem de 5kg pra baixo e para cima
		
			
		JOptionPane.showMessageDialog(null, "Bem vindo ao calculador do seu sonho ou pesadelo, deseja calcular seu peso ideal? Sim ou sim?");
		
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Para começarmos digite sua altura!").replaceAll(",", ".")); 
		String input = JOptionPane.showInputDialog("Qual seu sexo? M = Masculino ou F = feminino - NÃO EXISTE NÃO BINÁRIO NO SISTEMA!!!!").trim().toUpperCase();;
		
		if(input.charAt(0) == 'M') {
			double pesoIdealHomem = (72.7*altura) - 58;
			JOptionPane.showMessageDialog(null, String.format("O peso ideal seria de: %.2f kg", pesoIdealHomem));
			
			peso(pesoIdealHomem);
		}
		else if(input.charAt(0) == 'F') {
			double pesoIdealMulher = (62.1*altura) - 44.7;
			
		}
		else {
			JOptionPane.showMessageDialog(null, "CARALHO EU DISSE QUE NÃO TEM OPÇÃO NÂO BINÁRIA, tente novamente!");
		}
		
	}
	
	private static void peso(Double pesoIdeal) {
		double pesoAtual = Double.parseDouble(JOptionPane.showInputDialog("Quantos KG você está pesando no momento?").replaceAll(",", "."));
		
		if(pesoAtual < (pesoIdeal-5)) {
			JOptionPane.showMessageDialog(null, "Você está muito magro, deveria aumentar sua dieta calórica");
		} else if(pesoAtual > (pesoIdeal+5)) {
			JOptionPane.showMessageDialog(null, "Você está muito gordo, diminua sua dieta calórica");
		} else {
			JOptionPane.showMessageDialog(null, "Você está no projetinho verão, Parabéns!");
		}
	}

}

package com.renan.cursojava.exercicios25;

public class Lampada {
	boolean statusLampada = false;
	
	void estadoLampada() {
		String stateLampada = statusLampada ? "Ligada" : "Desligada";
		System.out.println("A lampada esta: " + stateLampada);
	}
	
	void toggleLampada(boolean action) {
		statusLampada = action;
		
		String stateLampada = statusLampada ? "Ligada" : "Desligada";
		
		System.out.println("A lampada esta: " + stateLampada);
	}
}

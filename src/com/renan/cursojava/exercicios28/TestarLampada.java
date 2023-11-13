package com.renan.cursojava.exercicios28;

public class TestarLampada {

	public static void main(String[] args) {

		Lampada lamp = new Lampada();
		
		String statusLamp = lamp.getStatusLampada() ? "Ligada" : "Desligada";
		
		System.out.println("A lampada esta " + statusLamp);
		
		lamp.toggleLampada();
		
		statusLamp = lamp.getStatusLampada() ? "Ligada" : "Desligada";
		
		System.out.println("A lampada esta " + statusLamp);
		
		
	}

}

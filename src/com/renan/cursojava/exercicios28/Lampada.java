package com.renan.cursojava.exercicios28;

public class Lampada {
	private boolean statusLampada;
	
	public boolean getStatusLampada() {
		return this.statusLampada;
	}
	
	public void toggleLampada() {
		this.statusLampada = !this.statusLampada;
	}
}

package com.renan.cursojava.exercicios20;

import java.util.Iterator;
import java.util.Scanner;

public class AgendaPessoal {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[][] agendaCompromissos = new int [31][24];
		System.out.println("Bem vindo ao sistema de Agenda!");
		int command;

		do {
			System.out.println("0 - consultar horarios do dia | 1 - marcar horario | 2 - sair");
			command = scan.nextInt();
			switch(command) {
			case 0: {
				System.out.println("Deseja verificar um compromisso para qual dia?");
				int markDia = scan.nextInt() - 1;
				
				for(int i = 0; i < agendaCompromissos.length; i++) {
					int aux = 0;
					if(markDia != i) continue;
					for(int j = 0; j < agendaCompromissos[i].length; j++) {
						aux += agendaCompromissos[i][j];
							if(j == (agendaCompromissos[i].length -1) && aux == 0) {
								System.out.println("Sem compromissos marcados \n \n");
							}
							if(agendaCompromissos[i][j] != 0) {
								System.out.println("Compromisso marcado as " + j);
							}
					}
				}
			}
			break;
			case 1: {
				System.out.println("Deseja marcar um compromisso para qual dia?");
				int markDia = scan.nextInt() - 1;
				
				System.out.println("Deseja marcar um compromisso para qual horario? Hora Inteira!");
				int markHour = scan.nextInt();
				
				for(int i = 0; i < agendaCompromissos.length; i++) {
					if(markDia != i) continue;
					for(int j = 0; j < agendaCompromissos[i].length; j++) {
						if(markHour != j) continue;
						agendaCompromissos[i][j] = 1;
						System.out.println("Compromisso marcado para " + markHour + "h !!! \n");
					}
				}
				break;
			}
			case 2: {
				System.out.println("Muito obrigado, volte sempre!");
				break;
			}
			}
			
		}
		while(command != 2);
		
	}

}

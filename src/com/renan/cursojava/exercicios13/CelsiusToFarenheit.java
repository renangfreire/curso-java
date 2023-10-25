package com.renan.cursojava.exercicios13;

import java.util.Scanner;

public class CelsiusToFarenheit {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int fah, cel;
		
		System.out.println("Bem vindo ao conversor de temperatura, digite 0 para C => F e 1 para F => C");
		int resposta = scan.nextInt();
		if(resposta == 1) {
			System.out.println("Quantos graus celsius está fazendo no momento?");
			cel = scan.nextInt();
			
			fah = (cel * 9/5) + 32;
			
			System.out.println("Convetendo fica: " + fah);
			
		} else {
			System.out.println("Quantos graus Fahrenheit estão fazendo no momento?");
			fah = scan.nextInt();
			
			cel = (5*(fah-32) / 9);
			
			System.out.println("Convertendo para Celsius fica: " + cel);
			
		}
		
		
		scan.close();
		
	}

}

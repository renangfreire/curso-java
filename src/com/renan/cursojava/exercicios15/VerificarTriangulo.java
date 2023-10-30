package com.renan.cursojava.exercicios15;

import java.util.Scanner;

public class VerificarTriangulo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int ladoA, ladoB, ladoC;
		
		System.out.println("Digite o lado A");
		ladoA = scan.nextInt();
		
		System.out.println("Digite o lado B");
		ladoB = scan.nextInt();
		
		System.out.println("Digite o lado C");
		ladoC = scan.nextInt();
		
		
		if(ladoA <= 0 ||
	       ladoB <= 0 || 
	       ladoC <= 0 || 
	       ladoA + ladoB < ladoC ||
	       ladoC + ladoB < ladoA ||
	       ladoC + ladoA < ladoB) {
			System.out.println("Isso não é um triangulo!");
			return;
		}
		
		if(ladoA == ladoB && ladoC == ladoB) {
			System.out.println("Triangulo equilatero");
		} else if(ladoA == ladoB && ladoC != ladoB) {
			System.out.println("Triangulo isosceles");
		} else {
			System.out.println("Triangulo escaleno");
		}
		
		scan.close();
		
	}
}

package javaFundamentosExercicios;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {

		/*
		 * 
		 * Leia um valor inteiro N , apresente o quadrado de cada um dos valores pares
		 * de 1 até N, inclusive N se for o caso a entrada contém um valor inteiro N(5 <
		 * N < 2000) imprima o quadrado de cada um dos valores pares de 1 até N
		 * 
		 */
		
		try (Scanner scan = new Scanner(System.in)) {
			int N;
			int numero;
			
			N = scan.nextInt();
			
			for(numero = 2; numero <= N; numero += 2) {
				System.out.println(numero + " ^ 2 = " + numero * numero);

			}
		}
		
		
	}

}

package javaFundamentosExercicios;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		/*
		 * Leia 4 valores inteiros A, B, C, E D. A seguir , se B for maior do que C e se
		 * D for maior do que A, e a soma de C com D for maior que a soma de A e B e se
		 * C e D ambos forem positivos e se a variável A for par escrever mensagem
		 * “Valores aceitos”, senão “Valores não aceitos.
		 * 
		 */
		
		try (Scanner scan = new Scanner(System.in)) {
			int A;
			int B; 
			int C;
			int D;
			
			/*&& AND
			 * || OR
			 * ! NOT
			 */
			
			A = scan.nextInt();
			B = scan.nextInt();
			C = scan.nextInt();
			D = scan.nextInt();
			
			if((B > C) && (D > A) && (C + D > A + B)&& (C > 0) && (D > 0) && ( A % 2 == 0) ) {
				System.out.println("Valores Aceitos");
			}
			else {
				System.out.println("Valores não Aceitos");
			}
		}
		
		
	}

}

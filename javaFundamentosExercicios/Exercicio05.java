package javaFundamentosExercicios;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		/*
		 * Leia 3 valores de ponto flutuantes e efetue o cálculo das raízes de equação
		 * de Bhaskara. Se não for possível calcular as raízes, mostre a mensagem
		 * correspondente “ impossível calcular”. Caso haja uma divisão por 0 ou raiz de
		 * numero negativo.
		 * 
		 */
		
		try (Scanner scan = new Scanner(System.in)) {
			double A;
			double B;
			double C;
			double R1;
			double R2;
			double delta;
			
			A = scan.nextDouble();
			B = scan.nextDouble();
			C = scan.nextDouble();
			
			delta = B * B - 4 * A * C;
			
			if(delta < 0 || A == 0) {
				System.out.println("Impossivel Calcular");

			}
			else {
				R1 = (- B + Math.sqrt(delta)) / (2 * A);
				R2 = (- B - Math.sqrt(delta)) / (2 * A);
				System.out.printf("R1 = %.5f\n" , R1 );
				System.out.printf("R2 = %.5f\n" , R2 );
			}
		}
				

	}

}

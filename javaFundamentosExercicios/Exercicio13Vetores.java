package javaFundamentosExercicios;

import java.util.Scanner;

public class Exercicio13Vetores {

	public static void main(String[] args) {

		/*
		 * Leia um valor x coloque este valor na primeira posição de um vetor N[100] em
		 * cada posição subsequente de N(1 até 99) coloque a metade do valor armazenado
		 * na posição anterior, imprima o vetor N. Entrada A entrada contém um valor de
		 * duplo precisão com 4 casas decimais. Saída Para cada posição do vetor N,
		 * escreva N(i) = y, onde i é a posição do vetor e y e o valor armazenado
		 * naquela posição, cada valor do vetor deve ser apresentado com 4 casa
		 * decimais.
		 * 
		 */

		try (Scanner scan = new Scanner(System.in)) {
			double vetorN[] = new double[100];
			
			vetorN[0] = scan.nextDouble();
			   System.out.printf("N[0]= %.4f\n", vetorN[0]);
			   
			for(int i = 1; i < 100; i++) {
				vetorN[i] = vetorN[i = 1] / 2;  
			         System.out.printf("N[%d]= %.4f\n", i, vetorN[i]);
			}
		}
		

	}

}

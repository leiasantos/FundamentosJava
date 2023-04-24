package javaFundamentosExercicios;

import java.util.Scanner;

public class Exercicio18Matriz {

	public static void main(String[] args) {

		/*
		 * Um quadrado mistico é uma matriz n x n com entradas inteiras em que a soma de
		 * cada linha e cada coluna é sempre igual a um mesmo valor, faça um programa
		 * que lê uma matriz da entrada padrão e que decide se essa matriz é um quadrado
		 * mistico, ou seja seu programa deve ler um inteiro n representando as
		 * dimensões da matriz , e depois ler as n entradas inteiras da matriz e, a
		 * saída do programa deve ter uma única linha que deve cobtar somente a palavra
		 * SIM ou palavra NÃO.
		 * 3
		 * 4 9 2
		 * 3 5 7
		 * 8 1 6
		 * 
		 * 3
		 * 3 9 3
		 * 3 5 7
		 * 9 1 5
		 * 
		 * 3
		 * 4 2 9
		 * 5 7 3
		 * 6 8 1
		 * 
		 * 5
		 * 1 3 3 3 2
		 * 3 3 2 3 1
		 * 1 2 4 2 3
		 * 4 3 1 1 3
		 * 3 1 2 33
		 * 
		 */

		try (Scanner scan = new Scanner(System.in)) {
			int n = scan.nextInt();
			int e[][] = new int[n][n];
			
			for(int l = 0; l < n; l++) {
				for(int c = 0; c < n; c++) {
					e[l][c] = scan.nextInt();
				}
			}
			
			
			int somaRef = 0;
			for(int c = 0; c < n; c++) {
				somaRef += e[0][c];
			}
			
			boolean qm = true;
			
			for(int l = 1; l < n && qm == true; l++) {
				int somaLinha = 0;
				for(int c = 0; c < n; c++) {
					somaLinha += e[l][c];
				}
				if(somaLinha != somaRef) {
					qm = false;
				}
			}
			
			for(int c = 0; c < n && qm == true; c++) {
				int somaColuna = 0;
				for(int l = 0; l < n; l++) {
					somaColuna += e[l][c];
				}
				if(somaColuna != somaRef) {
					qm = false;
				}
			}
			
			if(qm) {
				System.out.println("SIM");

			}
			else {
				System.out.println("NÃO");

			}
		}

		
	}

}

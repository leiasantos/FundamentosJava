package javaFundamentosExercicios;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {

		/*
		 * Faça um programa que leia um valor N, este N será o tamanho de um vetor x[N]
		 * a seguir leia cada um dos valores de X, encontre o menor elemento deste vetor
		 * e a sua posição dentro do vetor, mostrando esta informação. Entrada A
		 * primeira lina de entrada cotem um unico inteiro N (1 < N < 1000) indicando o
		 * numero de elementos que deverão ser lidos em seguida para o vetor x[N] de
		 * inteiros.A segunda linha contem cada um dos N valores separados por um espaço
		 * Saída A primeira linha apresenta a mensagem menor valor, seguida de um espaço
		 * e do menor valor lido na entrada, a segunda linha apresenta a mensagem
		 * posição seguido de um espaço e da posição do vetor na qual se encontra o
		 * menor valor lido, lembrando que o vetor indica na posição zero.
		 */
		
         try (Scanner scan = new Scanner(System.in)) {
			int X[], N;
			 int menor ;
			 int posMenor = 0;
			 
			 N = scan.nextInt();
			 X = new int[N];
			 
			 for(int pos = 0; pos < X.length; pos++) {
				 X[pos] = scan.nextInt();
			 }
			 
			 menor = X[0];
			 
			 for(int pos = 0; pos < X.length; pos++) {
				 if(X[pos] < menor) {
					 menor = X[pos];
					 posMenor = pos;
				 }
			 }
			 
			 
			 System.out.println("Menor valor: " + menor);
			 System.out.println("Posicao: " + posMenor);
		}

	}

}

package javaFundamentosExercicios;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {

		/*
		 * ao observar a cursva de velocidade de um motor, o engenheiro zé percebeu que
		 * sempre ocorria uma queda quando as medidas eram feitas em intervalos de 10ms,
		 * mas esta queda acontecia em medidas diferentes a cada novo teste do motor. zé
		 * ficou curioso com essa falta de padrão e quer saber para casa teste do motor,
		 * qual a primeira medida em que ocorre uma queda de velocidade. Entrada a
		 * entrada é um teste do motor e é dada em duas linhas, a primeira tem o numero
		 * N de medidas de velocidade do motor(1 < N = 1000) a segunda linha tem N
		 * inteiros, o numero de RPM, R de cada medida(0 s R s10000 para todo R, tal que
		 * 1s N) uma medida é considerada uma queda se é menor que a medida anterior
		 */

		try (Scanner scan = new Scanner(System.in)) {
			int posQueda = 0;
			int N, R[];
			
			
			N = scan.nextInt();
			R = new int[N];
			
			for(int i = 0; i < R.length; i++) {
				R[i] = scan.nextInt();
			}
			
			for (int i=1; i<R.length; i++){
				if (R[i] < R[i-1]){
					posQueda = i+1;
					break;
				}
			}


			System.out.println(posQueda);
		}

	}

}

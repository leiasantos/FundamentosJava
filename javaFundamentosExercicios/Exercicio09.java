package javaFundamentosExercicios;

import java.util.Scanner;

public class Exercicio09 {
	public static void main(String[] args) {

		/*
		 * Leia seis valores, em seguida mostre quanto desses valores digitados foram
		 * positivos, na próxima linha deve-se mostrar a média de todos os valores
		 * positivos digitados com um dígito após o ponto decimal.
		 */
		
		try (Scanner scan = new Scanner(System.in)) {
			float valor;
			float media;
			int contador;
			
			
			media = 0f;
			contador = 0;
			
			for(int i = 1; i <= 6; i++) {
				valor = scan.nextFloat();
				if(valor > 0) {
					media += valor;
					contador++;
				}
			}
     
			media = media / contador;
			System.out.println(contador + "valores positivos");
			System.out.printf("%.1f\n", media);
		}


	}
}

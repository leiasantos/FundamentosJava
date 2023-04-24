package javaFundamentosExercicios;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {

		/*
		 * com base na tabela, escreva um programa que leia o codigo de um item e a
		 * qauntidade deste item. A seguir, calcule e mostre o valor da conta a pagar. 1
		 * cachorro quente R$ 4,00 2 x- tudo R$ 4,50 3 x- bacon R$ 5,00 4 Torrada
		 * simples R$ 2,00 5 Refrigerante R$ 1,50
		 * 
		 */

		try (Scanner scan = new Scanner(System.in)) {
			int qtd;
			int cod;
			float total = 0;

			qtd = scan.nextInt();
			cod = scan.nextInt();

			if (cod == 1) {
				total = qtd * 4.0f;
			} else {
				if (cod == 2) {
					total = qtd * 4.50f;
				} else {
					if (cod == 3) {
						total = qtd * 5.00f;
					} else {
						if (cod == 4) {
							total = qtd * 2.00f;
						} else {
							if (cod == 5) {
								total = qtd * 1.50f;
							}
						}
					}
				}
				System.out.printf("Total: R$ %.2f\n", total);
			}
		}

	}

}

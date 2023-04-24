package javaFundamentosExercicios;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

		/*
		 * Você deve fazer um programa que leia um valor qualquer e apresente uma
		 * mensagem dizendo em qual dos seguintes intervalos (0,25), (25, 50) (50, 75)
		 * (75, 100) este valor se encontra. Obviamente se o valor não estiver em nenhum
		 * destes intervalor devera ser impressa a mensagem fora de intervalo
		 * 
		 */

		try (Scanner scan = new Scanner(System.in)) {
			float numero = scan.nextFloat();

			if (numero >= 0 && numero <= 25.0f) {
				System.out.println("Intervalo [0,25]");
			} else {
				if (numero > 25.0f && numero <= 50.f) {
					System.out.println("Intervalo [25,50]");
				} else {
					if (numero > 50.0f && numero <= 75.0f) {
						System.out.println("Intervalo [50,75]");
					} else {
						if (numero > 75.0f && numero <= 100.0f) {
							System.out.println("Intervalo [75,100]");
						} else {
							System.out.println("fora de intervalo");
						}
					}

				}
			}
		}
	}
}

package javaFundamentos;

import java.util.Scanner;

public class TesteDecisao {

	public static void main(String[] args) {

		try (Scanner scan = new Scanner(System.in)) {
			int valor;

			System.out.println("Digite um valor inteiro");
			valor = scan.nextInt();

			if (valor >= 0) { // se

				System.out.println("É um valor Positivo");

			}
			else {
				System.out.println("É um valor Negativo");

			}
		}

		System.out.println("Fim do Programa");
	}

}

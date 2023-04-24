package javaFundamentos;

import java.util.Scanner;

public class TesteBreakContinue {

	public static void main(String[] args) {

		try (Scanner scan = new Scanner(System.in)) {
			int valor;
			int contador;

			System.out.println("Digite um valor: ");
			valor = scan.nextInt();
			
			contador = 1;
			while(contador <= valor) {
				if(contador == 5) {
					continue;
				}
				System.out.println("Contador = " + contador);
				contador++;
			}
			
			
			

			/*for (contador = 1; contador <= valor; contador++) {
				// System.out.println("Contador = " + contador);
				if (contador == 5) {
					continue;
				}
				System.out.println("Contador = " + contador);
			} */
		}

		System.out.println("Fim do programa");
	}

}

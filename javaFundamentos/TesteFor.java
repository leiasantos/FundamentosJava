package javaFundamentos;

import java.util.Scanner;

public class TesteFor {

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			int valor;
			int contador;
			System.out.println("Digite um valor:");
			
			valor = scan.nextInt();
			System.out.println("Contando de 1 até o valor ----");
			
			for(contador = 1; contador <= valor; contador++) {
				System.out.println("Valor do contador = " + contador);

			}
		}

		
	}

}

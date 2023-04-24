package javaFundamentos;

import java.util.Scanner;

public class TesteWhile {

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			int valor;
			int contador;

			System.out.println("Digite um valor");
			
			valor = scan.nextInt();
			System.out.println("Contando de 1 até chegar no valor -------");
			
			contador = 1;
			while(contador <= valor) {
				System.out.println("Valor do contador = " + contador);
				contador++;
			}
		}
	}

}

package javaFundamentosExercicios;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		/*
		 * Leia um valor de ponto flutuante com duas casas decimais. Este valor
		 * representa um valor monetario. A seguir, calcule o menor numero de notas e
		 * moedas possiveis no qual o valor pode ser decomposto.As notas consideradas
		 * são de 100, 50, 20, 10, 5, 2. As moedas possiveis são de 1, 0,50, 0,25, 0,10,
		 * 0,05, 0,01. A seguir mostre a relação de notas necessarias.
		 */
		
		try (Scanner scan = new Scanner(System.in)) {
			int saqueInteiro, saqueDecimal;
			int qtd100, qtd50, qtd20, qtd10, qtd5, qtd2, qtd1, 
			qtd050, qtd025, qtd010, qtd005, qtd001;
			
			int resto;
			
			double valorSaque;
			valorSaque = scan.nextDouble();
			
			saqueInteiro = (int)valorSaque;
			valorSaque = valorSaque - saqueInteiro;
			
			saqueDecimal = (int)(valorSaque * 100);
			
			qtd100 = saqueInteiro / 100;
			resto = saqueInteiro % 100;
			
			qtd50 = resto / 50;
			resto = resto % 50;
			
			qtd20 = resto / 20;
			resto = resto % 20;
			
			qtd10 = resto / 10;
			resto = resto % 10;
			
			qtd5 = resto / 5;
			resto = resto % 5;
			
			qtd2 = resto / 2;
			resto = resto % 2;
			
			qtd1 = resto / 1;
			resto = resto % 1;
			
			qtd050 = saqueDecimal / 50;
			resto = saqueDecimal % 50;
			
			qtd025 = resto / 25;
			resto = saqueDecimal % 25;
			
			qtd010 = resto / 10;
			resto = saqueDecimal % 10;
			
			qtd005 = resto / 5;
			qtd001 = resto % 5;
			
			System.out.println("NOTAS: ");
			System.out.println(qtd100 + " notas de R$ 100.00");
			System.out.println(qtd50 + " notas de R$ 50.00");
			System.out.println(qtd20 + " notas de R$ 25.00");
			System.out.println(qtd10 + " notas de R$ 10.00");
			System.out.println(qtd5 + " notas de R$ 5.00");
			System.out.println(qtd2 + " notas de R$ 2.00");
			System.out.println(qtd1 + " notas de R$ 1.00");
			
			System.out.println("MOEDAS : ");
			System.out.println(qtd050 + " moedas de R$ 0.50");
			System.out.println(qtd025 + " moedas de R$ 0.25");
			System.out.println(qtd010 + " moedas de R$ 0.10");
			System.out.println(qtd005 + " moedas de R$ 0.05");
			System.out.println(qtd001 + " moedas de R$ 0.01");
			
			
			System.out.println("Valor inteiro do saque = " + saqueInteiro);
			System.out.println("Sobrou = " + valorSaque);
		    System.out.println("Centavos = " + saqueDecimal);
		     
		}
		
		
	}

}

package javaFundamentosExercicios;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		/*
		 * Leia um valor inteiro correspondente a idade de uma pessoa em dias e informe
		 * em anos, meses e dias.
		 * 
		 */
		
		int anosEmDias;
		int qtdAnos, qtdMeses, qtDias;
		int resto;
		
		try (Scanner teclado = new Scanner(System.in)) {
			anosEmDias = teclado.nextInt();
		}
		
		
		qtdAnos = anosEmDias / 365;
		
		resto = anosEmDias % 365;
		
		qtdMeses = resto / 30;
		
		qtDias = resto % 30;
		
		
		System.out.println(qtdAnos + " anos");
		System.out.println(qtdMeses + " meses");
		System.out.println(qtDias + " dias");
		
		
		
		System.out.println("Hello World!");

	}

}

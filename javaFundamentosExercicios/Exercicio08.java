package javaFundamentosExercicios;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {

		/*
		 * leia 2 valores com uma casa decimal(x,y) que devem representar as coordenadas
		 * de um ponto a seguir, determine qual o quadrante ao qual pertence o ponto, ou
		 * se esta sobre um dos eixos cartesianos ou na origem(x = y =0) se o ponto
		 * estiver na origem escreva a mensagem "origem" se o ponto estiver sobre um dos
		 * eixos escreva "eixo x" ou "eixo y", conforme for a situação.
		 */
		
		try (Scanner scan = new Scanner(System.in)) {
			float x;
			float y;
			
			x = scan.nextFloat();
			y = scan.nextFloat();
			
			if(x == 0 && y == 0 ) {
			    System.out.println("Origem");		
			}
			else {
				if(x != 0 && y == 0) {
					System.out.println("Eixo x");	
				}
			else {
				if(x == 0 && y != 0) {
					System.out.println("Eixo y");
				}
			else {
				if(x > 0 && y > 0) {
					System.out.println("Q1");
				}
			else {
				if(x < 0 && y > 0) {
					System.out.println("Q2");
				}
			else {
				if(x < 0 && y < 0) {
					System.out.println("Q3");
				}
			else {
				if(x > 0 && y < 0) {
					System.out.println("Q4");
				  }
			     }
			    }
			   }
			  }
			 }
			}
		}
       }
      }

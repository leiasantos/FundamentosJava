package javaFundamentos;

import java.util.Scanner;

public class DecisoesMultiplas {

	public static void main(String[] args) {

		try (Scanner scan = new Scanner(System.in)) {
			float nota1;
			float nota2;
			float media = 0;

			System.out.println("Digite a primeira NOTA");
			nota1 = scan.nextFloat();

			System.out.println("Digite a segunda NOTA");
			nota2 = scan.nextFloat();
			
			media = (nota1 + nota2) / 2;

			System.out.println("Media final = " + media);
			
			if (media >= 9.0f) {
				     System.out.println("Conceito A");
			} else {
				if (media >= 8.0f) {
					   System.out.println("Conceito B");
			} else {
				if (media >= 7.0f) {
						System.out.println("Conceito C");
			} else {
				if (media >= 6.0f) {
					   System.out.println("Conceito D");
			} else {
					   System.out.println("Conceito E");
					}
				}
			}

		}
	}

}
}

package javaFundamentos;

import java.util.Scanner;

public class TesteSwitch2 {

	public static void main(String[] args) {
		
		
		try (Scanner scan = new Scanner(System.in)) {
			int qtd;
			int cod;
			float total = 0.0f;
			
			qtd = scan.nextInt();
			cod = scan.nextInt();
			
			switch(cod) {
			case 1 :
				total = qtd * 4.0f;
			break;
			
			case 2 :
				total = qtd * 4.50f;
			break;
			
			case 3 :
				total = qtd * 5.0f;
			break;
			
			case 4 :
				total = qtd * 2.0f;
			break;
			
			case 5 :
				total = qtd * 1.50f;
			break;
			}
   System.out.printf("Total: R$ %.2f\n", total);
		}

	}

}

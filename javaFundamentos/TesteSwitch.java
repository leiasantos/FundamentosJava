package javaFundamentos;

import java.util.Scanner;

public class TesteSwitch {

	public static void main(String[] args) {
	
		try (Scanner scan = new Scanner(System.in)) {
			int valor = scan.nextInt();
			
			switch(valor) {
			case 1:
			  System.out.println("Digite o valor 1");
			  break;
			case 2:
			  System.out.println("Digite o valor 2");
			  break;
			case 3:
			  System.out.println("Digite o valor 3");
			  break;
			default:
				System.out.println("Não digitou nem um valor");
			}
		}

	}

}

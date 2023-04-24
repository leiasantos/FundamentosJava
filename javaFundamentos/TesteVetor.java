package javaFundamentos;

import java.util.Scanner;

public class TesteVetor {

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			String vetor[];
			vetor = new String[10];
			
			
			
			System.out.println("Digite 10 strings diferentes");
			for(int pos = 0; pos < vetor.length; pos++) {
				vetor[pos] = scan.nextLine();
			}
			System.out.println("______________________");
			for(int pos = 0; pos < vetor.length; pos++) {
				System.out.println("vetor["+pos+"]= " + vetor[pos]);
			}
		}
	}

}

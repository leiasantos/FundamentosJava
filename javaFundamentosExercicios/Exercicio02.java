package javaFundamentosExercicios;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		/*
		 * Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total
		 * de vendas efetuadas por ele no mês em dinheiro. Sabendo que este vendedor
		 * ganha 15% de comissão sobre suas vendas efetuadas, informar o total e receber
		 * no final do mes com duas casas decimais
		 */
		
		try (Scanner scan = new Scanner(System.in)) {
			
			String nome;
			double salario;
			double vendas;
			double comissao;
			double salarioTotal;
			
			System.out.println("Digite o nome: ");
			nome = scan.nextLine();
			
			System.out.println("Digite o salario: ");
			salario = scan.nextDouble();
			
			System.out.println("Digite o valor das vendas: ");
			vendas = scan.nextDouble();
			
			comissao = vendas * 15 / 100;
			
			salarioTotal = salario * comissao;
			
			
			System.out.println(" Nome: " + nome + " Salario:R$ " + salario + " Vendas: " + vendas);
			System.out.printf("Total = R$ %.2f\n" , salarioTotal);
		}
		
		
	}

}

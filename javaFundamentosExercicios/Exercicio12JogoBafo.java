package javaFundamentosExercicios;

import java.util.Scanner;

public class Exercicio12JogoBafo {

	public static void main(String[] args) {

		/*
		 * Albusn de figurinhas sejam de times de futebol, princesas ou super-herois tem
		 * marcado gerações de crianças e adolescentes. Conseguir completar um album é
		 * uma tarefa muitas vezes ardua envolvendo negociações com colegas para a troca
		 * de figurinhas.Mas a existencia das figurinhas propicia uma outra brincadeira,
		 * que foi muito popular entre crianças no seculo passado, o jogo de bater
		 * figurinhas é muito simple e divertidp, no inicio de uma partida cada criança
		 * coloca em uma pilha um certo numero de figurinhas, uma partida é composta de
		 * rodadas, a cada rodada as crianças batem com a mão sobre a pilha de
		 * figurinhas tentando vira-los com o vacuo formado pelo movimento da mão, as
		 * crianças jogam em turnos até que a pilha de figurinhas esteja vazia, ganha a
		 * partida a criança que conseguir virar mais figurinhas. Aldo e Beto estão
		 * jogando bafo com todas as suas figurinhas e pediram sua ajuda para calcular
		 * quem é o vencedor
		 * 
		 * Tarefa Voce deve escrever um programa que dada a quantidade de figurinhas que
		 * aldo e beto viraram em cada rodada, determine qual dos dois é o vencedor.
		 * Entrada A entrada é compsota de varios casos de teste, cada um correspondendo
		 * a uma partida entre aldo e beto. A primeira linha de um caso de teste contem
		 * um numero inteiro R que indica quantas rodadas ocorreram na partida. Cada uma
		 * das R linhas seguintes contem dois inteiros, A e B, que correspondem
		 * respectivamente, ao numero de figurinhas que aldo e beto conseguiram virar
		 * naquela rodada. Em todos os casos de teste há um único vencedor, ou seja, não
		 * ocorre empate. O final da entrada é indicado por R = 0. A entrada deve ser
		 * lida do dispositivo de entrada padrão.
		 * 
		 * Saída Para cada caso de teste da entrada seu programa deve produzir tres
		 * linhas na saída, a primeira linha deve conter um identificador do caso de
		 * teste no formato Teste n, onde n é numerado sequencialmente a aprtir de 1. a
		 * segunda linha deve conter o nome do vencendor aldo e beto, a terceira linha
		 * deve ser deixada em branco.
		 */
		
           try (Scanner scan = new Scanner(System.in)) {
			int rodadas, teste = 0;
			   int A,B;
			   int totalA, totalB;
			   
			 do {  
			   rodadas = scan.nextInt();
			   
			 if(rodadas != 0){
				teste++;
				 
			   totalA = 0;
			   totalB = 0;
			   for(int i = 0; i < rodadas; i++) {
			        A = scan.nextInt();
			        B = scan.nextInt();
			        totalA += A;
			        totalB += B;       	
			   }                    
			  System.out.println("Teste " + teste);
			  if(totalA > totalB) {
				  System.out.println("Aldo");
			  }
			  else {
				  System.out.println("Beto");
			  }		  
			    System.out.println("");
			}
			  }while(rodadas != 0);
		}

     }
	}

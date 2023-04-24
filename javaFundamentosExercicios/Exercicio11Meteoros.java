package javaFundamentosExercicios;

import java.util.Scanner;

public class Exercicio11Meteoros {

	public static void main(String[] args) {

		/*
		 * Meteoros Em noites sem nuvens pode-se muitas vezes observar pontos brilhantes
		 * no céu que se deslocam com grande velocidade, e em poucos segundos
		 * desaparecem de vista: são chamadas estrelas cadentes, ou meteoros. Meteoros
		 * são na verdade partículas de poeira de pequenas dimensões que ao penetrar na
		 * atmosfera terrestre, queimam-se rapidamente, normalmente a uma altura entre
		 * 60 e 120 quilômetros. Se os meteoros são suficientemente grandes, podem não
		 * queimar-se completamente na atmosfera e dessa forma atingem a superfície
		 * terrestre: nesse caso são chamados de meteoritos. Zé Felício é um fazendeiro
		 * que adora astronomia e descobriu um portal na internet que fornece uma lista
		 * das posições onde caíram meteoritos. Com base nessa lista, e conhecendo a
		 * localização de sua fazenda. Zé felício deseja saber quantos meteoritos caíram
		 * dentro de sua propriedade. Ele precisa de sua ajuda para escrever um programa
		 * de computador que faça essa verificação automaticamente. Tarefa São dados:
		 * uma lista de pontos no plano cartesiano, onde cada ponto corresponde à
		 * posição onde caiu um meteorito. as coordenadas de um retângulo que delimita
		 * uma fazenda As linhas que delimitam a fazenda são paralelas aos eixos
		 * cartesianos. Sua tarefa é escrever um programa que determine quantos
		 * meteoritos caíram dentro da fazenda, incluindo meteoritos que caíram
		 * exatamente sobre as linhas que delimitam a fazenda.
		 * 
		 * Entrada Seu programa deve ler vários conjuntos de testes. A primeira linha de
		 * um conjuntos de testes quatro números inteiros x1, y1, x2, y2, onde x1,y1 é a
		 * coordenada do canto superior esquerdo e x2,y2 é a coordenada do canto
		 * inferior direito do retângulo que delimita a fazenda. A segunda linha contém
		 * um inteiro, N, que indica o número de meteoritos. Seguem-se N linhas, cada
		 * uma contendo dois números inteiros , correspondendo às coordenadas de cada
		 * meteorito. O final da entrada é indicado por x1 = y1 = x2 = y2 = 0.
		 * 
		 * Saída Para cada conjunto de testes da entrada seu programa deve produzir três
		 * linhas na saída. A primeira linha deve conter um identificador do conjunto de
		 * teste no formato teste n, onde n é numerado a partir de 1. A segunda linha
		 * deve conter o número de meteoritos que caíram dentro da fazenda. A terceira
		 * linha deve ser deixada em branco. A grafia mostrada no exemplo de saída,
		 * abaixo, deve ser seguida rigorosamente.
		 * 
		 * 
		 */

		try (Scanner scan = new Scanner(System.in)) {
			int x1, y1, x2, y2;
			int x, y;
			int N;
			int contador = 0;
			int teste = 0 ;
			
do {
			x1 = scan.nextInt();
			y1 = scan.nextInt();
			x2 = scan.nextInt();
			y2 = scan.nextInt();
			
			if(x1 != 0 || y1 != 0 || x2 != 0 || y2 != 0);{
				teste++;
				N = scan.nextInt();
				
				
			}
			for(int i = 0; i < N; i++) {
				x = scan.nextInt();
				y = scan.nextInt();

			if(x >= x1 && x <= x2 && y >= y2 && y <= y1) {
					contador++;
				}
			}
			System.out.println("Teste " + teste);
			System.out.println(contador);
			System.out.println("");
			
			}
   while(x1 != 0 || y1 != 0 || x2 != 0 || y2 != 0);
		}
		
	}
		
 }
	


	


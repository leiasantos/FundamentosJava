package polimorfismo;

import java.util.Scanner;

public class Prova {

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			QuestaoSimples perguntas[];
			perguntas = new QuestaoSimples[5];
			
			perguntas[0] = new QuestaoSimples("Quem descobriu o Brasil?", "Cabral");
			perguntas[1] = new QuestaoSimples("Qual a cor do cavalo branco de napoleão?", "Branco");
			perguntas[2] = new QuestaoSimples("Quem inventou o computador?","Charles Babbage");
			perguntas[3] = new QuestaoSimples("O primeiro computador eletrônico da história era?","ENIAC" );
			perguntas[4] = new QuestaoSimples("Quantas cores tem o arco-íris?","7 cores");

			int pontos = 0;
			System.out.println("=====PROVA=====");
			for(int i = 0; i < perguntas.length; i++) {
				System.out.println(perguntas[i].aplicarQuestao());
				System.out.println("Sua resposta:");
				String resp = scan.nextLine();
				
				if(perguntas[i].corrigir(resp)) {
					pontos += 2;
					
				}
			}
			
			System.out.println("Sua nota FINAL: " + pontos);
		}

	}

}

package orientacaoObjetosExercicios;

import java.util.Scanner;

public class LojaDeConveniencia {

	public static void main(String[] args) {
	
	try (Scanner scan = new Scanner(System.in)) {
		MaquinaDeRefrigerante m = new MaquinaDeRefrigerante();
			
		int opcao, res;
		float valor;
			
			do {
				System.out.println(m.mostrarInfo());
				System.out.println("Digite 99 para inserir credito");
				System.out.println("Digite -1 para sair");
				System.out.println("Ou digite o número do refri para comprar(0 - 4)");
				
				opcao = scan.nextInt();
				switch(opcao) {
				case 0:
				case 1:
				case 2:
				case 3:
				case 4:
					res = m.comprar(opcao);
					 if(res == 0) {
						 System.out.println("Enjoy");
					 }
			   else if(res == -1) {
						 System.out.println("Saldo Insuficiente. Insira mais R$ "); 
					 }
			    else {
						 System.out.println("Refrigerante em falta, volte mais tarde"); 
					 }
					 break;
				case 99:
					System.out.println("Digite o valor: ");
					valor = scan.nextFloat();
					m.inserirCredito(valor);
					break;
				case -1:
				System.out.println("Obrigado por utilizar a maquina");
				System.out.println("Receba seu troco " + m.solicitarTroco());
				break;
				default:
					System.out.println("Opção Invalida");
					break;
				}
			}while(opcao != -1);
	}
	}
}
	
  



			
	



package manipulacaoDeArquivos;


import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class EscritorDeArquivos {
	
	public static void main(String args []) {
		
		try (Scanner scan = new Scanner(System.in)) {
			
			File tmpArquivo = new File("arquivo.txt");
			FileWriter wtArquivo = new FileWriter(tmpArquivo, true);
		
			int inicio, fim;
			System.out.print("Digite o id inicial: ");
			inicio = scan.nextInt();
			System.out.print("Digite o id final: ");
			fim = scan.nextInt();
			
			for(int tmp = inicio; tmp <= fim; tmp++) {
				Player p = new Player(tmp, "Player_" + tmp, tmp);
				wtArquivo.write(p + "\n");
			}
				
			wtArquivo.close();		
		}
		catch(Exception ex) {
			System.out.println("Erro: " + ex.getMessage());
		}
		
	}

}

package manipulacaoDeArquivos;


import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;


   public class BinWriter {
	
	public static void main(String args[]) {
		
		try {
			File tmpArq = new File("arquivo.bin");
			FileOutputStream fsArq = new FileOutputStream(tmpArq);
			
			ObjectOutputStream obj = new ObjectOutputStream(fsArq);
			
			try (Scanner scan = new Scanner(System.in)) {
				int inicio, fim;
				System.out.print("Digite o id inicial: ");
				inicio = scan.nextInt();
				System.out.print("Digite o id final: ");
				fim = scan.nextInt();
				
				for(int tmp = inicio; tmp <= fim; tmp++) {
					Player p = new Player(tmp, "Player_" + tmp, tmp);
					obj.writeObject(p);
				}
			}
			
			obj.close();
			fsArq.close();
		
		}
		catch(Exception ex) {
			System.out.println("ERRO: " + ex.getMessage());
		}
		
	}

}

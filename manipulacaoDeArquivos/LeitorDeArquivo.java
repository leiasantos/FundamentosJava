package manipulacaoDeArquivos;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;


public class LeitorDeArquivo {
	
	public static void main(String args[]) {
		
		try{
			File tmpArquivo = new File("arquivo.txt");
			FileReader rdArquivo = new FileReader(tmpArquivo);

			BufferedReader br = new BufferedReader(rdArquivo);
			String linha;

			while ( (linha = br.readLine()) != null  ){
				String infos[] = linha.split(";");
				Player p = new Player(Integer.parseInt(infos[0]), infos[1], Float.parseFloat(infos[2]));
				System.out.println("Lido: "+p.showInfo());
			}
			br.close();
			rdArquivo.close();

		}
		catch(Exception ex){
			System.out.println("ERRO:"+ex.getMessage());
		}

	}
}

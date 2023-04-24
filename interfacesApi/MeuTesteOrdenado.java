package interfacesApi;

import java.util.ArrayList;
import java.util.Collections;

public class MeuTesteOrdenado {

	public static void main(String[] args) {
		
		ArrayList<String> listaNomes = new ArrayList<String>();
		
		listaNomes.add("Clara");
		listaNomes.add("Julia");
		listaNomes.add("Aline");
		listaNomes.add("Fernanda");
		listaNomes.add("Natalia");
		listaNomes.add("Pedro");
		listaNomes.add("Carlos");
		listaNomes.add("Felipe");
		
		System.out.println("----Imprimindo a Lista----");
		
		Collections.sort(listaNomes);// ordenar seus valores 
		
		for(String s: listaNomes) {
			System.out.println("Nome = " + s);
		}
	

	}

}

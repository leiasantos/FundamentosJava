package interfacesApi;

import java.util.ArrayList;
import java.util.Collections;

public class TestePlayer {

	public static void main(String[] args) {
		
		
    ArrayList<Player> lista = new ArrayList<Player>();
		
		lista.add(new Player(1, "Thor1234", 100.0f));
		lista.add(new Player(2, "Maximus", 90.0f));
		lista.add(new Player(3, "Caramelo", 50.0f));
		lista.add(new Player(4, "RockyBalboa", 200.0f));
		lista.add(new Player(5, "AewThor", 50.0f));
		
		System.out.println("----Imprimindo a Lista----");
		
		Collections.sort(lista);
		
		for(Player p: lista) {
			System.out.println("Player = " + p);
		}

	}

}

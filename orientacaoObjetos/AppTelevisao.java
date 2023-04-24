package orientacaoObjetos;

public class AppTelevisao {

	public static void main(String[] args) {
		
		
		Televisao t1 = new Televisao();
		Televisao t2 = new Televisao();
		
		t1.marca = "LG";
		t1.ligada = false;
		t1.volume = 6;
		t1.canal = 5;
		
		t2.marca = "Samsung";
		t2.ligada = true;
		t2.volume = 5;
		t2.canal = 15;
		
		
		t1.ligar();
		t1.aumentarVolume();
		t1.trocarCanal();
		
		t2.aumentarVolume();
		t2.trocarCanal();
		t2.ligar();
		

	}

}

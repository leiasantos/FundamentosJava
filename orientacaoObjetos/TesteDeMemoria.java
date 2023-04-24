package orientacaoObjetos;

public class TesteDeMemoria {

	public static void main(String[] args) {
	
		Pessoas p;
		int i = 0;
		do {
			p = new Pessoas(i, "Nome" + i, "Email" + i);
			System.out.print("Criei......");
			p.mostrarInfo();
			i++;
		}while(i < 100000);
		System.gc();
		System.out.println(".      - no final.....");
		p.mostrarInfo();
	}

}

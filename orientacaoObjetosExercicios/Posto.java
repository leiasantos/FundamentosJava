package orientacaoObjetosExercicios;

public class Posto {

	public static void main(String[] args) {
		
		BombaDeCombustivel b1, b2;
		b1 = new BombaDeCombustivel("Gasolina", 4.99f);
		b2 = new BombaDeCombustivel("Etanol" , 2.39f);
		
		b1.puxarGanho();
		b1.abastecerPorLitros(20);
		b1.voltarGancho();
		
		b2.puxarGanho();
		b2.abastecerPorLitros(30);
		b2.voltarGancho();

	}

}

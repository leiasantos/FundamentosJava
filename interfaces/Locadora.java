package interfaces;

public class Locadora {

	public static void main(String[] args) {
		
		Veiculo estoque[];
		
		estoque = new Veiculo[5];
		estoque[0] = new Carro("Celta", "KFG 002", 50f);
		estoque[1] = new Moto("Honda PCX", "JRE 0002", 25f, 5f);
		estoque[2] = new Carro("Celta", "KFG 002", 50f);
		estoque[3] = new Carro("BMW", "WER 005", 250f);
		estoque[4] = new Moto("Kawa Ninja ZX10", "JUIO 0008", 600f, 2f);
		
		for(Veiculo v: estoque) {
			System.out.println("Veiculo v = " + v.getModelo() + " Aluguel = R$ " + v.calcularAluguel(7));
		}
		
	}

}

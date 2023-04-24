package interfaces;

public class Quadriciclo extends Veiculo {
	private float fatorRisco;
	

	
	public Quadriciclo(String modelo, String placa, float fatorRisco, float valorDiaria) {
		super(modelo, placa, valorDiaria);
		this.fatorRisco = fatorRisco;
	}


	public float calcularAluguel(int qtdeDias) {
		return qtdeDias * super.getValorDiaria() + fatorRisco;
	}



}

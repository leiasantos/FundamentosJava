package interfaces;

public abstract class Veiculo {
	
	private String modelo;
	private String placa;
	private float valorDiaria;
	
	

	public Veiculo(String modelo, String placa, float valorDiaria) {
		this.modelo = modelo;
		this.placa = placa;
		this.valorDiaria = valorDiaria;
	}


	public String getModelo() {
		return modelo;
	}


	public String getPlaca() {
		return placa;
	}
	

	public float getValorDiaria() {
		return valorDiaria;
	}

	public void setValorDiaria(float valorDiaria) {
		this.valorDiaria = valorDiaria;
	}
	
	public abstract float calcularAluguel(int qtdeDias);
	
	



}

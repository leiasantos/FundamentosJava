package polimorfismo;

public class ContaEspecial extends Conta {


	private float limite;
	
	public ContaEspecial(String nomeTitular, String cpf, int numeroConta, float saldo) {
		super(nomeTitular, cpf, numeroConta, saldo);
		
	}

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	

	
	
	
}

package orientacaoObjetosExercicios;

public class MaquinaDeRefrigerante {

	private Refrigerante lista[];
	private float credito;
	
	public MaquinaDeRefrigerante() {
		lista = new Refrigerante[5];
		lista[0] = new Refrigerante("Coca cola", 6.50f, 5);
		lista[1] = new Refrigerante("Fanta", 4.50f, 5);
		lista[2] = new Refrigerante("Soda", 5.25f, 5);
		lista[3] = new Refrigerante("Guaraná", 6.00f, 5);
		lista[4] = new Refrigerante("Tubaina", 3.50f, 5);
		this.credito = 0.0f;		
			
	}
	
	public void inserirCredito(float valor) {
		this.credito += valor;
	}
	
	public float solicitarTroco() {
		float troco = this.credito;
		this.credito = 0.0f;
		return troco;
	}
	
	public int comprar(int numRefri) {
		if(this.credito >= lista[numRefri].getPreco()) {
			if(lista[numRefri].getQtde() > 0) {
				this.credito -= lista[numRefri].getPreco();
				int novaQtde = lista[numRefri].getQtde() - 1;
				lista[numRefri].setQtde(novaQtde);
				return 0;
			}
			else {
				return -2;
			}
		}
		else {
			return -1;
		}
	
	}
	
	public String mostrarInfo() {
		String str = "";
		str += "+_____________________________+\n";
		str += "|*** Maquina de Refrigerante ***|\n";
		str += "+_____________________________+\n";
		str += "| Credito R$ : "+ this.credito + "\n";
		str += "+_____________________________+\n";
		
		for(Refrigerante r : lista) {
			str += " | " + r.getNome() + " R$ " + r.getPreco() + "\n";
		}
		
		str +="+_____________________________+\n";
	
		return str;
	}
	
}

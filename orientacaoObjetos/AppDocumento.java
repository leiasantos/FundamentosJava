package orientacaoObjetos;

public class AppDocumento {

	public static void main(String[] args) {
		
		
		Documento d1, d2, d3;
		
		d1 = new Documento(1, "Procuração");
		d2 = new Documento(2, "Contrato" );
		d3 = new Documento(3, "Petição");
		
		d1.exibirDados();
		d1.setStatus(Documento.AGUARDANDO_AUTORIZAÇÃO);
		d1.exibirDados();
		
		
		d2.exibirDados();
		d2.setStatus(Documento.AGUARDANDO_AUTORIZAÇÃO);
		d2.exibirDados();
		
		d3.exibirDados();
		d3.setStatus(Documento.AGUARDANDO_AUTORIZAÇÃO);
		d3.exibirDados();
	}

}

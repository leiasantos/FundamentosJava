package excepJava;

public class MeuBusines {
	
	public static void metodoLancador(String str) throws Exception {
		if(str != null) {
		System.out.println("Teste " + str);
	}	
	else {
		throw new Exception("Vixe deu erro no método");	
	}
	
		}

}

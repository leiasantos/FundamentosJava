package excepJava;

public class TesteExceptions {
	

	public static void main(String[] args) {
		
		try {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = a / b;
		
		System.out.println("Resultado da divisão = " + c);

	}
	 catch(ArrayIndexOutOfBoundsException | NumberFormatException ex) {
		 System.err.println("Por favor, informe dois valores inteiros");
	 }
	catch(ArithmeticException ex) {
		System.err.println("Não da para dividir por zero");
	 }
	catch(Exception ex) {
		System.err.println("Deu ruim");
	}
	
	finally {
		System.out.println("Cheguei no finally");
	}
		
  }
	
}




package javaFundamentos;

public class ExemploDeVariaveis {

	public static void main(String[] args) {

		int a; // ocupa 32 bits (4 bytes) -- valores de 2G a 2 G
		long b; // ocupa 64 bits (8 bytes) -- Valores de -9P A 9P
		short c; // ocupa 16 bits (2 bytes) -- Valores de -32.768 a 32.767
		byte d; // ocupa 8 bits (1 byte) -- Valores de -128 a 127
 
		a = 10;
		b = 8914;
		c = 1000;
		d = 20;
		
		System.out.println("Valor de a = " + a);
		System.out.println("Valor de b = " + b);
		System.out.println("Valor de c = " + c);
		System.out.println("Valor de d = " + d);

	}

}

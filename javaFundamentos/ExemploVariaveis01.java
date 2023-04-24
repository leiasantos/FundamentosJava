package javaFundamentos;

public class ExemploVariaveis01 {

	public static void main(String[] args) {
		
		int a,b,c;
		a = 10;
		b = 3;
		c = a+b;
		
		System.out.println("O valro do a = " + a);
		System.out.println("O valor de b = " + b);
		System.out.println("O valor de c = " + c);
		System.out.println("O valor de a * b = " + a * b);
		System.out.println("O valor de a / b = " + a / b);
		System.out.println("O valor de a % b = " + (a % b));
		System.out.println("O valor de a - b = " + (a - b));
		
		System.out.println("_________________________________");
		System.out.println("");
		
		
		float x ; // float ocupa 32 bits (8 bytes)
		double y ; // double ocupa 64 bits (16 bytes)
		
		x = 1.0F;
		y = 2.0D;
		
		System.out.println("Valor de x = " + x);
		System.out.println("Valor de y = " + y);
		System.out.println("");
		
		
		System.out.println("_________________________________");
		System.out.println("");
		
		boolean b1, b2;
		
		b1 = true;
		b2 = false;
		
		System.out.println("O valor de b1 = " + b1);
		System.out.println("O valor de b2 = " + b2);
		
		System.out.println("_________________________________");
		System.out.println("");
		
		char c1;
		String d1;
		
		c1 = 'x';
		d1 ="Ola mundo" ;
		
		System.out.println("O valor de c1= " + c1);
		System.out.println("O valor de d1= " + d1);
		
		System.out.println("_________________________________");
		System.out.println("");
		
			
	}

}

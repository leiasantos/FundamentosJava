package polimorfismo;

public class TestaCompras {

	public static void main(String[] args) {
		
		Cliente[] clientes;
		clientes = new Cliente[5];
		
		clientes[0] = new Cliente("Clara"," clara@gmail.com",500);
		clientes[1] = new ClienteVip("Bella"," bella@gmail.com",500,300);
		clientes[2] = new Cliente("Pedro"," pedro@gmail.com",300);
		clientes[3] = new Cliente("Julia"," julia@gmail.com",1000);
		clientes[4] = new ClienteVip("Carlos","carlos@gmail.com",1000,500);
		
		for(Cliente c: clientes) {
			System.out.println(c);
		}
		
		System.out.println("================\n");
		
		if(clientes[1].fazerCompra(650)) {
			System.out.println("Conseguiu comprar");
		}
		else {
			System.out.println("Saldo insuficinete");
		}
		System.out.println(clientes[1]);
		
		
		/*
		Cliente c1, c2;
	
		
		c1 = new Cliente("Clara"," clara@gmail.com",500);
		c2 = new ClienteVip("Bela"," bela@gmail.com", 500,300);
		
		System.out.println(c1);
		System.out.println(c2);*/
		
		/*if(v.fazerCompra(650)) {
			System.out.println("Conseguiu comprar");
		}
		else {
			System.out.println("Saldo Insuficiente");
		}
		System.out.println(v);*/
	}

}

package orientacaoObjetos;

public class AppPessoa {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Clara Santos","clarasantos@gmail.com",3000 );
		Pessoa p2 = new Pessoa("Julia silva", 4000);
		
		p1.exibirDados();
		
		
		p1.exibirDados();
		
		p1.aumentarSalario(15);
		
		p2.exibirDados();
		
		
		
	}

}


// modificadores de acesso *private, protected, default
// encapsulamento
// metodos de acesso (gets e sets)
// construtores / sobrecarga dos construtores(porem não restrita a construtores)
// importancia dos gets / sets
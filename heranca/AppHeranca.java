package heranca;

public class AppHeranca {

	public static void main(String[] args) {
		
		Pessoa p = new Pessoa("Clara","clara@gmail.com");
	
		
		Funcionario f = new Funcionario("Bella","bella@gmail.com",5000);
	
		
		System.out.println("Mostrando informações");
		System.out.println("Pessoa:"+p.getNome()+" - " + p.getEmail());
		System.out.println("Funcionario:"+f.getNome()+" - "+f.getEmail()+" - R$"+f.getSalario());
		System.out.println(p);
		System.out.println(f);
	}

}

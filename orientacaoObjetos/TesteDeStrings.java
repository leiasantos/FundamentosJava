package orientacaoObjetos;

public class TesteDeStrings {

	public static void main(String[] args) {

		/*
		 * String s1 = "Oie tudo bem?"; 
		 * String s2 = "Oie tudo bem?";
		 *   IGUAIS
		 */
		
		
		String s1 = new String("Oie tudo bem?");  // comparar endereço de memoria
		String s2 = new String("Oie tudo bem?");
		
		Pessoas p1 = new Pessoas(1,"Clara", "clara@gmail.com");
		Pessoas p2 = new Pessoas(1,"Julia", "julia@gmail.com");
		
		if(p1 == p2) {
			System.out.println("Apontam para objetos local");
		}else {
			System.out.println("Apontam para objetos distintos");
		}if(p1.equals(p2)){
			System.out.println("Pessoas com conteudos iguais");
		}else {
			System.out.println("Pessoas com conteudos distintos");
		}
		
		
		System.out.println("_______________________________________");
		
		
		if(s1 == s2) {
			System.out.println("Apontam para o mesmo local");
		}else {
			System.out.println("Apontam para locais distintos");
		}if(s1.equals(s2)) {
			System.out.println("Iguais lexicograficamente");
		}else {
			System.out.println("Diferentes lexicograficamente");
		}
				
		
		System.out.println("_______________________________________");
		
		System.out.println("HashCode da s1 = "+ s1.hashCode());
		System.out.println("HashCode da s2 = " +s2.hashCode());
		
		System.out.println("HashCode da P1 = " +p1.hashCode());
		System.out.println("HashCode da P2 = " +p2.hashCode());
		
		/* se voce quer ver se apontam para o mesmo lugar na memoria 
		 * deve usar ==.
		 * agora se voce quer ver se o conteudo apontado por eles é 
		 * estruturalmente lexicografico, tem os mesmos valores 
		 * voce usa o equals.
		 * 
		 */

	}

}

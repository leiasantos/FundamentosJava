package lambdaStreams;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class TesteStream {

	public static void main(String args[]) {
		
		List<Integer> List = new ArrayList<Integer>();
		
		
		List = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		List.stream()
		  //.distinct() //elimina as duplicadas
		  //.skip(n) //pula n elementos
		  //.limit(n) //seleciona os n primeiros elementos
		  //.filter(e -> e < 5)
		 .map(e -> e * 10)
		 .forEach(e -> System.out.println(e));
		    
		
		//Long contador =  List.stream()
				//.count();
		//System.out.println("Numero de elementos " + contador);
		   //.forEach(e -> System.out.println("Elemento " + e));
		
		  // System.out.println(List);
		
		Integer soma = List.stream()
				.filter(e -> e % 2 == 0)
				.distinct()
				.mapToInt(Integer::intValue)
				.sum();
		System.out.println("Valor da soma = " + soma);
	}
	
	
}

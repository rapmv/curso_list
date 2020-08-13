package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista {

	public static void main(String[] args) {
		
		List<String> lista = new ArrayList<>();

		
		lista.add("Maria");
		lista.add("Marcos");
		lista.add("Jorge");
		lista.add("Ana");
		lista.add("Bruno");
		lista.add("Jo�o");
		
		//add na posi��o 2
		lista.add(2,"Bob");
		
		//tamanho da lsita
		System.out.println(lista.size());
		
		lista.remove("Ana");
		
		//removendo na posi��o 1;
		lista.remove(1);
		
		//remover todos que come�a com a letra M
		lista.removeIf(x->x.charAt(0)=='M');
		
		//encontrar posi��o de um elemento.
		System.out.println("Posi��o do Jorge: "+ lista.indexOf("Jorge"));
		
		//Deixar na lista somente os que come�am com B
		List<String> result = lista.stream().filter(x->x.charAt(0)=='B').collect(Collectors.toList());
												  //-opera��o lambda -// 
		
		//Encontrar o primeiro nome que come�a com J
		String name = lista.parallelStream().filter(x->x.charAt(0)=='J').findFirst().orElse(null);
		System.out.println(name);
		
		
		System.out.println("-----------------------------");
		for(String y: lista) {
			System.out.println(y);
		}
		System.out.println("-----------------------------");
		for(String y: result) {
			System.out.println(y);
		}
	}

}

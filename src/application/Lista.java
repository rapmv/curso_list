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
		lista.add("João");
		
		//add na posição 2
		lista.add(2,"Bob");
		
		//tamanho da lsita
		System.out.println(lista.size());
		
		lista.remove("Ana");
		
		//removendo na posição 1;
		lista.remove(1);
		
		//remover todos que começa com a letra M
		lista.removeIf(x->x.charAt(0)=='M');
		
		//encontrar posição de um elemento.
		System.out.println("Posição do Jorge: "+ lista.indexOf("Jorge"));
		
		//Deixar na lista somente os que começam com B
		List<String> result = lista.stream().filter(x->x.charAt(0)=='B').collect(Collectors.toList());
												  //-operação lambda -// 
		
		//Encontrar o primeiro nome que começa com J
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

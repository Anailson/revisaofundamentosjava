package Colecoes;

import java.util.HashSet;

public class Conjuneto {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {

		 HashSet conjunto = new HashSet();
		 
		 conjunto.add(1.2); //double converte para o Double  Maiscuulo é String
		 conjunto.add(true);  // bollean - Boolean 
		 conjunto.add("teste");
		 conjunto.add(1);
		 conjunto.add('x');
		 
		 
		 System.out.println("Tamanho é " + conjunto.size());
		 
		 conjunto.add("Teste");
		 conjunto.add('x');
		 System.out.println("Tamanho é " + conjunto.size());
		 
		 
		 
		 
		 
	}

}

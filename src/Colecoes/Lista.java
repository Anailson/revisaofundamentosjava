package Colecoes;

import java.util.ArrayList;
import java.util.Arrays;

public class Lista {

	public static void main(String[] args) {

		
		
		ArrayList<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario("Ila");
		lista.add(u1);
		
		lista.add(new Usuario("Raquel"));
		lista.add(new Usuario("Anailson"));
		lista.add(new Usuario("Laura"));
		lista.add(new Usuario("Lavinia"));
		
		System.out.println(lista.get(3)); //acesasr pelo indice
		
		lista.remove(1);
		
		for (Usuario u : lista) {
			System.out.println(u.nome);
			
		}
		
		
		
	}

}

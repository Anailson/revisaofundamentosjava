package Colecoes;

import java.util.HashSet;

public class Hash {

	public static void main(String[] args) {

		
		HashSet<Usuario> usuarios = new HashSet<Usuario>();
		
		usuarios.add(new Usuario("Anailson"));
		usuarios.add(new Usuario("ila"));
		usuarios.add(new Usuario("raquel"));
		
		boolean resultado = usuarios.contains(new Usuario("ila"));
		System.out.println(resultado);
		
	}

}

package Colecoes;

import java.util.HashMap;
import java.util.Map;

public class Mapa {

	public static void main(String[] args) {

		
		Map<Integer, String> usuarios = new HashMap<Integer, String>();
		
		
		usuarios.put(1, "ila");
		usuarios.put(2, "anailson");
		usuarios.put(3, "raquel");
		usuarios.put(4, "lavinia");
		
		
		
		System.out.println(usuarios);
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty()); //falso pois tem usuarios na lista
		System.out.println(usuarios.entrySet());
		System.out.println(usuarios.keySet());
		System.out.println(usuarios.entrySet());
		
		
		System.out.println(usuarios.get(1));
		
		
		for (Integer chave : usuarios.keySet()) {
			System.out.println(chave);
		}

	
	}

}

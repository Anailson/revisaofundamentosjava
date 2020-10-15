package Colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoComportado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> listaAprovados = new HashSet<String>();
		listaAprovados.add("ila");
		listaAprovados.add("raquel");
		listaAprovados.add("anailson");
		listaAprovados.add("lavinia");
		
		for(String candidato : listaAprovados) {
			System.out.println(candidato);
		}
	}

}

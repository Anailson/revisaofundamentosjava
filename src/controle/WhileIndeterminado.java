package controle;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		String valor = "";
		
		//SO ENTRA NO WHILE ENQUANTO O USER DIGIAR SAIR , CASO CONTRARIO INFORMAR NO CONSOLE
		while (!valor.equalsIgnoreCase("sair")) {
			System.out.println("Voce diz:");
			valor= entrada.nextLine();
		}
		
		
		entrada.close();
		
	}

}

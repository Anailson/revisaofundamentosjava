package controle;

import java.util.Scanner;

public class DoWhile {
	
	public static void main(String[] args) {
		
		//if(..) sentença; ou {}
		//while(..) sentenã; ou {}
		//for(..;...;...) sentença; ou {}
		
		//do {} while (..);
		
		Scanner entrada = new Scanner(System.in);
		
		String texto = "";
		
		do {
			
			System.out.println("Vc preisa falar"
					+"as palavras magicas....");
			System.out.println("Que sair?");
			texto = entrada.nextLine();
			
		} while (!texto.contentEquals("por favor"));
		
		System.out.println("Obrigado");
		entrada.close();
	}

}

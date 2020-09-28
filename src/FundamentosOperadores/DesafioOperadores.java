package FundamentosOperadores;

import java.util.Scanner;

public class DesafioOperadores {

	public static void main(String[] args) {
		 
		//TRABALHO NA TERÇA  V OU F   -> CASO SEJA V..COMPRA TV 50PG
		//TRABALHO NA QUINTA V OU F   ->CASO F 

		boolean trabalho1 = true;
		boolean trabalho2 = true;
		
		boolean comprouTv50 = trabalho1 && trabalho2;
		boolean comprouTv32 = trabalho1 ^ trabalho2;
		boolean comprouSorvete = trabalho1 || trabalho2;
		
		System.out.println("Comprou TV50" + comprouTv50);
		System.out.println("Comprou TV32" + comprouTv32);
		System.out.println("Comprou TV32 Sorvete" + comprouSorvete);
		

	}

}

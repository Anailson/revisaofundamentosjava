package controle;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {

		/**
		 * PROGRAMA SEMANA
		 * DOMINGO ->1 , SEGUNDA ->2, TERÇA 3, QUARTA 4 , QUINTA 5, SEXTA 6 , SABADO 7
		 */
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Qual é o dia da semana?");
		
		String dia = entrada.next();
		
		if ("domingo".equalsIgnoreCase(dia)) {
			System.out.println(1);
		}else if("segunda".equalsIgnoreCase(dia)) {
			System.out.println(2);
		}if ("terca".equalsIgnoreCase(dia)) {
			System.out.println(3);
		}else if("quarta".equalsIgnoreCase(dia)) {
			System.out.println(4);
		}if ("quinta".equalsIgnoreCase(dia)) {
			System.out.println(5);
		}else if("sexta".equalsIgnoreCase(dia)) {
			System.out.println(6);
		}if ("sabado".equalsIgnoreCase(dia)) {
			System.out.println(7);
		}else {
			System.out.println("Dia é invalido");
		}
		
		
		entrada.close();
		
		
	}

}

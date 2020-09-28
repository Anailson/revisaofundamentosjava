package controle;

import java.util.Scanner;

public class IfElseIf {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual o nome do aluno?");
		String nome = entrada.nextLine();
		
		System.out.println("Digite a nota:");
		double nota = entrada.nextDouble();
		
		if (nota > 10 || nota < 0) {
			System.out.println("Nota é valida"  );
			
		}else {
			if(nota >= 8.1) {
				System.out.println("Conceito A\n" +nome);
			}else {
				System.out.println("Conceito B\n" +nome);
			}
			
		}
		
		System.out.println("FIM!");
		entrada.close();
		
	}

}

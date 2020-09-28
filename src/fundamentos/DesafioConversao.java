package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o seu primeiro Salário R$:");
		String valor1 = entrada.nextLine().replace(",","." ); //SUBSTITUIR A VIRGULA POR .
		
		System.out.print("Digite o seu segundo Salário R$:");
		String valor2 = entrada.nextLine().replace(",","." );
		
		
		
		System.out.print("Digite o seu terceiro Salário R$:");
		String valor3 = entrada.nextLine().replace(",","." );
		
		double salario1 = Double.parseDouble(valor1);
		double salario2 = Double.parseDouble(valor2);
		double salario3 = Double.parseDouble(valor3);
		
	    double media = (salario1 + salario2 + salario3) /3;
		
		System.out.println("A média dos salarios é R$" +media);
		
		entrada.close();
	

	}

}

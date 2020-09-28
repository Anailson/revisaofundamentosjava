package FundamentosOperadores;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		
    //CALCULDAORA
		//LER NUM1
		//LER NUM2
		//+ - * /  %
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe o primeiro numero");
		double num1 = entrada.nextInt();
		System.out.print("Informe o segundo numero");
		double num2 = entrada.nextInt();
		
		System.out.print("Informe a operação");
		String op = entrada.next();
		
		
		//LOGICA
		
		double resultado = "+".equals(op) ? num1 + num2 :0; 
		resultado = "-".equals(op) ? num1 - num2 : resultado;
		resultado = "*".equals(op) ? num1 * num2 : resultado;
		resultado = "/".equals(op) ? num1 / num2 : resultado;
		resultado = "%".equals(op) ? num1 % num2 : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f", num1, op,num2, resultado);
		
		
		
		
		
		
		//int soma = num1 + num2;
		//int subtracao = num1 - num2;
		//int mult = num1 * num2;
		//int divisao = num1 / num2;
		//int mod = num1 % num2;
		
		/*
		 * 
		System.out.println("A soma de ambos é\n" + soma);
		System.out.println("A subtração é\n" + subtracao);
		System.out.println("A multiplicação de ambos é\n" + mult);
		System.out.println("A divisão de ambos é\n" + divisao);
		System.out.println("A modulo de ambos é\n" + mod);
		*/
		entrada.close();
		
		
	} 

}

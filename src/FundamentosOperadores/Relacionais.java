package FundamentosOperadores;

public class Relacionais {

	public static void main(String[] args) {

		
		int a = 97;
		int b = 'a';
		
		System.out.println(a == b); //igual ao outro
		
		System.out.println(3 > 4); //maior
		System.out.println(3 >= 4); //maior e igual
		System.out.println(3 < 7); //menor
		System.out.println(30 <= 4); //menor igual
		System.out.println(30 != 4);
		
		
		double nota = 6.3;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >=7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		
		System.out.println("Tem desconto" +temDesconto);
		

		
		
	}

}

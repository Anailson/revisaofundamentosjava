package classe;

public class PrimeiroTrauma {

	// int a = 3; //não pode mexe aqui

	// SOLUÇÃO

	 int a = 3;
	 static int b = 4;
	/*
	 * Exception in thread "main" java.lang.Error: Unresolved compilation problem:
	 * Cannot make a static reference to the non-static field a
	 * 
	 * at classe.PrimeiroTrauma.main(PrimeiroTrauma.java:11)
	 */

	public static void main(String[] args) {

		PrimeiroTrauma p = new PrimeiroTrauma();
		System.out.println(p.a);
		
		System.out.println(b);

	}

}

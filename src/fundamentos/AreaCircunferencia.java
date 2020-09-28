package fundamentos;

public class AreaCircunferencia {

	public static void main(String[] args) {
	
		double raio = 3.4;
	  final	double PI = 3.14159;  //colocando final nao pode ser alterado
		  
		double area = PI * raio * raio;
		System.out.println("O valor do raio é:" + area);
		
		
		raio = 10;
		area = PI * raio * raio;
		
		System.out.println("Àrea" + area);
		
		

	}

}

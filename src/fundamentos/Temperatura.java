package fundamentos;

public class Temperatura {

	public static void main(String[] args) {
		
		//°C = (°F - 32)/1,8  
		final double FATOR = 5 / 9.0;
		final double AJUSTER = 32;
		
		
		double fahrenheit = 86;
		double celsius = (fahrenheit - AJUSTER) * FATOR;
				
		System.out.println("O resultado é" +celsius +" Temperatura em Celsius");
	}

}

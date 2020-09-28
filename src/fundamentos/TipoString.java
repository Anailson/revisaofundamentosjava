package fundamentos;

public class TipoString {

	public static void main(String[] args) {

		System.out.println("Ola pessoal".charAt(5));
		
		String s = "Boa tarde";
		System.err.println(s.concat("!!!"));
		System.out.println(s+ "!!!");
		System.out.println(s.startsWith("boa"));
		System.out.println(s.endsWith("tarde"));
		System.out.println(s.length());
		System.out.println(s.equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		var nome ="Anailson"; //java entende que é String o var
		var sobrenome = "santos";
		var idade = 36;
		var salario = 13424.989;
		
		System.out.println("Nome:" +nome+ "\nSobrenome: " 
		+ sobrenome+ "Salario:" + salario);
		
		System.out.printf("Nome: %s", nome);
		
	}

}

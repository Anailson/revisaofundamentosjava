package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {


		String s = "Bom dia X";
		s= s.replace("X", "Senhora"); //TROCANDO X PARA SENHORA
		s= s.toUpperCase(); //TUDO MAISCULO
		s = s.concat("!!!");
		
		System.out.println(s);
		
		System.out.println("Anailson".toUpperCase());
		
		String y =  "Bom dia X"
				.replace("X","Ribeiro").toLowerCase();
		System.out.println(y);
		
		//tipis primitivos não tem o operador "."
		//ex: 
	    //int a = 3;
		//a.
	}

}

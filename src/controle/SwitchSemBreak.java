package controle;

public class SwitchSemBreak {

	public static void main(String[] args) {

		
		String faixa = "preta";
		
		switch(faixa.toLowerCase()) {
		
		case "preta":
	    System.out.println("Sei o bassai-dai...");
		case "marron":
		System.out.println("Sei o tekky-dai...");
		case "roxa":
		System.out.println("Sei o roxa bassai-dai...");
		case "verde":
		System.out.println("Sei o verde bassai-dai...");
		case "laranja":
	    System.out.println("Sei o laranja bassai-dai...");
		case "vermelha":
		System.out.println("Sei o vermelha bassai-dai...");
		case "amarela":
		System.out.println("Sei o amarela bassai-dai...");
				
	    	
	    	System.out.println("Não sei nada");
	    	break;
	    	default:
		
		}
		System.out.println("Fim");
		
		int idade = 3;
		switch (idade) {
		case 3:
			System.out.println("Sabe programar");
		case 2:
			System.out.println("Sabe andar");
		case 1:
			System.out.println("Sabe respirar");
		}
		
	}

}

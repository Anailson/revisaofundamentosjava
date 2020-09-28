package controle;

public class DesafioFor {

	public static void main(String[] args) {

		System.out.println("-----------USANDO INT PARA CONTROLAR---------------");
		String valor = "#";
		for(int i =1 ; i <=5; i++) {
			System.out.println(valor);
			valor +="#";
		}
		System.out.println("-----------USANDO STRING PARA CONTROLAR---------------");
		//versao do desadio
		//não pode usar valor numero para controlar o laço
		
		for(String v = "#"; !v.equals("######"); v+="#") {
			System.out.println(v);
		}
		
		
	}

}

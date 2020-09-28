package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		
		//Informações do funcionario
		
		//Tipos numeros inteiros
		byte anoDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134-845_223L;
		
		//Tipos numericos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		//tipos booleano
		boolean estaDeFerias = false ; //true
		
		//tipo caractere
		char status = 'A'; //ativo
		
		//dias de empresa
		System.out.println(anoDeEmpresa * 365);
		
		//Numero de viaagens
		System.out.println(numeroDeVoos / 2);
		
		//pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println( id + ": ganha ->" +salario);
		System.out.println("Férias?" + estaDeFerias);
		System.out.println("Status:" + status);
		
		
		
		
	}

}

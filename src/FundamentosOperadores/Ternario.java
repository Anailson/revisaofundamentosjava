package FundamentosOperadores;

public class Ternario {

	public static void main(String[] args) {

		double media = 8.6;
		String resultadoRecuperacao = media >= 5.0 ? 
				"em recupera��o":"reprovado";
		String resultadoFinal = media >= 7.0 ? "Aprovado." : "Recupera��o";
		System.out.println("O aluno est� " + resultadoFinal);
		
		double nota = 9.9;
		boolean bomComportamento = false;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado = temDesconto ? "Sim." :"N�o.";
		
		System.out.println("Tem desconto?" + resultado);
		
	
	}
	
	

}

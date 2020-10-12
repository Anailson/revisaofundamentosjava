package classe;

public class Produto  {
	
	String nome;
	double preco;
	static double desconto = 0.25; //desconto em todos os produtos 
	
	//construtor padraão sem passando parametros
		Produto (){
			
		}
	
	//CONSTRUTOR PADRÃO DA CLASSE
	Produto(String nomeInicial){
		nome = nomeInicial;
	}
	
	Produto(String nomeInicial, double precoInicial){
		nome = nomeInicial;
		preco = precoInicial;
	}
	
		
	
	//DESCONTO 
	double precoComDesconto() {
		return preco * (1 - desconto );
	}
	
	//DESCONTO ADICIONAL COMO GERENTE
	double precoComDesconto(double descontoDoGerente) {
		return preco * (1 - desconto +descontoDoGerente );
	}
	

}

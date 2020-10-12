package classe;

public class ProdutoTeste {

	public static void main(String[] args) {

		Produto p1 = new Produto("Notebook", 5505.50); //instanciando um produto - criando obj
		//p1.nome="Notebook";
		//p1.preco=4356.90;
		//p1.desconto = 0.25;
			
		var p2 = new Produto();
		p2.nome="Caneta Preta";
		p2.preco=12.56;
		//p2.desconto = 0.30;  //30%
		Produto.desconto = 0.29; //TODOS COM 0.29% DESC
		
		System.out.println(p1.nome  + " R$ " + p1.precoComDesconto());
		System.out.println(p2.nome + " R$ " + p2.precoComDesconto());
		
		//REFATORANDO O CODIGO..CRIANDO UM METODO QUE PDO ESER APLICADO EM TODO O PROJETO
		//double precoFinal1 = p1.preco * (1- p1.desconto);
		//double precoFinal2 = p2.preco * (1- p2.desconto);
		
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto(0.10);//PASSANDO MANUALMENTE O VALOR DO DESCONTO DO GERENTE
		double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;
		
		System.out.printf("Média do carrinho = R$%.2f ", mediaCarrinho);
		
		
	}


}

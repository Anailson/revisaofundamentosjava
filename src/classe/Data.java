package classe;

public class Data {

	int dia;
	int mes;
	int ano;

	// DOIS CONSTRUTOR O PADRAO E OUTRO COM PARAMENTROS DIA, MES E ANO

	Data() {
		//dia = 1;
		//mes = 1;
		//ano = 1970;
		this(1,1, 1970);
	}

	Data(int dia, int mes, int ano) {

		this.dia = dia;
		this.mes = mes;
		this.ano = ano;

	}

	// FORMATANDO A DATA NO METODO - MELHOR FORMA DE APLICAR..PARA SISTEMAS
	// WEB , DESKTOP OU MOBILE
	String obterDataFormatada() {

		String formato = "%d/%d/%d\"";
		return String.format(formato, this.dia, mes, ano);
	}

	// QD NÃO TEM NENHUM RETORNO NA FUNÇÃO - MENOS FLEXIVELS PARA OUTROS SISTEMAS
	void imprimirDataFormatada() {

		System.out.printf(obterDataFormatada());

	}
	

}

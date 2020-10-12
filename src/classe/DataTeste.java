package classe;

public class DataTeste {

	public static void main(String[] args) {

		Data data1 = new Data();  //JA VEM OS VALORES DO CONSTRUTOR PADRAO
		//data1.dia = 30;
		//data1.mes = 5;
		//data1.ano = 1984;
		// colocando duas datas e instanciando
		//System.out.println("-----------Anailson-------");
		//System.out.println("Anaílson Dia" + data1.dia);
		//System.out.println("Anaílson Mês" + data1.mes);
		//System.out.println("Anaílson Ano" + data1.ano);

		Data data2 = new Data();
		data2.dia = 30;
		data2.mes = 10;
		data2.ano = 2020;

		Data data3 = new Data(05, 12, 1970);
		//data3.dia = 30;
		//data3.mes = 10;
		//data3.ano = 2020;
			
		

		System.out.println("DATA FORMATADA");
		// System.out.printf("%d/%d/%d", data2.dia,data2.mes,data2.ano);
		System.out.println(data1.obterDataFormatada());// CHAMANDO A FUNÇÃO
	
		data2.imprimirDataFormatada();
		
		data3.imprimirDataFormatada();
	}
}

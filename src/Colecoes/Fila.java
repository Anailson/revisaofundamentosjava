package Colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {

		
		Queue<String> fila = new LinkedList<String>();
		//ofter  e add -> add elementos na fila
		//diferenca � o comportamento e a fila esta cheia?
		fila.add("Ila"); //retorna falso
		fila.offer("Raquel"); //lan�a uma exce�o
		fila.add("anailson");
		fila.offer("lavinia");
		fila.add("nicole");
		
		System.out.println(fila.peek());//retorna falso
		System.out.println(fila.peek()); 
		System.out.println(fila.element()); //lanca uma exce��o
		System.out.println(fila.element());

		//fila.size();
		//fila.clear();
		//fila.isEmpty();
		
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		
	}

}

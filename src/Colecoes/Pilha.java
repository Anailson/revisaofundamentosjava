package Colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {

		
		Deque<String> livros = new ArrayDeque<String>();
		
		livros.add("Pequeno principe");
		livros.push("don quixote");
		livros.push("O hobbit");
		
		System.out.println(livros.peek());  // O ULTIMO QUE ENTRA É O PRIMEIRO A SAIR
		System.out.println(livros.element());
		
		System.out.println("------------------");
		System.out.println("qts de elementos na lista" +livros.size());
		
		for (String livro : livros) {
			System.out.println(livro);
		}
	}

}

package br.com.coder.testesjavase.colecoes.queue;

import java.util.Collections;
import java.util.Date;
import java.util.LinkedList;
import java.util.Queue;

import junit.framework.TestCase;

public class TestQueue extends TestCase {
	
	public void testLinkedList(){
		
		Queue<Integer> q = new LinkedList<>();
		
		for (int i = 1; i <= 5; i++) {
			q.add(i);
		}
		
		//NAO ORDENA
		//Collections.sort(q); erro
		
		//peek - Pega de cima da pilha. Não retira da pilha
		System.out.println("-------- element ----------");
		System.out.println(q.size());
		System.out.println(q.element());
		System.out.println(q.size());
		
		//peek - Pega de cima da pilha. Não retira da pilha
		System.out.println("-------- peek ----------");
		System.out.println(q.size());
		System.out.println(q.peek());
		System.out.println(q.size());
		
		//poll - Pega de cima da pilha. Não retira da pilha
		System.out.println("-------- pool ----------");
		System.out.println(q.size());
		System.out.println(q.poll());
		System.out.println(q.size());
		
		//remove - Retira de cima da pilha. Não retorna o objeto. Retorna booleano.
		System.out.println("-------- remove ----------");
		System.out.println(q.size());
		System.out.println(q.remove());
		System.out.println(q.size());
		
		
	}

}

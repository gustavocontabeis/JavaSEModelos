package br.com.coder.testesjavase.lombok;

import org.junit.Test;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

public class PessoaTest {
	
	@Test
	public void testBuilder() {
		
		Pessoa build = Pessoa.builder()
		.id(1L)
		.altura(1.7F)
		.vivo(true)
		.nome("Gustavo")
		.build();
		

	}
	
	@Test
	public void testAccessors() {
		
		Pessoa p2 = new Pessoa()
				.setId(1L)
				.setAltura(1.7F)
				.setVivo(true)
				.setNome("Nome");
		
	}
	
	@Test
	public void testWither() {
		
		Pessoa pessoa1 = new Pessoa()
				.setId(1L)
				.setAltura(1.7F)
				.setVivo(true)
				.setNome("Nome");
		
		Pessoa pessoa2 = pessoa1.withNome("Giana");
		
		System.out.println(pessoa1);
		System.out.println(pessoa2);
		
	}
	
}

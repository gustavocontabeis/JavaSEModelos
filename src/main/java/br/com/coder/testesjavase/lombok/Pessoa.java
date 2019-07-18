package br.com.coder.testesjavase.lombok;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import lombok.experimental.Wither;

@Accessors(chain = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Pessoa {
	
	private Long id;
	
	@Wither
	private String nome;
	private float altura;
	private boolean vivo;
	
}

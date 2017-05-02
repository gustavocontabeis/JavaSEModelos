package br.com.coder.testesjavase.java8.interfacedefault;

import java.math.BigDecimal;
import java.util.Date;

public interface Imposto {
    
    Date periodoAquisitivo();
    Date dataVencimento();
    BigDecimal valor();
    BigDecimal indice();
    default BigDecimal calcularValor(){
    	return valor().multiply(indice());
    }
    
}

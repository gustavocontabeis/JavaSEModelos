package br.com.coder.testesjavase.java8.interfacedefault;

import java.math.BigDecimal;
import java.util.Date;

public class PIS implements Imposto {

    @Override
    public Date dataVencimento() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

	@Override
	public Date periodoAquisitivo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BigDecimal valor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BigDecimal indice() {
		// TODO Auto-generated method stub
		return null;
	}
    
}

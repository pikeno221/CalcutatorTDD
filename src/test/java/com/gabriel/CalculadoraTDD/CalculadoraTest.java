
package com.gabriel.CalculadoraTDD;

import org.junit.Test;

import junit.framework.Assert;

public class CalculadoraTest {
	
	Calculadora calc = new Calculadora();

	@Test
	public void deveSomarDoisValores() {
		// cenario
		int a = 5;
		int b = 3;
		
		
		// acao
		int total = calc.somar(a, b);
		
		//verificacao
		Assert.assertEquals(8, total);
	}
	
	@Test
	public void deveSubtrairDoisValores() {
		// cenario
		int a = 5;
		int b = 3;
		
		
		// acao
		int total = calc.subtrair(a, b);
		
		//verificacao
		Assert.assertEquals(2, total);
		
	}
	
	@Test
	public void deveMultiplicarDoisValores() {
		// cenario
		int a = 5;
		int b = 3;
		
		// acao
		int total = calc.multiplicar(a, b);
		
		//verificacao
		Assert.assertEquals(15, total);
		
	}
	
	@Test
	public void deveDividirDoisValores() {
		// cenario
		int a = 10;
		int b = 5;
		
		// acao
		int total = calc.dividir(a, b);
		
		//verificacao
		Assert.assertEquals(2, total);
	}
	
	@Test(NaoPodeDividirPorZeroException.class)
	public void naoDeveDividirValorPorZero() {
		int a = 10;
		int b = 0; 
		
		
		int total = calc.dividir(a, b);
		
	}
	
}

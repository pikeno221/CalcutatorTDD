
package com.gabriel.CalculadoraTDD;

import org.junit.Test;

import junit.framework.Assert;

public class CalculadoraTest {

	@Test
	public void deveSomarDoisValores() {
		// cenario
		int a = 5;
		int b = 3;
		
		Calculadora calc = new Calculadora();
		
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
		
		Calculadora calc = new Calculadora();
		
		// acao
		int total = calc.subtrair(a, b);
		
		//verificacao
		Assert.assertEquals(2, total);
		
	}
}

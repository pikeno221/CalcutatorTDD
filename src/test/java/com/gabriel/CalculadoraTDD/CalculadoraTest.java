
package com.gabriel.CalculadoraTDD;

import org.junit.Before;
import org.junit.Test;

import com.gabriel.CalculadoraTDD.exception.NaoPodeDividirPorZeroException;

import junit.framework.Assert;

public class CalculadoraTest {

	private Calculadora calc;

	@Before
	public void setup() {
		calc = new Calculadora();
	}

	@Test
	public void deveSomarDoisValores() {
		// cenario
		int a = 5;
		int b = 3;

		// acao
		int total = calc.somar(a, b);

		// verificacao
		Assert.assertEquals(8, total);
	}

	@Test
	public void deveSubtrairDoisValores() {
		// cenario
		int a = 5;
		int b = 3;

		// acao
		int total = calc.subtrair(a, b);

		// verificacao
		Assert.assertEquals(2, total);

	}

	@Test
	public void deveMultiplicarDoisValores() {
		// cenario
		int a = 5;
		int b = 3;

		// acao
		int total = calc.multiplicar(a, b);

		// verificacao
		Assert.assertEquals(15, total);

	}

	@Test
	public void deveDividirDoisValores() throws NaoPodeDividirPorZeroException {
		// cenario
		int a = 10;
		int b = 5;

		// acao
		int total = calc.dividir(a, b);

		// verificacao
		Assert.assertEquals(2, total);
	}

	@Test(expected = NaoPodeDividirPorZeroException.class)
	public void naoDeveDividirValorPorZero() throws NaoPodeDividirPorZeroException {
		int a = 10;
		int b = 0;

		calc.dividir(a, b);
	}

}

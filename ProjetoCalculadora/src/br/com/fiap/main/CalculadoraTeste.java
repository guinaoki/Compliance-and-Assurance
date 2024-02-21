package br.com.fiap.main;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.fiap.beans.Calculadora;

public class CalculadoraTeste {
	
	Calculadora calc = new Calculadora();

	@Test
	public void testSomar2com2() {

		int returnCalculo = calc.soma(2, 2);
		assertEquals(returnCalculo, 4);
		
	}
	
	@Test
	public void testSomar3com5() {

		int returnCalculo = calc.soma(3, 5);
		assertEquals(returnCalculo, 8);
		
	}
	
	@Test
	public void testSubtrair3de5() {

		int returnCalculo = calc.subtracao(5, 3);
		assertEquals(returnCalculo, 2);
		
	}
	
	@Test
	public void testDividir5por5() {

		float returnCalculo = calc.dividir(5, 5);
		assertEquals(returnCalculo, 1, 0);
		
	}
	
	@Test
	public void testDividir5por2() {

		float returnCalculo = calc.dividir(5, 2);
		assertEquals(returnCalculo, 2.5, 0.5);
		
	}
	
	@Test
	public void testDividir8por3() {

		float returnCalculo = calc.dividir(8, 3);
		assertEquals(returnCalculo, 2.6, 0.7);
		
	}

}

package br.com.project.teste;

import org.junit.Test;

import org.junit.Assert;

public class OperacoesTest {
	@Test
	public void somaTest() {
		Operacoes op = new Operacoes(3,3);
		int ret = op.soma();
		Assert.assertEquals(6, ret);
	}
	
	@Test
	public void subtracaoTest() {
		Operacoes op = new Operacoes(5,3);
		int ret = op.subtracao();
		Assert.assertEquals(2, ret);
	}
}

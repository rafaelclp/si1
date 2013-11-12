package NumeroPorExtenso;
import static org.junit.Assert.*;

import org.junit.Test;


public class NumeroPorExtensoTest {

	@Test
	public void numeroDeZeroADez() {
		assertEquals(NumeroPorExtenso.converter(0), "zero");
		assertEquals(NumeroPorExtenso.converter(1), "um");
		assertEquals(NumeroPorExtenso.converter(2), "dois");
		assertEquals(NumeroPorExtenso.converter(3), "três");
		assertEquals(NumeroPorExtenso.converter(4), "quatro");
		assertEquals(NumeroPorExtenso.converter(5), "cinco");
		assertEquals(NumeroPorExtenso.converter(6), "seis");
		assertEquals(NumeroPorExtenso.converter(7), "sete");
		assertEquals(NumeroPorExtenso.converter(8), "oito");
		assertEquals(NumeroPorExtenso.converter(9), "nove");
		assertEquals(NumeroPorExtenso.converter(10), "dez");
	}

	@Test
	public void numerosDeDoisAlgarismos() {
		assertEquals(NumeroPorExtenso.converter(11), "onze");
		assertEquals(NumeroPorExtenso.converter(12), "doze");
		assertEquals(NumeroPorExtenso.converter(13), "treze");
		assertEquals(NumeroPorExtenso.converter(14), "catorze");
		assertEquals(NumeroPorExtenso.converter(15), "quinze");
		assertEquals(NumeroPorExtenso.converter(16), "dezesseis");
		assertEquals(NumeroPorExtenso.converter(17), "dezessete");
		assertEquals(NumeroPorExtenso.converter(18), "dezoito");
		assertEquals(NumeroPorExtenso.converter(19), "dezenove");
		assertEquals(NumeroPorExtenso.converter(20), "vinte");
		assertEquals(NumeroPorExtenso.converter(21), "vinte e um");
		assertEquals(NumeroPorExtenso.converter(30), "trinta");
		assertEquals(NumeroPorExtenso.converter(31), "trinta e um");
		assertEquals(NumeroPorExtenso.converter(40), "quarenta");
		assertEquals(NumeroPorExtenso.converter(41), "quarenta e um");
		assertEquals(NumeroPorExtenso.converter(50), "cinquenta");
		assertEquals(NumeroPorExtenso.converter(51), "cinquenta e um");
		assertEquals(NumeroPorExtenso.converter(60), "sessenta");
		assertEquals(NumeroPorExtenso.converter(61), "sessenta e um");
		assertEquals(NumeroPorExtenso.converter(70), "setenta");
		assertEquals(NumeroPorExtenso.converter(71), "setenta e um");
		assertEquals(NumeroPorExtenso.converter(80), "oitenta");
		assertEquals(NumeroPorExtenso.converter(81), "oitenta e um");
		assertEquals(NumeroPorExtenso.converter(90), "noventa");
		assertEquals(NumeroPorExtenso.converter(91), "noventa e um");
		assertEquals(NumeroPorExtenso.converter(92), "noventa e dois");
		assertEquals(NumeroPorExtenso.converter(93), "noventa e três");
		assertEquals(NumeroPorExtenso.converter(94), "noventa e quatro");
		assertEquals(NumeroPorExtenso.converter(95), "noventa e cinco");
		assertEquals(NumeroPorExtenso.converter(96), "noventa e seis");
		assertEquals(NumeroPorExtenso.converter(97), "noventa e sete");
		assertEquals(NumeroPorExtenso.converter(98), "noventa e oito");
		assertEquals(NumeroPorExtenso.converter(99), "noventa e nove");
	}
}

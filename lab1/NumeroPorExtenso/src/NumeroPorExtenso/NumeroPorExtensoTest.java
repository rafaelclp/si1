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

	@Test
	public void numerosDeTresAlgarismos() {
		assertEquals(NumeroPorExtenso.converter(100), "cem");
		assertEquals(NumeroPorExtenso.converter(101), "cento e um");
		assertEquals(NumeroPorExtenso.converter(102), "cento e dois");
		assertEquals(NumeroPorExtenso.converter(103), "cento e três");
		assertEquals(NumeroPorExtenso.converter(104), "cento e quatro");
		assertEquals(NumeroPorExtenso.converter(105), "cento e cinco");
		assertEquals(NumeroPorExtenso.converter(106), "cento e seis");
		assertEquals(NumeroPorExtenso.converter(107), "cento e sete");
		assertEquals(NumeroPorExtenso.converter(108), "cento e oito");
		assertEquals(NumeroPorExtenso.converter(109), "cento e nove");
		assertEquals(NumeroPorExtenso.converter(110), "cento e dez");
		assertEquals(NumeroPorExtenso.converter(111), "cento e onze");
		assertEquals(NumeroPorExtenso.converter(112), "cento e doze");
		assertEquals(NumeroPorExtenso.converter(113), "cento e treze");
		assertEquals(NumeroPorExtenso.converter(114), "cento e catorze");
		assertEquals(NumeroPorExtenso.converter(115), "cento e quinze");
		assertEquals(NumeroPorExtenso.converter(116), "cento e dezesseis");
		assertEquals(NumeroPorExtenso.converter(117), "cento e dezessete");
		assertEquals(NumeroPorExtenso.converter(118), "cento e dezoito");
		assertEquals(NumeroPorExtenso.converter(119), "cento e dezenove");
		assertEquals(NumeroPorExtenso.converter(120), "cento e vinte");
		assertEquals(NumeroPorExtenso.converter(121), "cento e vinte e um");
		assertEquals(NumeroPorExtenso.converter(200), "duzentos");
		assertEquals(NumeroPorExtenso.converter(201), "duzentos e um");
		assertEquals(NumeroPorExtenso.converter(300), "trezentos");
		assertEquals(NumeroPorExtenso.converter(301), "trezentos e um");
		assertEquals(NumeroPorExtenso.converter(400), "quatrocentos");
		assertEquals(NumeroPorExtenso.converter(401), "quatrocentos e um");
		assertEquals(NumeroPorExtenso.converter(500), "quinhentos");
		assertEquals(NumeroPorExtenso.converter(501), "quinhentos e um");
		assertEquals(NumeroPorExtenso.converter(600), "seiscentos");
		assertEquals(NumeroPorExtenso.converter(601), "seiscentos e um");
		assertEquals(NumeroPorExtenso.converter(700), "setecentos");
		assertEquals(NumeroPorExtenso.converter(701), "setecentos e um");
		assertEquals(NumeroPorExtenso.converter(800), "oitocentos");
		assertEquals(NumeroPorExtenso.converter(801), "oitocentos e um");
		assertEquals(NumeroPorExtenso.converter(900), "novecentos");
		assertEquals(NumeroPorExtenso.converter(901), "novecentos e um");
	}
}

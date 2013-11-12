package NumeroPorExtenso;
import static org.junit.Assert.*;

import org.junit.Test;


public class NumeroPorExtensoTest {

	@Test
	public void numeroDeZeroADez() {
		try {
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
		} catch (Exception e) {
			fail("'" + e.getMessage() + "' - não deveria acontecer.");
		}
	}

	@Test
	public void numerosDeDoisAlgarismos() {
		try {
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
		} catch (Exception e) {
			fail("'" + e.getMessage() + "' - não deveria acontecer.");
		}
	}

	@Test
	public void numerosDeTresAlgarismos() {
		try {
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
		} catch (Exception e) {
			fail("'" + e.getMessage() + "' - não deveria acontecer.");
		}
	}

	@Test
	public void numerosNaCasaDosMilhares() {
		try {
			assertEquals(NumeroPorExtenso.converter(1000), "mil");
			assertEquals(NumeroPorExtenso.converter(1001), "mil e um");
			assertEquals(NumeroPorExtenso.converter(1011), "mil e onze");
			assertEquals(NumeroPorExtenso.converter(1021), "mil e vinte e um");
			assertEquals(NumeroPorExtenso.converter(1100), "mil cem");
			assertEquals(NumeroPorExtenso.converter(1121), "mil cento e vinte e um");
			assertEquals(NumeroPorExtenso.converter(1101), "mil cento e um");
			assertEquals(NumeroPorExtenso.converter(1111), "mil cento e onze");
			assertEquals(NumeroPorExtenso.converter(2101), "dois mil cento e um");
			assertEquals(NumeroPorExtenso.converter(2500), "dois mil quinhentos");
			assertEquals(NumeroPorExtenso.converter(3520), "três mil quinhentos e vinte");
			assertEquals(NumeroPorExtenso.converter(4520), "quatro mil quinhentos e vinte");
			assertEquals(NumeroPorExtenso.converter(5520), "cinco mil quinhentos e vinte");
			assertEquals(NumeroPorExtenso.converter(6520), "seis mil quinhentos e vinte");
			assertEquals(NumeroPorExtenso.converter(7520), "sete mil quinhentos e vinte");
			assertEquals(NumeroPorExtenso.converter(8520), "oito mil quinhentos e vinte");
			assertEquals(NumeroPorExtenso.converter(9520), "nove mil quinhentos e vinte");
			assertEquals(NumeroPorExtenso.converter(10520), "dez mil quinhentos e vinte");
			assertEquals(NumeroPorExtenso.converter(20520), "vinte mil quinhentos e vinte");
			assertEquals(NumeroPorExtenso.converter(21520), "vinte e um mil quinhentos e vinte");
			assertEquals(NumeroPorExtenso.converter(100000), "cem mil");
			assertEquals(NumeroPorExtenso.converter(100001), "cem mil e um");
			assertEquals(NumeroPorExtenso.converter(101000), "cento e um mil");
			assertEquals(NumeroPorExtenso.converter(200000), "duzentos mil");
			assertEquals(NumeroPorExtenso.converter(300000), "trezentos mil");
		} catch (Exception e) {
			fail("'" + e.getMessage() + "' - não deveria acontecer.");
		}
	}

	@Test
	public void numerosNaCasaDosMilhoes() {
		try {
			assertEquals(NumeroPorExtenso.converter(1000000), "um milhão");
			assertEquals(NumeroPorExtenso.converter(1000001), "um milhão e um");
			assertEquals(NumeroPorExtenso.converter(1000100), "um milhão cem");
			assertEquals(NumeroPorExtenso.converter(1001000), "um milhão e mil");
			assertEquals(NumeroPorExtenso.converter(1002000), "um milhão e dois mil");
			assertEquals(NumeroPorExtenso.converter(1002724), "um milhão e dois mil setecentos e vinte e quatro");
			assertEquals(NumeroPorExtenso.converter(1002074), "um milhão e dois mil e setenta e quatro");
			assertEquals(NumeroPorExtenso.converter(2000000), "dois milhões");
			assertEquals(NumeroPorExtenso.converter(2100000), "dois milhões cem mil");
			assertEquals(NumeroPorExtenso.converter(2200000), "dois milhões duzentos mil");
			assertEquals(NumeroPorExtenso.converter(2072012), "dois milhões e setenta e dois mil e doze");
			assertEquals(NumeroPorExtenso.converter(924024012), "novecentos e vinte e quatro milhões e vinte e quatro mil e doze");
			assertEquals(NumeroPorExtenso.converter(100124000), "cem milhões cento e vinte e quatro mil");
			assertEquals(NumeroPorExtenso.converter(101124000), "cento e um milhões cento e vinte e quatro mil");
		} catch (Exception e) {
			fail("'" + e.getMessage() + "' - não deveria acontecer.");
		}
	}

	@Test
	public void numerosNaCasaDosBilhoes() {
		try {
			assertEquals(NumeroPorExtenso.converter(1000000000), "um bilhão");
			//assertEquals(NumeroPorExtenso.converter(1000000001), "um bilhão e um");
			//assertEquals(NumeroPorExtenso.converter(1000000100), "um bilhão cem");
			//assertEquals(NumeroPorExtenso.converter(1000001000), "um bilhão e mil");
			//assertEquals(NumeroPorExtenso.converter(1000002000), "um bilhão e dois mil");
			//assertEquals(NumeroPorExtenso.converter(1000002724), "um bilhão e dois mil setecentos e vinte e quatro");
			//assertEquals(NumeroPorExtenso.converter(1000002074), "um bilhão e dois mil e setenta e quatro");
			//assertEquals(NumeroPorExtenso.converter(2000000000), "dois bilhões");
			//assertEquals(NumeroPorExtenso.converter(2000100000), "dois bilhões cem mil");
			//assertEquals(NumeroPorExtenso.converter(2000200000), "dois bilhões duzentos mil");
			//assertEquals(NumeroPorExtenso.converter(2000072012), "dois bilhões e setenta e dois mil e doze");
			//assertEquals(NumeroPorExtenso.converter(2124072012), "dois bilhões cento e vinte e quatro milhões e setenta e dois mil e doze");
			//assertEquals(NumeroPorExtenso.converter(2024072012), "dois bilhões e vinte e quatro milhões e setenta e dois mil e doze");
		} catch (Exception e) {
			fail("'" + e.getMessage() + "' - não deveria acontecer.");
		}
	}

	@Test
	public void numeroForaDosLimites() {
		try {
			NumeroPorExtenso.converter(-1);
			fail("Não deveria permitir conversão de número negativo.");
		} catch (Exception e) {
		}
		try {
			NumeroPorExtenso.converter(1000000001);
			fail("Não deveria permitir conversão de número maior que 1 bilhão.");
		} catch (Exception e) {
		}
	}
}

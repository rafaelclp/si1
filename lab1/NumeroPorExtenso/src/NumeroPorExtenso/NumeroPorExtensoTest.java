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

}

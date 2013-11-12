package NumeroPorExtenso;

public class NumeroPorExtenso {
	private static String converterDigito(int algarismo) throws Exception {
		String[] algarismos = {"zero", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove"};
		if (algarismo < 0 || algarismo > 9) {
			throw new Exception("O algarismo deve ser entre 0 e 9.");
		}
		return algarismos[algarismo];
	}
	private static String converterNumeroDe2Digitos(int numero) throws Exception {
		String[] numeros10A19 = {"dez", "onze", "doze", "treze", "catorze", "quinze", "dezesseis", "dezessete", "dezoito", "dezenove"};
		if (numero < 10 || numero > 19) {
			throw new Exception("Não implementado ainda!!");
			// TODO: implementar numeros de 20 a 99
		}
		return numeros10A19[numero-10];
	}
	public static String converter(int numero) {
		try {
			if (numero < 10)
				return converterDigito(numero);
			else
				return converterNumeroDe2Digitos(numero);
		} catch (Exception e) {
			System.err.println("Não implementado ainda!");
		}
		return "";
	}
}

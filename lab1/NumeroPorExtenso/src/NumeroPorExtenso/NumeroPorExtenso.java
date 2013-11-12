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
		String[] dezenas = {"vinte", "trinta", "quarenta", "cinquenta", "sessenta", "setenta", "oitenta", "noventa"};

		String resultado = "";
		try {
			if (numero < 10) {
				resultado = converterDigito(numero);
			} else if (numero <= 19) {
				resultado = numeros10A19[numero-10];
			} else if (numero <= 99) {
				resultado = dezenas[numero/10-2];
				if (numero%10 != 0) {
					resultado += " e " + converterDigito(numero%10);
				}
			} else {
				throw new Exception("O numero deve ser entre 0 e 99.");
			}
		} catch (Exception e) {
			throw new Exception("O numero deve ser positivo.");
		}
		return resultado;
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

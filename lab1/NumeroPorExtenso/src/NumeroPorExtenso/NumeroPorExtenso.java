package NumeroPorExtenso;

public class NumeroPorExtenso {
	/**
	 * Converte números de um dígito para extenso.
	 * @param algarismo Um número inteiro de um dígito (0-9).
	 * @return String com o número convertido para extenso.
	 * @throws Exception Caso o número não esteja entre 0 e 9.
	 */
	private static String converterDigito(int algarismo) throws Exception {
		String[] algarismos = {"zero", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove"};
		if (algarismo < 0 || algarismo > 9) {
			throw new Exception("O algarismo deve ser entre 0 e 9.");
		}
		return algarismos[algarismo];
	}

	/**
	 * Converte números de até 2 digitos para extenso.
	 * @param numero Número a ser convertido.
	 * @return String com o número convertido para extenso.
	 * @throws Exception Caso o número não esteja dentro dos limites (0-99).
	 */
	private static String converterNumeroDeAte2Digitos(int numero) throws Exception {
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

	/**
	 * Converte números de até 3 dígitos para extenso.
	 * @param numero Número a ser convertido.
	 * @return String com o número convertido para extenso.
	 * @throws Exception Caso o número não esteja dentro dos limites (0-999).
	 */
	private static String converterNumeroDeAte3Digitos(int numero) throws Exception {
		String[] centenas = {"cento", "duzentos", "trezentos", "quatrocentos", "quinhentos", "seiscentos", "setecentos", "oitocentos", "novecentos"};

		String resultado = "";

		if (numero <= 99) {
			resultado = converterNumeroDeAte2Digitos(numero);
		} else if (numero == 100) {
			resultado = "cem";
		} else if (numero <= 999) {
			resultado = centenas[numero/100-1];
			numero %= 100;
			if (numero != 0) {
				String ultimos2digitos = converterNumeroDeAte2Digitos(numero);
				resultado += " e " + ultimos2digitos;
			}
		}
		return resultado;
	}

	/**
	 * Converte um número de até 1 bilhão para extenso.
	 * @param numero Número a ser convertido.
	 * @return Número convertido para extenso.
	 */
	public static String converter(int numero) {
		try {
			return converterNumeroDeAte3Digitos(numero);
		} catch (Exception e) {
			System.err.println("Não implementado ainda!");
		}
		return "";
	}
}

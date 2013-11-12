package NumeroPorExtenso;

public class NumeroPorExtenso {
	/**
	 * Converte n�meros de um d�gito para extenso.
	 * @param algarismo Um n�mero inteiro de um d�gito (0-9).
	 * @return String com o n�mero convertido para extenso.
	 * @throws Exception Caso o n�mero n�o esteja entre 0 e 9.
	 */
	private static String converterDigito(int algarismo) throws Exception {
		String[] algarismos = {"zero", "um", "dois", "tr�s", "quatro", "cinco", "seis", "sete", "oito", "nove"};
		if (algarismo < 0 || algarismo > 9) {
			throw new Exception("O algarismo deve ser entre 0 e 9.");
		}
		return algarismos[algarismo];
	}

	/**
	 * Converte n�meros de at� 2 digitos para extenso.
	 * @param numero N�mero a ser convertido.
	 * @return String com o n�mero convertido para extenso.
	 * @throws Exception Caso o n�mero n�o esteja dentro dos limites (0-99).
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
	 * Converte n�meros de at� 3 d�gitos para extenso.
	 * @param numero N�mero a ser convertido.
	 * @return String com o n�mero convertido para extenso.
	 * @throws Exception Caso o n�mero n�o esteja dentro dos limites (0-999).
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
	 * Converte um n�mero de at� 1 bilh�o para extenso.
	 * @param numero N�mero a ser convertido.
	 * @return N�mero convertido para extenso.
	 */
	public static String converter(int numero) {
		try {
			return converterNumeroDeAte3Digitos(numero);
		} catch (Exception e) {
			System.err.println("N�o implementado ainda!");
		}
		return "";
	}
}

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
	 * Converte um n�mero (positivo) parcial de at� digitos com sufixo (mil, milh�o, bilh�o) para extenso.
	 * @param numero N�mero de at� 3 digitos a ser convertido.
	 * @param sufixoSingular Sufixo caso "numero" seja 1.
	 * @param sufixoPlural Sufixo caso "numero" seja diferente de 1.
	 * @param numeroAposSufixo N�mero que ser� inserido ap�s o sufixo do n�mero (n�o � inserido neste m�todo).
	 * @return N�mero convertido para extenso.
	 * @throws Exception Caso o n�mero n�o esteja no intervalo de 1 a 999.
	 */
	private static String converterNumeroParcialDeAte3DigitosComSufixo(int numero, String sufixoSingular, String sufixoPlural, int numeroAposSufixo)
			throws Exception {
		String resultado = "";

		if (numero > 0 && numero < 1000) {
			// se existe algum n�mero ap�s o sufixo a ser adicionado, insere um separador ( )
			if (numeroAposSufixo != 0) {
				resultado = " ";

				// se os 3 digitos ap�s os sufixo t�m s� os �ltimos dois d�gitos diferentes de 0,
				// adiciona-se um conectivo (e); em qualquer outro caso, adiciona-se uma v�rgula.
				// Fonte: http://www.matematicadidatica.com.br/CalculadoraNumerosDecimaisPorExtenso.aspx
				// como no exemplo do documento n�o foi usada a v�rgula, "Oito mil setecentos e sessenta e oito",
				// deixaremos apenas o espa�o para esses casos.
				if (numeroAposSufixo < 100) {
					resultado = " e" + resultado;
				}
			}

			if (numero == 1) {
				resultado = sufixoSingular + resultado;

				// se o sufixo singular � igual ao plural, ent�o o sufixo s� tem forma no plural;
				// nesse caso, n�o se insere o "um" (por exemplo: "um mil")
				// Fonte 1: http://answers.yahoo.com/question/index?qid=20061011124154AAHjUj3
				// Fonte 2: http://www.brasilescola.com/gramatica/um-mil-ou-mil.htm
				if (!sufixoSingular.equals(sufixoPlural)) {
					resultado = converterDigito(1) + " " + resultado;
				}
			} else {
				resultado = converterNumeroDeAte3Digitos(numero) + " " + sufixoPlural + resultado;
			}
		} else {
			throw new Exception("O n�mero deve estar no intervalo de 1 a 999.");
		}
		return resultado;
	}

	/**
	 * Converte n�meros de at� 1 bilh�o para extenso.
	 * @param numero N�mero a ser convertido.
	 * @return N�mero convertido para extenso.
	 * @throws Exception Caso o n�mero n�o esteja dentro do intervalo (0-1000000000)
	 */
	private static String converterNumeroQualquerPositivo(int numero) throws Exception {
		String resultado = "";

		// Trata dos �ltimos 3 digitos
		int ultimos3digitos = numero%1000;
		if (ultimos3digitos != 0) {
			resultado = converterNumeroDeAte3Digitos(ultimos3digitos);
		}
		numero /= 1000;

		// Trata dos outros digitos
		String[] sufixos = {"mil","mil"};
		int sufixo = 0;
		while (numero > 0 && sufixo+1 < sufixos.length) {
			if (numero%1000 != 0) {
				resultado = converterNumeroParcialDeAte3DigitosComSufixo(numero%1000, sufixos[sufixo], sufixos[sufixo+1], ultimos3digitos) + resultado;
				ultimos3digitos = numero%1000;
			}
			numero /= 1000;
			sufixo += 2;
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
			if (numero == 0) {
				return converterDigito(0);
			}
			return converterNumeroQualquerPositivo(numero);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return "";
	}
}

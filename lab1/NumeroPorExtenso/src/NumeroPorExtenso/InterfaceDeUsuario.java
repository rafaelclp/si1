package NumeroPorExtenso;

import java.util.Scanner;

public class InterfaceDeUsuario {
	/**
	 * Interface que pede ao usu�rio para digitar um n�mero e exibe o n�mero por extenso.
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Informe um n�mero: ");
		do {
			try {
				int numero = Integer.parseInt(in.next().trim());
				System.out.println(NumeroPorExtenso.converter(numero));
				break;
			} catch (Exception e) {
				System.out.println("Voce deve digitar um numero (de 0 a 1 bilhao). Digite novamente.");
			}
		} while (true);
	}
}

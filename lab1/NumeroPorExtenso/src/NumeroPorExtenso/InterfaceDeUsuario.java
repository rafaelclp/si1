package NumeroPorExtenso;

import java.util.Scanner;

public class InterfaceDeUsuario {
	/**
	 * Interface que pede ao usuário para digitar um número e exibe o número por extenso.
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Informe um número: ");
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

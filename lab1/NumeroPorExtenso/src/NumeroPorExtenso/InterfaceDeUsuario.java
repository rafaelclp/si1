package NumeroPorExtenso;

import java.util.Scanner;

public class InterfaceDeUsuario {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite um número de 0 a 1 bilhão:");
		do {
			try {
				int numero = Integer.parseInt(in.next());
				System.out.println(NumeroPorExtenso.converter(numero));
				break;
			} catch (Exception e) {
				System.out.println("Voce deve digitar um numero (de 0 a 1 bilhao). Digite novamente.");
			}
		} while (true);
	}
}

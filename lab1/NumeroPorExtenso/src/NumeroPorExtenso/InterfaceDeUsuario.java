package NumeroPorExtenso;

import java.util.Scanner;

public class InterfaceDeUsuario {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		do {
			System.out.println("Digite um n�mero de 0 a 1 bilh�o:");
			try {
				int numero = Integer.parseInt(in.next());
				System.out.println(NumeroPorExtenso.converter(numero));
				break;
			} catch (Exception e) {
				
			}
		} while (true);
	}
}

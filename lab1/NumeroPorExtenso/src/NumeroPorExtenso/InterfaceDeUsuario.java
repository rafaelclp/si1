package NumeroPorExtenso;

import java.util.Scanner;

public class InterfaceDeUsuario {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite um número de 0 a 1 bilhão:");
		int numero = in.nextInt();
		//System.out.println("O número digitado, " + numero + ", em extenso fica: " + NumeroPorExtenso.converter(numero));
		System.out.println(NumeroPorExtenso.converter(numero));
	}
}

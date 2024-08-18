package view;

import java.util.Scanner;

import controller.ControllerInverte;

public class Principal {

	public static void main(String[] args) {
		ControllerInverte contInv = new ControllerInverte();
		Scanner sc = new Scanner(System.in);
		String palavra = sc.nextLine();
		int tamanho = palavra.length();
		
		String invertida = contInv.invertePalavra(palavra, tamanho - 1, tamanho );
		System.out.println("A(s) palavra(s) " + palavra + " invertida(s) fica: " + invertida);
		sc.close();
	}

}

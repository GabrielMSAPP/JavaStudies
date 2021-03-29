'''Faça um algoritmo que leia um número inteiro entre 0
e 23 que representa uma hora do dia
Mostre “Bom dia”, “Boa tarde”, “Boa noite” ou “Boa
madrugada” dependendo do horário informado
utilizando estruturas condicionais aninhadas
Mostre mensagem de erro caso o número informado
não atenda à solicitação do programa'''

import java.util.Scanner;
public class ex6 {
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		int h;
		String msg = "";
		
		System.out.print("Informe um numero:");
		h = Integer.parseInt(leitura.nextLine());
		
		msg = h > 23 ? "Hora inválida" : h < 0 ? "Hora inválida" : h < 6 ? "Boa "
		+ "madrugada" : h < 12 ? "Bom dia" : h < 18 ? "Boa tarde" : "Boa noite";
		
		System.out.println(msg);
	}
}
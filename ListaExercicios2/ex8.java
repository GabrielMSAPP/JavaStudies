'''Utilizando o operador ternário, faça um
programa que peça para o usuário informar
uma LETRA referente ao sexo dele (F para
feminino e M para masculino) e mostre uma
mensagem dizendo se o usuário é do sexo
masculino ou feminino'''

import java.util.Scanner;
public class ex8 {
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		String letra;
		
		
		System.out.print("Informe seu sexo (F/M) ");
		letra = leitura.nextLine();
		
		System.out.println(letra == "f" ? "Sexo feminino" : letra == "F" ? "Sexo feminino" : letra == "m" ? "Sexo masculino" : letra == "M" ? "Sexo masculino" : "Selecione uma letra correta!");  
		
	}
}
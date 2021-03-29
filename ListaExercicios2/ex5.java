'''Altere o programa feito no exercício 3.1 de forma
que caso o aluno fique de recuperação, o
programa leia a nota da avaliação final dele e
mostre se ele foi aprovado ou reprovado na
recuperação
Média mínima para prova final: 6'''

import java.util.Scanner;
public class ex5 {
	public static void main(String[] args)
	{
		Scanner leitura = new Scanner(System.in);
		int num;
		
		System.out.print("Informe um numero entre 0 e 23: ");
		num = Integer.parseInt(leitura.nextLine());
		
		
		if (num < 0 && num > 23 ){
			System.out.println("Digite um numero valido!!");
		}	else {
				if (num <= 6) {
					System.out.println("Boa madrugada!!");
				} else {
						if (num <= 12) {
							System.out.println("Bom dia!!");
						}	else {
								if (num <= 18) {
									System.out.println("Boa tarde!!");
								}	else {
										System.out.println("Boa noite!!");
								}
						}
				}
		}
	
	}
}
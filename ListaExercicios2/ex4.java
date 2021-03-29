'''Faça um programa que leia 2 notas do aluno,
calcule a média e diga se ele está aprovado,
reprovado ou de recuperação
• Menor que 4, reprovado
• A partir de 7, aprovado
• Entre 4 e 6.9, recuperação
'''
import java.util.Scanner;
public class ex4{
    public static void main(String[] args){
    Scanner leitura = new Scanner(System.in);

    double n1, n2, media, notaFinal;
    
    System.out.println("Informe sua nota: ");
    n1 = Double.parseDouble(leitura.nextLine());
    System.out.println("Informe sua nota: ");
    n2 = Double.parseDouble(leitura.nextLine());
    media = (n1+n2)/2;
    
    if (media < 4){
        System.out.println("Reprovado");
    }   else {
            if (media > 3 && media < 7){
                System.out.println("Recuperacao");
                System.out.println("Informe sua nota final: ");
                notaFinal = Double.parseDouble(leitura.nextLine());
                System.out.println(notaFinal > 5 ? "Aprovado na recuperacao" : "Reprovado na recuperacao");
            }else {
                System.out.println("Aprovado");
            }
        }
    }

}

'''Crie um programa em Java que leia o nome de um
aluno, 2 notas (referentes aos bimestres) e calcule a
média.
Mostre na tela:
– O nome do aluno
– Sua média final
– Se ele foi aprovado ou reprovado
O aluno é reprovado quando tira nota menor que 4'''

import java.util.Scanner;
public class ex1{
    public static void main(String[] args){
    Scanner leitura = new Scanner(System.in);
    
    String nome;
    double n1, n2, media;
    
    System.out.println("Informe seu nome: ");
    nome = leitura.nextLine();
    System.out.println("Informe sua nota: ");
    n1 = Double.parseDouble(leitura.nextLine());
    System.out.println("Informe sua nota: ");
    n2 = Double.parseDouble(leitura.nextLine());
    media = (n1+n2)/2;
    System.out.println("Seu nome e: " + nome);
    System.out.println("Sua media final: " + media);    
    System.out.print(media > 4? "Aprovado" : "Reprovado");

    }
}
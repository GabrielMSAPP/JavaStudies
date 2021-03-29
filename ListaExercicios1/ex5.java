'''Escreva um programa que, dadas as informações abaixo, calcule a
média final do aluno:
1º Bimestre
P1 valendo 60% da nota
T1 valendo 30% da nota
LE valendo 10% da nota
2º Bimestre
P2 valendo 50% da nota
T2 valendo 35% da nota
SE valendo 15% da nota'''

import java.security.PKCS12Attribute;
import java.util.Scanner;
public class ex5{
    public static void main(String[] args) {
    Scanner leitura = new Scanner(System.in);
    float p1, t1, le, p2, t2, se;

    System.out.println("Informe a p1: ");
    p1 = Float.parseFloat(leitura.nextLine()); 
    System.out.println("Informe a t1: ");
    t1 = Float.parseFloat(leitura.nextLine()); 
    System.out.println("Informe a le: ");
    le = Float.parseFloat(leitura.nextLine()); 
    System.out.println("Informe a p2: ");
    p2 = Float.parseFloat(leitura.nextLine()); 
    System.out.println("Informe a t2: ");
    t2 = Float.parseFloat(leitura.nextLine()); 
    System.out.println("Informe a se: ");
    se = Float.parseFloat(leitura.nextLine()); 
    
    System.out.println("a sua media e: " + (((p1*60/100) + (t1*30/100) + (le*10/100)) + ((p2*50/100) + (t2*35/100) + (se*15/100)))/2 );

    }
}
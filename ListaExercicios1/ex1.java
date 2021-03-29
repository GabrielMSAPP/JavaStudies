'''Faça um programa que calcule,
aproximadamente, quanto um fumante terá
gasto com cigarros em N anos.'''

import java.util.Scanner;
public class ex1{
    public static void main(String[] args) 
    {
        Scanner leitura = new Scanner(System.in);
        int num = 0;
        int ano = 0;
        
        System.out.println("Informe quantos cigarros voce fuma por dia: ");
        num = Integer.parseInt(leitura.nextLine()); 
        System.out.println("Informe quantos anos queira saber: ");
        ano = Integer.parseInt(leitura.nextLine());

        System.out.println("Em " + ano + " anos voce tera fumado " + ((ano*365)*num) + " cigarros");

    }
}
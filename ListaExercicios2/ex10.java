'''Faça um programa que leia um número inteiro
de 0 a 10 e mostre na tela o número por
extenso:'''

import java.util.Scanner;
public class ex10{
    public static void main(String[] args){
    Scanner leitura = new Scanner(System.in);
    int num;

    System.out.println("Informe um numero: ");
    num = Integer.parseInt(leitura.nextLine());
    
    switch(num){
        case 0:
        System.out.println("ZERO");
        break;
        
        case 1:
        System.out.println("UM");
        break;
        
        case 2:
        System.out.println("DOIS");
        break;
        
        case 3:
        System.out.println("TRES");
        break;
        
        case 4:
        System.out.println("QUATRO");
        break;
        
        case 5:
        System.out.println("CINCO");
        break;
        
        case 6:
        System.out.println("SEIS");
        break;
        
        case 7:
        System.out.println("SETE");
        break;
        
        case 8:
        System.out.println("OITO");
        break;
        
        case 9:
        System.out.println("NOVE");
        break;
        
        case 10:
        System.out.println("DEZ");
        break;

        default:
        System.out.println("ERRO! VALOR INSERIDO INVALIDO!");
        
    }
    }
}
'''Faça um programa que diga se o número
informado pelo usuário está entre 10 e 20 ou
não '''

import java.util.Scanner;
public class ex2{
    public static void main(String[] args){
    
    Scanner leitura = new Scanner(System.in);
    int num;

    System.out.print("Informe um numero: ");
    num = Integer.parseInt(leitura.nextLine());
    System.out.println(num >= 10 && num<=20 ? "Numero esta entre 10 e 20!!" : "Numero nao esta entre 10 e 20!!");
    }
}
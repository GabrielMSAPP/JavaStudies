'''Escreva um programa que solicite ao usuário
os dados necessários para se calcular o
perímetro em metros lineares e a área em
metros quadrados de um terreno retangular.
Realize estes cálculos e exiba os resultados
finais ao usuário.'''

import java.util.Scanner;
public class ex4{
    public static void main(String[] args) {
    Scanner leitura = new Scanner(System.in);
    float comp;
    float larg;
    
    System.out.println("Informe comprimento: ");
    comp = Float.parseFloat(leitura.nextLine()); 
    System.out.println("Informe largura: ");
    larg = Float.parseFloat(leitura.nextLine());
    
    System.out.println("o metro quadrado e: " + (comp*larg));
    System.out.println("o metro linear e: " + comp);
}
}
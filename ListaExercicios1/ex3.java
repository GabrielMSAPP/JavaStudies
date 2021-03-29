''' Escreva um programa que solicite ao usuário a
altura e o raio de um cilindro circular e
imprima seu volume.'''

import java.util.Scanner;
public class ex3{
    public static void main(String[] args) {
    Scanner leitura = new Scanner(System.in);
    float altura;
    float raio;
        
    System.out.println("Informe uma altura: ");
    altura = Float.parseFloat(leitura.nextLine());
    System.out.println("Informe um raio: ");
    raio = Float.parseFloat(leitura.nextLine());
    double a = Math.pow(raio, 2);
    System.out.println("Seu volume e: " + (3.14 * a * altura));

    }

}
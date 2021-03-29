import java.util.Scanner;
public class ex7{
    public static void main(String[] args) {
    Scanner leitura = new Scanner(System.in);
    float altura, raio;
        
    System.out.println("Informe uma altura: ");
    altura = Float.parseFloat(leitura.nextLine());
    System.out.println("Informe um raio: ");
    raio = Float.parseFloat(leitura.nextLine());
    double a = Math.pow(raio, 2);
    System.out.println("Seu volume e: " + (3.14 * a * altura));
    }

}
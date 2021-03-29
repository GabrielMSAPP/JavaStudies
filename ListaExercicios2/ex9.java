'''Leia o valor de um produto e mostre na tela as formas de
pagamento como abaixo:
– A) A vista: 10% de desconto
– B) 2 vezes: juros de 5%
– C) 3 vezes: juros de 10%
Peça para o usuário escolher uma opção e exiba o valor
final do produto
Em caso de parcelamento, mostre o valor total do produto
e o valor de cada parcela'''

import java.util.Scanner;
public class ex9{
    public static void main(String[] args){
    Scanner leitura = new Scanner(System.in);

    float produto;
    String opcao;
    
    System.out.println("Informe o valor do produto: ");
    produto = Float.parseFloat(leitura.nextLine());

    System.out.print("clsA - a vista: 10% de desconto\n" + 
                        "B - 2 vezes: juros de 5%\n" +
                        "C - 3 vezes: juros de 10%\n" +
                        "Selecione a opcao: ");
    opcao = leitura.nextLine();
    switch (opcao){
        case "A":
        System.out.print("O valor da compra e: R$" + (produto - (produto*10/100))); 
        break;

        case "B":
        System.out.print("O valor da compra e: R$" + (produto + (produto*5/100)));
        System.out.print("\n2x R$" + (produto + (produto*5/100))/2);
        break;

        case "C":
        System.out.print("O valor da compra e: R$" + (produto + (produto*10/100)));
        System.out.print("\n3x R$" + (produto + (produto*10/100))/3);
        break;

        default:
        System.out.println("ERRO! CARACTERE INVALIDO!");
    }

    }
}
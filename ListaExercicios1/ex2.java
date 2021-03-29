'''Faça um programa que calcule quantos anos,
meses, dias, minutos e segundos a pessoa já
viveu, aproximadamente, com base em seu
ano de nascimento.'''

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class ex2{
    public static void main(String[] args){
       Calendar calendario = GregorianCalendar.getInstance();
        Scanner leitura = new Scanner(System.in);
        int ano = 0;
        int anoAtual = calendario.get(Calendar.YEAR);
        System.out.println("Informe em que ano nasceu: ");
        ano = Integer.parseInt(leitura.nextLine());
        
        System.out.println("Voce ja viveu " + (anoAtual-ano) + " Anos\n" 
        + "voce ja viveu " + ((anoAtual - ano)*12) + " Meses\n" 
        + "Voce ja viveu " + ((anoAtual - ano)* 365) + " dias \n"
        + "Voce ja viveu " + ((anoAtual - ano)* 8640) + " Minutos\n"
        + "Voce ja viveu " + ((anoAtual - ano)* 518.400) + " Segundos");

    }
}
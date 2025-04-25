//Objetivo - converter uma temperatura em graus Celsius para Fahrenheit com usuario
package lista01;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos Graus Celsius está dando? ");
        double valor1 = sc.nextDouble();

        double resultado = (valor1 * 9 / 5) + 32;
        System.out.println("Está fazendo "+valor1+"ºC Graus Celsius ou "+resultado+"ºF-Fahrenheit");


        sc.close();
    }
}

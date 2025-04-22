//Escreva um programa que converta um valor em reais para
// dólares, euros e libras, com base em taxas de câmbio fornecidas pelo usuário.

package lista02;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Conversor de Moedas");

        double dollar = 5.807;
        double euro = 6.6845;
        double libras = 7.77;

        System.out.println("Informe um valor em Reais: ");
        double valor1 = sc.nextDouble();


        System.out.println(valor1 + " convertido em Dollar é = " + valor1 * dollar);
        System.out.println(valor1 + " convertido em Euro é = " + valor1 * euro);
        System.out.println(valor1 + " convertido em Libras é = " + valor1 * libras);


        sc.close();
    }
}

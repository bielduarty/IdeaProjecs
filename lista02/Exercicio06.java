//6º Cálculo de Média Geométrica:
//Escreva um programa que solicite ao usuário três números e calcule a média geométrica deles.

package lista02;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Cálculo de Média Geométrica");

        System.out.println("Informe o primeiro numero: ");
        double n1 = sc.nextDouble();

        System.out.println("Informe o segundo numero: ");
        double n2 = sc.nextDouble();

        System.out.println("Informe o terceiro numero: ");
        double n3 = sc.nextDouble();

        double resultado = n1 * n2 * n3;
        double media = resultado * 3 / 3;

        System.out.println("A média geométrica deles é "+media);


        sc.close();
    }
}

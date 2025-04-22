//5º Cálculo de Média Harmônica:
//Escreva um programa que solicite ao usuário três números e calcule a média harmônica deles.

package lista02;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cálculo de Média Harmônica");

        System.out.println("Informe um valor: ");
        double v1 = sc.nextDouble();

        System.out.println("Informe o segundo valor: ");
        double v2 = sc.nextDouble();

        System.out.println("Informe o terceiro valor: ");
        double v3 = sc.nextDouble();

        double mh = 3 / (1 / v1 + 1 / v2 + 1 / v3);

        System.out.println("A média harmônica é " + mh);
    }
}

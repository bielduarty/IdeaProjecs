// Objetivo calculo de soma com usuario
package lista01;

import java.util.Scanner;

public class Exercicio01{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        double valor1 = sc.nextDouble();

        System.out.println("Digite outro valor: ");
        double valor2 = sc.nextDouble();

        double resultado = valor1 + valor2;
        System.out.println("A soma do valor " +valor1+ " + " +valor2+ " = " +resultado);

        sc.close();
    }
}

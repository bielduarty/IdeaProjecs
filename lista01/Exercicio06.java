// Objetivo - Quadrado de um numero com usuario
package lista01;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("informe um numero inteiro: ");
        int valor1 = sc.nextInt();

        int resultado = valor1 * valor1;
        System.out.println("O valor ao quadrado de "+valor1+" é "+resultado);

        sc.close();
    }
}

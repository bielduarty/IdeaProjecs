//1 Verificação de Número Par ou Ímpar:
//Escreva um programa que solicite ao usuário um número inteiro e verifique se ele é par ou ímpar.
package lista04;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um numero inteiro: ");
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.print("Este numero é par.");
        } else {
            System.out.println("Este numero é impar");
        }

        sc.close();

    }
}

//10 Verificação de Triângulo Válido:
//Escreva um programa que solicite ao usuário os
//comprimentos dos três lados de um triângulo e verifique se eles formam um triângulo válido.
package lista04;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro lado: ");
        double lado1 = sc.nextDouble();

        System.out.print("Digite o segundo lado: ");
        double lado2 = sc.nextDouble();

        System.out.print("Digite o terceiro lado: ");
        double lado3 = sc.nextDouble();

        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            System.out.println("Os lados formam um triângulo válido!");
        } else {
            System.out.println("Os lados não formam um triângulo válido.");
        }

        sc.close();
    }
}
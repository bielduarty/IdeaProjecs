//Objetivo - Cálculo de Média Ponderada
//Escreva um programa que solicite ao usuário três notas e seus respectivos pesos e
// calcule a média ponderada dessas notas.


package lista02;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cálcule de Média Ponderada");

        System.out.println("Informe um valor inteiro: ");
        double valor1 = sc.nextDouble();

        System.out.println("Informe outro valor inteiro: ");
        double valor2 = sc.nextDouble();

        System.out.println("Informe o ultimo valor inteiro: ");
        double valor3 = sc.nextDouble();

        int peso1 = 2;
        int peso2 = 3;
        int peso3 = 5;

        double soma = (valor1 * peso1) + (valor2 * peso2) + (valor3 * peso3);
        int somaPesos = peso1 + peso2 + peso3;

        double mediaPondera = soma / somaPesos;

        System.out.println("A média ponderada desses três valores é " + mediaPondera);


        sc.close();
    }
}

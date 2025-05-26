//7 Verificação de Intervalo:
//Escreva um programa que solicite ao usuário um número e verifique se ele está no intervalo de 10 a 20 (inclusive).
package lista04;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        if (numero >= 10 && numero <= 20) {
            System.out.println("O número está no intervalo de 10 a 20.");
        } else {
            System.out.println("O número não está no intervalo de 10 a 20.");
        }

        sc.close();
    }
}
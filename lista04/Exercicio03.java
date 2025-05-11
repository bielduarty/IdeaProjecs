//3 Verificação de Nota:
//Escreva um programa que solicite ao usuário uma nota de 0 a 100 e exiba se ele foi aprovado (nota >= 60) ou reprovado.
package lista04;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe sua nota 0 a 100: ");
        int nota = sc.nextInt();

        if (nota >= 60) {
            System.out.println("Está aprovado!");
        } else {
            System.out.println("Está reprovado!");
        }


        sc.close();
    }
}

//8 Verificação de Divisibilidade:
//Escreva um programa que solicite ao usuário um número e verifique se ele é divisível por 3 e por 5.
package lista04;

import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();

        if (numero % 3 == 0 && numero % 5 == 0) {
            System.out.println("O número é divisível por 3 e por 5.");
        } else {
            System.out.println("O número não é divisível por 3 e por 5.");
        }

        sc.close();
    }
}

//4 Verificação de Sinal de Número:
//Escreva um programa que solicite ao usuário um número e verifique se ele é positivo, negativo ou zero.
package lista04;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um numero de 0 a 10: ");
        int numero = sc.nextInt();

        if (numero > 0) {
            System.out.printf("%d é numero positivo.\n", numero);
        } else if (numero < 0) {
            System.out.printf("%d é numero negativo.\n", numero);
        } else {
            System.out.println("é zero");
        }


        sc.close();
    }
}

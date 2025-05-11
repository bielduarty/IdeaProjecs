//5 Verificação de Ano Bissexto:
//Escreva um programa que solicite ao usuário um ano e verifique se ele é bissexto.
package lista04;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe algum ANO:");
        int ano = sc.nextInt();

        if (ano % 4 == 0 && ano % 100 != 0) {
            System.out.println("É bissexto");
        } else {
            if (ano % 400 == 0) {
                System.out.println("É bissexto");
            } else {
                System.out.println("Não é bissexto");
            }
        }


        sc.close();
    }
}

//6 Verificação de Maior Número:
//Escreva um programa que solicite ao usuário três números e verifique qual deles é o maior.
package lista04;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o primeiro numero inteiro:");
        int n1 = sc.nextInt();
        System.out.print("Informe o segundo numero inteiro:");
        int n2 = sc.nextInt();
        System.out.print("Informe o terceiro numero inteiro:");
        int n3 = sc.nextInt();

        if (n1 >= n2 && n1 >= n3) {
            System.out.print(n1 + " é o maior numero");
        } else if (n2 >= n1 && n2 >= n3) {
            System.out.print(n2 + " é o maior numero");
        } else {
            System.out.println(n3 + " é o maior numero");
        }


        sc.close();
    }

}

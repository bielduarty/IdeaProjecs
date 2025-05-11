//2 Verificação de Maioridade:
//Escreva um programa que solicite ao usuário sua idade e verifique se ele é maior de idade (18 anos ou mais).
package lista04;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a sua idade: ");
        int idade = sc.nextInt();

        if (idade >= 18)
        {
            System.out.println("Parabéns ja pode ser preso(a)!");
        } else{
            System.out.println("você ainda é menor de idade.");
        }


        sc.close();
    }
}
